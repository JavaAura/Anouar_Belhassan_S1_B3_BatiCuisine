package org.baticuisine.entities;

import org.baticuisine.enums.Etat;

public class Projet {
    private int id;
    private String nomProjet;
    private double surface;
    private double margeBeneficiaire;
    private double coutTotal;
    private Etat etatProjet;
    private Client client;
    public Projet(){}
    public Projet(int id,double surface, String nomProjet, double margeBeneficiaire, double coutTotal, Etat etatProjet) {
        this.id = id;
        this.nomProjet = nomProjet;
        this.surface=surface;
        this.margeBeneficiaire = margeBeneficiaire;
        this.coutTotal = coutTotal;
        this.etatProjet = etatProjet;
    }
    public Projet(String nomProjet, Client client, double surface) {
        this.nomProjet = nomProjet;
        this.client = client;
        this.surface = surface;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public double getMargeBeneficiaire() {
        return margeBeneficiaire;
    }

    public void setMargeBeneficiaire(double margeBeneficiaire) {
        this.margeBeneficiaire = margeBeneficiaire;
    }

    public double getCoutTotal() {
        return coutTotal;
    }

    public void setCoutTotal(double coutTotal) {
        this.coutTotal = coutTotal;
    }

    public Etat getEtatProjet() {
        return etatProjet;
    }

    public void setEtatProjet(Etat etatProjet) {
        this.etatProjet = etatProjet;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public String toString() {
        return "Projet{" +
                "id=" + id +
                ", nomProjet='" + nomProjet + '\'' +
                ", surface=" + surface +
                ", margeBeneficiaire=" + margeBeneficiaire +
                ", coutTotal=" + coutTotal +
                ", etatProjet=" + etatProjet +
                '}';
    }
}