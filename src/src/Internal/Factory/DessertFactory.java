package endtermSDP.Internal.Factory;

public class DessertFactory extends DishFactory {
    @Override
    public Dish createDish(String name, double price) {
        return new Dish(name, price, DishCategory.DESSERT);
    }
}
