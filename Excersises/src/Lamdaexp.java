// @FunctionalInterface
// /**
//  * InnerLamdaexp
//  */
// interface A {
//     void show();
// }
// // class B implements A{
// //     public void show(){
// //         System.out.print("learning interface");
// //     }
// // }
// public class Lamdaexp {
//     public static void main(String[] args) {
//         A obj = () -> System.out.print("hello lambda exp");
//         obj.show();
//     }
// }
/*A FUCNTIONAL INTERFACE CAN ONLY HAVE ONE METHOD 
IN THE EXAMPLE AS ONLY ONE STATEMNET WERE TO PRINT THUS LOSING CURLY BRACES IS FINE AND WE CAN WRITE THE WHOLE STATMENT IN ONE LINE
LAMDA EXP MAKES THE CODE LOOK MORE PRECISE AND NEAT IT ONLY WORK WITH FUCNTIONAL INTERFACE */
// =========================================================================================================================

/* HERE LETS TRY LAMDA EXP FOR AN INTERFACE WITH RETURING SOME VALUE METHOD */

@FunctionalInterface 

interface A{
    int add(int i, int j);
}

public class Lamdaexp{
    public static void main(String[] args) {
        A obj = (i,j) -> i+j;          // A obj = new A(){ public int add(int i, int j) { return i+j }
        int result = obj.add(9, 8);
        System.out.print(result);
    }
}