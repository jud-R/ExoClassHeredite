package com.company.Courses.NonComestible.ProduitToxique;

import com.company.Courses.NonComestible.NonComestible;

public class ProduitToxique extends NonComestible {

  public ProduitToxique(String nom, double prix) {
    super(nom, prix);
  }

  public String acheter() {
    return super.acheter() + "C'est un produit dangereux.";
  }

}
