package com.example.oodp;

import com.example.oodp.compositePattern.OrderScreenImpl;
import com.example.oodp.decoratorPattern.FriesDecorator;
import com.example.oodp.statePattern.Order;
import com.example.oodp.templatePattern.BurgerMaker;
import com.example.oodp.templatePattern.CheeseburgerMaker;
import com.example.oodp.templatePattern.VeggieburgerMaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OodpApplication {

  public static void main(String[] args) {
    SpringApplication.run(OodpApplication.class, args);

    BurgerMaker cheeseburgerMaker = new CheeseburgerMaker();
    Order order = new Order(cheeseburgerMaker);
    OrderScreenImpl orderScreen = new OrderScreenImpl();
    orderScreen.addOrderToScreen(order);
    orderScreen.addOrderToScreen(cheeseburgerMaker);
    orderScreen.printOrderAndStatus();
    order.makeOrder();
    orderScreen.removeOrderFromScreen(order);
    orderScreen.removeOrderFromScreen(cheeseburgerMaker);

    System.out.println("------------------------------------------------------------------");
    Order order2 = new Order(cheeseburgerMaker);
    order2.setBurgerDecorator(new FriesDecorator(cheeseburgerMaker.createBurger().createBurger()));
    orderScreen.addOrderToScreen(order2);
    orderScreen.addOrderToScreen(cheeseburgerMaker);
    orderScreen.printOrderAndStatus();
    order2.makeOrder();
    orderScreen.removeOrderFromScreen(order2);
    orderScreen.removeOrderFromScreen(cheeseburgerMaker);

    System.out.println("------------------------------------------------------------------");
    BurgerMaker veggieBurgerMaker = new VeggieburgerMaker();
    Order order3 = new Order(veggieBurgerMaker);
    orderScreen.addOrderToScreen(order3);
    orderScreen.addOrderToScreen(veggieBurgerMaker);
    orderScreen.printOrderAndStatus();
    order3.makeOrder();
    orderScreen.removeOrderFromScreen(order3);
    orderScreen.removeOrderFromScreen(veggieBurgerMaker);

    System.out.println("------------------------------------------------------------------");
    Order order4 = new Order(veggieBurgerMaker);
    order4.setBurgerDecorator(new FriesDecorator(veggieBurgerMaker.createBurger().createBurger()));
    orderScreen.addOrderToScreen(order4);
    orderScreen.addOrderToScreen(veggieBurgerMaker);
    orderScreen.printOrderAndStatus();
    order4.makeOrder();
  }
}
