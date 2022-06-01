package wmd.tp.ws.ecommerce.model;

import javax.json.bind.ammotation.JsonbPropertyOrder;

@JsonPropertyOrder({"id","firstName","lastName","address"})
public class Customer {

    private long id;
    private String fistName;
    private String lastName;
    private String address;

    
    public Customer(){}
    
    public Costomer(long id,String firstName,String lastName,String address){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(){
        this.address=address;
    }
    
    
        

    






}
