package Internal.Command;

import Internal.Objects.Dish;
import Internal.Objects.Order;

public class RemoveDishCommand implements OrderCommand {
    private Order order;
    private Dish dish;

    public RemoveDishCommand(Order order, Dish dish) {
        this.order = order;
        this.dish = dish;
    }

    @Override
    public void execute() {
        order.removeDish(dish);
    }
}
