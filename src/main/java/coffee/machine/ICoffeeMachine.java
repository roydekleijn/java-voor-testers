package coffee.machine;

import coffee.container.IContainer;
import coffee.container.NotEnoughException;
import coffee.domain.Portion;

public interface ICoffeeMachine {

    boolean makeCoffee(Portion portion) throws NotEnoughException;

    IContainer getCoffeeContainer();

    IContainer getWaterContainer();

}