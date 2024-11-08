package Internal.Command;

import Internal.Objects.Dish;
import Internal.Objects.Order;

public class AddDishCommand implements OrderCommand {
    private Order order;
    private Dish dish;

    public AddDishCommand(Order order, Dish dish) {
        this.order = order;
        this.dish = dish;
    }
    @Override
    public void execute() {
        order.addDish(dish);
    }
}
