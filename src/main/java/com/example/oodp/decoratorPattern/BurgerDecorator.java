package com.example.oodp.decoratorPattern;

import com.example.oodp.factoryPattern.Burger;

public interface BurgerDecorator extends Burger {

  @Override
  String getDescription();

  @Override
  double getCost();
}
