package com.company.Animaux.Poisson;

import com.company.Animaux.Animaux;
import com.company.Animaux.Vivre;

public class Poisson extends Animaux implements Vivre {

  protected int nageoires;

  public Poisson(String nom, int nageoires) {
    super(nom);
    this.nageoires = nageoires;
  }

  public int getNageoires() {
    return nageoires;
  }

  public void setNageoires(int nageoires) {
    this.nageoires = nageoires;
  }

  public String avance() {
    return "C'est un " + nom + " il nage et possède " + nageoires + " nageoires. ";
  }
}
