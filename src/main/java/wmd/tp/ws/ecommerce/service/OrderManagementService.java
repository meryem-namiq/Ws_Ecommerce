package wmd.tp.ws.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import wmd.tp.ws.ecommerce.model.Order;
import wmd.tp.ws.ecommerce.repository.Repository;

public class OrderManagementService {
	
	private Map<Long , Order> orders = Repository.getOrders();
	
	public List<Order>  getOrders(){
		return new ArrayList<Order>(orders.values());
		
	}
	
	public Order getOrderDetails(long orderId) {
		return orders.get(orderId);
	}
	
	public Order updateOrder(Order order) {
		orders.put(order.getId(), order);
		return order;
	}
	
	public Order cancelOrder(long orderId) {
		return orders.remove(orderId);
	}

}
