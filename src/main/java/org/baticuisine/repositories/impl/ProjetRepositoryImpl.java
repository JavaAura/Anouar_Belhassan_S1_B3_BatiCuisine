package org.baticuisine.repositories.impl;


import org.baticuisine.dao.ProjetDAO;

import org.baticuisine.dao.impl.ProjetDAOImpl;
import org.baticuisine.entities.Client;
import org.baticuisine.entities.Projet;
import org.baticuisine.enums.Etat;
import org.baticuisine.repositories.ProjetRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjetRepositoryImpl implements ProjetRepository {
    private ProjetDAO projetDAO;
    private Map<String, Projet> projetMap = new HashMap<>();

    {
        projetDAO = new ProjetDAOImpl();
        loadAllProjet();
    }

    @Override
    public void save(Projet projet) {
        if(projet != null) {
            projetDAO.addClient(projet);
            projetMap.put(projet.getNomProjet(), projet);
        }
    }

    @Override
    public List<Projet> findAll() {
      return projetDAO.getAllProjects();
    }

    private void loadAllProjet() {
        List<Projet> projets = projetDAO.getAllProjects();
        for (Projet projet : projets) {
            projetMap.put(projet.getNomProjet(), projet);
        }
    }

    @Override
    public void updateProject(int projectId, double coutTotal, double margeBeneficiaire) {
        projetDAO.updateProject( projectId,coutTotal,margeBeneficiaire);
    }

    @Override
    public void updateEtatProject(int projectId, Etat etat) {
        projetDAO.updateEtatProject(projectId,etat);
    }


}
