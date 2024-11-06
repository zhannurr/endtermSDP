package endtermSDP.Internal.Factory;

public class MainDishFactory {
    @Override
    public Dish createDish(String name, double price) {
        Object Category;
        return new Dish(name, price, DishCategory.MAIN_COURSE);
    }
}