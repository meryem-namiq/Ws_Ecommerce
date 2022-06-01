package wmd.tp.ws.ecommerce.repository;

import java.util.*;
import wmd.tp.ws.ecommerce.model.*;

public class Repository {

    private static Map<Long, Order> orders = new HashMap<>();
    private static Map<Long, Customer> customers = new HashMap<>();

    public static Map<Long, Order> getOrders(){
        return orders;
    }
    
    public static Map<Long, Customer> getCustomers(){
        return customers;
    }

}
