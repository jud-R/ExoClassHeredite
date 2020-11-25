package com.company.Animaux.Herbivore;

import com.company.Animaux.Animaux;

public class Herbivore extends Animaux {

  protected String nourriture = "végétation";

  public Herbivore(String nom) {
    super(nom);
  }

  public String getNourriture() {
    return nourriture;
  }

  public void mange() {
    System.out.println("C'est un " + nom + " il broute et mange de la " + nourriture);
  }

}
