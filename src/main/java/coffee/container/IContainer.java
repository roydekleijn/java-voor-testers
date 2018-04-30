package coffee.container;

import coffee.domain.Portion;

public interface IContainer {

    boolean getPortion(Portion portion) throws NotEnoughException;

    int getCurrentVolume();

    int getTotalVolume();

    void refillContainer();

}