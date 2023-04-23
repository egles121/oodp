package com.example.oodp.factoryPattern.model;

import com.example.oodp.factoryPattern.Burger;

public class Veggieburger implements Burger {

  @Override
  public String getDescription() {
    return "Veggieburger";
  }

  @Override
  public double getCost() {
    return 6.99;
  }
}
