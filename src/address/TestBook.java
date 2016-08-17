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
public class TestBook {
    

public static void main(String[] args) {

Address a1=new Address();

Address a2=new Address("Santa Clara","CA",98245);

System.out.println("Objects of address a1 :");

System.out.println(a1.getCity());

System.out.println(a1.getState());

System.out.println(a1.getZip());

System.out.println("Objects of address a2 :");

System.out.println(a2.getCity());

System.out.println(a2.getState());

System.out.println(a2.getZip());

Publisher p1=new Publisher();

Publisher p2=new 

Publisher("Ken","ken@gmail.com",a2.getCity(),a2.getState(),a2.getZip());

System.out.println("Object of publisher p1: ");

System.out.println(p1.getName());

System.out.println(p1.getEmail());

System.out.println(p1.getAObj().getCity());

System.out.println(p1.getAObj().getState());

System.out.println(p1.getAObj().getZip());

System.out.println("Object of publisher p2: ");

System.out.println(p2.getName());

System.out.println(p2.getEmail());

System.out.println(p2.getAObj().getCity());

System.out.println(p2.getAObj().getState());

System.out.println(p2.getAObj().getZip());

Book b1=new Book();

Book b2=new Book("Ranga","IS3456",p1.getName(),p1.getEmail(), 

p1.getAObj().getCity(),p1.getAObj().getState(),

p1.getAObj().getZip());

Book b3=new Book("Samson","IS3434","ken","ken@gmail.com", "Santa Clara","CA",98245);

System.out.println("Displaying values of b1 object: ");

System.out.println(b1.getAuthor());

System.out.println(b1.getIsbn());

System.out.println(b1.getpObj().getName());

System.out.println(b1.getpObj().getEmail());

System.out.println(b1.getpObj().getAObj().getCity());

System.out.println(b1.getpObj().getAObj().getState());

System.out.println(b1.getpObj().getAObj().getZip());

System.out.println("Displaying values of b2 object: ");

System.out.println(b2.getAuthor());

System.out.println(b2.getIsbn());

System.out.println(b2.getpObj().getName());

System.out.println(b2.getpObj().getEmail());

System.out.println(b2.getpObj().getAObj().getCity());

System.out.println(b2.getpObj().getAObj().getState());

System.out.println(b2.getpObj().getAObj().getZip());

System.out.println("Displaying values of b3 object: ");

System.out.println(b3.getAuthor());

System.out.println(b3.getIsbn());

System.out.println(b3.getpObj().getName());

System.out.println(b3.getpObj().getEmail());

System.out.println(b3.getpObj().getAObj().getCity());

System.out.println(b3.getpObj().getAObj().getState());

System.out.println(b3.getpObj().getAObj().getZip());

b3.setAuthor("Madge");

b3.setIsbn("IS567");

b3.getpObj().setName("zang");

b3.getpObj().setEmail("zang@gmail.com");

b3.getpObj().getAObj().setCity("SFO");

b3.getpObj().getAObj().setState("CA");

b3.getpObj().getAObj().setZip(98765);

System.out.println("Displaying values of b3 object after set values: ");

System.out.println(b3.getAuthor());

System.out.println(b3.getIsbn());

System.out.println(b3.getpObj().getName());

System.out.println(b3.getpObj().getEmail());

System.out.println(b3.getpObj().getAObj().getCity());

System.out.println(b3.getpObj().getAObj().getState());

System.out.println(b3.getpObj().getAObj().getZip());

}

}