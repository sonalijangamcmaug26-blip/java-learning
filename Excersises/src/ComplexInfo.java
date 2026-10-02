/*Print the sum, difference and product of two complex numbers by creating a 
class named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user */
import java.util.*;
class ComplexNumbers{

    private int real;
    private int img;

   

    public int getReal(){
        return real;
    }

    public int getImg(){
        return img;
    }

    ComplexNumbers(int real, int img){
        this.real = real;
        this.img = img;
    }

    public void add(ComplexNumbers c){
        System.out.println("Addition is : " + ((this.real + c.getReal()) + (this.img + c.getImg())));
    }

    public void sub(ComplexNumbers c){
        System.out.println("subtraction is : " + ((this.real - c.getReal()) + (this.img - c.getImg())));
    }

    public void multi(ComplexNumbers c){
        System.out.println("multiplication is : " + ((this.real * c.getReal()) + (this.img * c.getImg())));
    }

    public void display(ComplexNumbers c){
        add(c);
        sub(c);
        multi(c);
    }
}

public class ComplexInfo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter real and imaginary number 1 :");
        int real = sc.nextInt();
        int img = sc.nextInt();
        ComplexNumbers c = new ComplexNumbers(real, img);
        
        System.out.print("enter real and imaginary number 2 : ");
        real = sc.nextInt();
        img = sc.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(real, img);
        c1.display(c);
        sc.close();

        
    }
}