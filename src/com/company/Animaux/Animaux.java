package com.company.Animaux;

public abstract class Animaux {

  protected String nom;

  protected Animaux(String nom) {
    this.nom = nom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }
}
