package com.company.Courses;

public abstract class Courses {

  protected double prix;
  protected String nom;

  public Courses(String nom, double prix) {
    this.nom = nom;
    this.prix = prix;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public double getPrix() {
    return prix;
  }

  public void setPrix() {
    this.prix = prix;
  }

  protected String acheter() {
    return "Ce produit " + nom + " peut être acheter. ";
  }
}
