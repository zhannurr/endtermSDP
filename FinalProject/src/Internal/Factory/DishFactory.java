package Internal.Factory;

import Internal.Objects.Dish;

public abstract class DishFactory {
    public abstract Dish createDish(String name, double price);
}
