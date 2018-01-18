package lesson2.labs.prob2B;

import java.util.*;

public class Factory {
	
	private static int counter = 0;

	public static Order createOrder() {
		Order order = new Order(++counter, new ArrayList<OrderLine>());
		OrderLine orderLine = new OrderLine(order);
		order.addOrderLine(orderLine);
		return order;
	}
	
	public static void main(String[] args) {
		
		Order orderA = createOrder();
		List<OrderLine> orderlines = orderA.getOrderLines();
		System.out.println(orderlines.size()); // Should be at least 1

	}
}
