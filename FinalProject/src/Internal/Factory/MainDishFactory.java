package Internal.Factory;

import Internal.Objects.Dish;
import Internal.Objects.DishCategory;

public class MainDishFactory extends DishFactory {
    @Override
    public Dish createDish(String name, double price) {
        return new Dish(name, price, DishCategory.MAIN_COURSE);
    }
}
