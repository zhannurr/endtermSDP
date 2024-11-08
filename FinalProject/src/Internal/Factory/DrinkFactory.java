package Internal.Factory;

import Internal.Objects.Dish;
import Internal.Objects.DishCategory;

public class DrinkFactory extends DishFactory {
    @Override
    public Dish createDish(String name, double price) {
        return new Dish(name, price, DishCategory.DRINK);
    }
}
