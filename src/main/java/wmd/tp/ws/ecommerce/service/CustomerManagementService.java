package wmd.tp.ws.ecommerce.service;

import java.util.*;

import wmd.tp.ws.ecommerce.model.Order;
import wmd.tp.ws.ecommerce.repository.Repository;

public class CustomerManagementService {
	
	private Map<Long , Order> orders = Repository.getOrders();
	
	public List<Order> getOrders(){
		return new ArrayList<Order>(orders.values());
	}
	
	public Order getOrderDetails(long orderId) {
		return orders.get(orderId);
	}
	
	public List<Order> getOrdersForCustomer(long customerId){
		
	}
	
	public Order updateOrder(Order order) {
		orders.put(order.getId(), order);
		return order;
	}
	
	public Order cancelOrder(long orderId) {
		return orders.remove(orderId);
	}
	
	
	

}

