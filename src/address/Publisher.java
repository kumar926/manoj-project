/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author manoj
 */
public class Publisher {
    
private String name;

private String email; 

private Address aObj; 

//creating a deafult constructor with out passing aurgments
public Publisher() { 

this.name = "Alex";

this.email = "alex@gmail.com"; 

this.aObj = new Address("San Jose", "CA", 95134); 

} 
//creating a constructor with soecied values
Publisher(String name,String email,String city,String state,int zip){ 

this.name=name; 

this.email=email; 

this.aObj = new Address(city, state, zip); 

} 

Publisher(String name,String email,Address aObj1){ 

this.name=name; 

this.email=email; 

this.aObj = aObj1;

} 
//get and set methods for name
public String getName() { 

return name; 

} 

public void setName(String name) { 

this.name = name; 

} 

public String getEmail() { 

return email; 

} 
//get and set method's for email
public void setEmail(String email) { 

this.email = email; 

} 
//get and set method's for object data type
public Address getAObj() { 

return aObj; 

}

public void setAobj(Address aObj) {

this.aObj = aObj; 

}

}
