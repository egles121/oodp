package com.example.oodp.factoryPattern.model;

import com.example.oodp.factoryPattern.Burger;
import com.example.oodp.factoryPattern.BurgerFactory;

public class VeggieburgerFactory extends BurgerFactory {

  @Override
  public Burger createBurger() {
    return new Veggieburger();
  }
}
