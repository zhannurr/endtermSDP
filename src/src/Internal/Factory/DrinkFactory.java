package endtermSDP.Internal.Factory;
public class DrinkFactory {
    @Override
    public Dish createDish(String name, double price) {
        return new Dish(name, price, DishCategory.DRINK);
    }
}