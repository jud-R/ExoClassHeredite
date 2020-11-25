package com.company.Véhicules.Mécaniques;

import com.company.Véhicules.Vehicules;

public abstract class Mecaniques extends Vehicules {

  protected int puissanceMoteur;
  protected int nbRoues;

  public Mecaniques(String nom, String marque, int poids, int puissanceMoteur, int nbRoues) {
    super(nom, marque, poids);
    this.puissanceMoteur = puissanceMoteur;
    this.nbRoues = nbRoues;
  }

  public int getPuissanceMoteur() {
    return puissanceMoteur;
  }

  public void setPuissanceMoteur(int puissanceMoteur) {
    this.puissanceMoteur = puissanceMoteur;
  }

  public int getNbRoues() {
    return nbRoues;
  }

  public void setNbRoues(int nbRoues) {
    this.nbRoues = nbRoues;
  }


}
