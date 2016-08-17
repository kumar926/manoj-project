/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

public class Address {

private String city; 

private String state; 

private int zip; 

public Address() { 

this.city = "Fremont";

this.state = "CA"; 

this.zip = 95145; 

} 
// constructor with passing aurgments and specied city, state and zip
Address(String city, String state, int zip) { 

this.city = city; 

this.state = state; 

this.zip = zip; 

} 
//get and set method's for city
public String getCity() { 

return city; 

} 

public void setCity(String city) { 

this.city = city; 

} 
//get and set method's for state
public String getState() { 

return state; 

} 

public void setState(String state) { 

this.state = state; 

} 

//get and set methods for zip 
public int getZip() { 

return zip; 

} 

public void setZip(int zip) { 

this.zip = zip; 

}

}
