// import java.io.*;
// import java.util.*;

// public class solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         Set <Integer> num = new HashSet<>();
//         for(int i = 0; i< N ; i++){
//             num.add(sc.nextInt());
//         }
//         System.out.println("Unique count : " + num);
//         sc.close();
//     }
// }
// ===================================================================================================

// import java.io.*;
// import java.util.*;
// class Author{
//     private String name;
//     private String email;
//     private char gender;
    
//     public Author(String name, String email, char gender){
//         this.name = name;
//         this.email = email;
//         this.gender = gender;
//     } 
//     public String getName(){
//         return name;
//     }
//      public String getEmial(){
//         return email;
//      }
//      public char getGender(){
//         return gender;
//       } 
// }
    



// class Book  {
//     private String name;
//     private double price;
//     private int qtyInStock;
//     private Author author;
    
//       public Book(String name, Author author, double price, int qtyInStock) {
//         this.name = name;
//         this.author = author;
//         this.price = price;
//         this.qtyInStock = qtyInStock;
//     }

   
   
//     public String getName(){
//         return name;
//     }
//     public double getPrice(){
//         return price;
//     }
//     public double setPrice(double price){
//         return this.price = price;
//     }
//     public int getQtyInStock(){
//         return qtyInStock;
//     }
//     public int setQtyInStock(int qtyInStock){
//         return this.qtyInStock = qtyInStock;
//     }
    
//     public Author getAuthor() {
//         return author;
//     }
// }

// public class solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // getting author details
//         String authorName = sc.next();
//         String authorEmail = sc.next();
//         char authorGender = sc.next().charAt(0);
        
//         // Creating author obj
//         Author author = new Author(authorName, authorEmail, authorGender);
        
//         // getting book details
//         String bookName = sc.next();
//         double bookPrice = sc.nextDouble();
//         int bookQtyInStock = sc.nextInt();
        
//         // creating book obj
//         Book book = new Book(bookName, author, bookPrice, bookQtyInStock);
        
//         // printing details
//         System.out.print("Book Name: " + book.getName());
//         System.out.print("Price: " + (int) book.getPrice());
//         System.out.print("Qunatity: " + book.getQtyInStock());
//         System.out.print("Author Name: " + book.getAuthor().getName());
//         System.out.print("Auhtor Email: " + author.getEmial());
//         System.out.print("Auhtor Gender: " + author.getGender());
//         sc.close();      
//     }
// }
// ===================================================================================================

import java.io.*;
import java.util.*;


class Person{
     protected String name;
}


class Employee extends Person{
   private double annualSalary;
   private int yearStarted;
    private String insuranceNumber;
    
    Employee(double annualSalary, int yearStarted, String  insuranceNumber, String name){
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
        this.name = name;
    }
    
    public double getAnnualSalary(){
        return annualSalary;
    }
    public int getYearStarted(){
        return yearStarted;
    }
    public String InsuranceNumber(){
        return insuranceNumber;
    }
    
    public String getName(){
        return name;
    }
    
    
}



public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double annualSalary = sc.nextDouble();
        int yearStarted = sc.nextInt();
        String insuranceNumber = sc.next();
        Employee e = new Employee(annualSalary, yearStarted,  insuranceNumber, name);
            System.out.println("Name: " + e.getName());
            System.out.println("Salary: " + (int) e.getAnnualSalary());
            System.out.println("Year Started: " + e.getYearStarted());
            System.out.println("Insurance Number: " + e.InsuranceNumber());
            sc.close();
            
        
    }
}

