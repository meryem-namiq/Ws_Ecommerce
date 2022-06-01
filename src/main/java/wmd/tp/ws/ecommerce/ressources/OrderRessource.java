package wmd.tp.ws.ecommerce.ressources;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import wmd.tp.ws.ecommerce.service.*;
import wmd.tp.ws.ecommerce.model.*;

@Path("/orders")
public class OrderRessource {
	
	OrderManagementService orderManagementService = new OrderManagementService();
	
	@Get
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrders(){
		return orderManagementService.getOrders();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Order submitOrder(Order order) {
		return orderManagementService.submitOrder(order);
	}
	
	@PUT
	@Path("/{orderId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Order updateOrder(@PathParam("orderId") long id , Order order) {
		order.setId(id);
		return orderManagementService.updateOrder(order);
	}
	
	@GET
	@Path("/{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrderDetails(@PathParam("orderId") long id) {
		return orderManagementService.getOrderDetails(id);
	}

}
