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

  protected abstract void mange();

  public void avance() {
    System.out.println("C'est un " + nom + " il peu avancer.");
  }

}
