package com.company.Animaux.Mammiferes;

import com.company.Animaux.Animaux;
import com.company.Animaux.Vivre;

public class Mammiferes extends Animaux implements Vivre {

  protected int nbPattes = 4;

  public Mammiferes(String nom) {
    super(nom);
  }

  public int getNbPattes() {
    return nbPattes;
  }

  public String avance() {
    return "C'est un " + nom + " il marche et a " + nbPattes + "pattes. ";
  }
}
