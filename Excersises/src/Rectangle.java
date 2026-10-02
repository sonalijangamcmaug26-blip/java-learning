/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
respectively by creating a class named 'Rectangle' with a method named 'area' 
which returns the area and length and breadth passed as parameters to its 
constructor */

 class RectangleSides {
    private int length;
    private int breadth;

    RectangleSides(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        
    }


    // public int getLength(){
    //     return length;
    // }

    // public int setLength(int length){
    //     return length;
    // }

    // public int getBreadth(){
    //     return breadth;
    // }

    // public int setBreadth(int breadth){
    //     return breadth;
    
  
    public int displayArea(){
        return length * breadth;
    }
}

public class Rectangle {

    public static void main(String[] args) {
        RectangleSides rect1 = new RectangleSides(4,5);
        System.out.println(rect1.displayArea());

        RectangleSides rect2 = new RectangleSides(5, 8);
        System.out.println(rect2.displayArea());
    }
}
