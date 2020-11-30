package com.company.Animaux.Volant;

import com.company.Animaux.Animaux;
import com.company.Animaux.Vivre;

public class Volatiles extends Animaux implements Vivre {

  protected int nbAiles;

  public Volatiles(String nom, int nbAiles) {
    super(nom);
    this.nbAiles = nbAiles;
  }

  public int getNbAiles() {
    return nbAiles;
  }

  public void setNbAiles() {
    this.nbAiles = nbAiles;
  }

  public String avance() {
    return "C'est un " + nom + " il vole est possède " + nbAiles + " ailes. ";
  }
}
