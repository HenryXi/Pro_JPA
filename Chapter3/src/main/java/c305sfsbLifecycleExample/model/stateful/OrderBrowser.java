package c305sfsbLifecycleExample.model.stateful;

import c305sfsbLifecycleExample.model.Order;

import java.util.Collection;

public interface OrderBrowser {
    public Collection<Order> listOrders();
}

