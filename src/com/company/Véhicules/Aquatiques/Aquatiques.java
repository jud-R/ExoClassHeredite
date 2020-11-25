package com.company.Véhicules.Aquatiques;

import com.company.Véhicules.Vehicules;

public class Aquatiques extends Vehicules {

  protected int nbMat;

  public Aquatiques(String nom, String marque, int poids, int nbMat) {
    super(nom, marque, poids);
    this.nbMat = nbMat;
  }

  public int getNbMat() {
    return nbMat;
  }

  public void setNbMat(int nbMat) {
    this.nbMat = nbMat;
  }

  public void avance() {
    System.out.println("C'est un " + this.nom + " de marque " + this.marque + " pèse " + this.poids
        + " kg et possède " + nbMat + " mats. Il flotte.");
  }
}
