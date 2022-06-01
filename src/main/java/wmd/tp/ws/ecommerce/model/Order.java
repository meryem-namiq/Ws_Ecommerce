package wmd.tp.ws.ecommerce.model;

import java.util.Date;

@XmlRootElement
@JsonbPropertyOrder({"id","customer","orderDate","items"})
public class Order {
	
	private long id;
	private Customer customer;
	private Date orderDate;
	
	
	public Order() {
		super();
	}


	public Order(long id, Customer customer, Date orderDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.orderDate = orderDate;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
	

}

