package com.company.Courses.NonComestible;

import com.company.Courses.Courses;

public class NonComestible extends Courses {

  public NonComestible(String nom, double prix) {
    super(nom, prix);
  }

  public String acheter() {
    return super.acheter() + "Il ne se mange pas. ";
  }

}
