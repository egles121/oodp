package com.example.oodp.templatePattern;

import com.example.oodp.compositePattern.OrderScreen;
import com.example.oodp.factoryPattern.Burger;
import com.example.oodp.factoryPattern.BurgerFactory;

public abstract class BurgerMaker implements OrderScreen {

  public abstract BurgerFactory createBurger();

  public abstract void cookIngredients(Burger burger);

  public abstract void assembleBurger(Burger burger);

  public abstract void packageBurger(Burger burger);

  public final Burger makeBurger() {
    BurgerFactory burgerFactory = createBurger();
    Burger burger = burgerFactory.createBurger();
    cookIngredients(burger);
    assembleBurger(burger);
    packageBurger(burger);
    return burger;
  }
}
