package com.company.Véhicules.Mécaniques.Volants;

import com.company.Véhicules.Mécaniques.Mecaniques;

public class Volant extends Mecaniques {

  int helices;

  public Volant(String nom, String marque, int poids, int puissanceMoteur, int nbRoues,
      int helices) {
    super(nom, marque, poids, puissanceMoteur, nbRoues);
    this.helices = helices;
  }

  public void avance() {
    System.out.println(
        "C'est un " + nom + " de marque " + marque + ". Il pèse " + poids
            + " kg, à une puissance de moteur de "
            + puissanceMoteur + " ch, " + nbRoues + " roues et " + helices + " hélices. Et il vole.");
  }

  public int getHelices() {
    return helices;
  }

  public void setHelices(int helices) {
    this.helices = helices;
  }
}
