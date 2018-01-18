package lesson2.labs.prob2B;

import java.util.*;

public class Order {
	int orderNum;
	List<OrderLine> orderLines;
	
	public Order(int orderNum, List<OrderLine> orderLines) {
		this.orderNum = orderNum;
		this.orderLines = orderLines;
	}

	public void addOrderLine(OrderLine orderLine) {
		this.orderLines.add(orderLine);
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
}
