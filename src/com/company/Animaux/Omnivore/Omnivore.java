package com.company.Animaux.Omnivore;

import com.company.Animaux.Animaux;

public class Omnivore extends Animaux {

  public Omnivore(String nom) {
    super(nom);
  }

  public void mange() {
    System.out.println("C'est un " + nom + " il mange de tout.");
  }

}
