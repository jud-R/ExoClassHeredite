package com.company.Animaux.Volant.Insectes;

import com.company.Animaux.Volant.Volatiles;

public class Insectes extends Volatiles {

  protected int nbAntennes;

  public Insectes(String nom, int nbAiles, int nbAntennes) {
    super(nom, nbAiles);
    this.nbAntennes = nbAntennes;
  }

  public int getNbAntennes() {
    return nbAntennes;
  }

  public void setNbAntennes(int nbAntennes) {
    this.nbAntennes = nbAntennes;
  }

  public String avance() {
    return super.avance() + "Et " + nbAntennes + " antennes.";
  }

}
