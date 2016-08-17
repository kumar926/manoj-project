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
public class Book {
    
private String author; 

private String isbn; 

private Publisher pObj = null;

//deafult constructor
public Book() { 

this.author = "Chang"; 

this.isbn = "IS1234"; 

this.pObj = new Publisher(); 

}
//constructor with specified values
public Book(String author, String isbn, String name, String email, String city, 

String state, int zip) { 

this.author = author; 

this.isbn = isbn; 

this.pObj = new Publisher(name, email, city, state, zip); 

}

Book(String author, String isbn, Publisher pObj1) { 

this.author = author; 

this.isbn = isbn; 

this.pObj = pObj1; 

}
//get and set methods for author
public String getAuthor() { 

return author; 

}

public void setAuthor(String author) { 

this.author = author; 

}
//get and set method's for isbn
public String getIsbn() { 

return isbn; 

}

public void setIsbn(String isbn) { 

this.isbn = isbn; 

}
//get and set method's for object
public Publisher getpObj() { 

return pObj; 

}

public void setpObj(Publisher pObj) { 

this.pObj = pObj; 

} 

}
