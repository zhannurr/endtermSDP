package endtermSDP.Internal.Factory;

public class SnackFactory {
    @Override
    public Dish createDish(String name, double price) {
        return new Dish(name, price, DishCategory.SNACK);
    }
}