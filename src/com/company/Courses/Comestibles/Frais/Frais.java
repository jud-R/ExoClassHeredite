package com.company.Courses.Comestibles.Frais;

import com.company.Courses.Comestibles.Comestible;

public class Frais extends Comestible {

  public Frais(String nom, double prix) {
    super(nom, prix);
  }

  public String acheter() {
    return super.acheter();
  }

  public String frigo() {
    return "Ce produit va au frigo. ";
  }


}
