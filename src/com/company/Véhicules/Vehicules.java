package com.company.Véhicules;

public abstract class Vehicules {

  protected String nom;
  protected String marque;
  protected int poids;

  public Vehicules(String nom, String marque, int poids) {
    this.nom = nom;
    this.marque = marque;
    this.poids = poids;
  }

  public int getPoids() {
    return poids;
  }

  public void setPoids(int poids) {
    this.poids = poids;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  protected abstract void avance();
}
