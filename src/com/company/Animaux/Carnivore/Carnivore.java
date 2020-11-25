package com.company.Animaux.Carnivore;

import com.company.Animaux.Animaux;

public class Carnivore extends Animaux {

 protected String nourriture = "viande";

  public Carnivore(String nom) {
    super(nom);
  }

  public String getNourriture() {
    return nourriture;
  }


  public void mange() {
    System.out.println("C'est un " + nom + " il chasse et mange de la " + nourriture);
  }
}
