import java.util.*;

public class largestnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter size of ur array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        int max = a[0];
        int secondmax = a[0];


            System.err.println( " enter your array : ");
                for(int i = 0; i < size; i++){
                     a[i] = sc.nextInt();
                }


        Arrays.sort(a);
        System.out.println(" max is : " + a[a.length - 1]);
        System.err.println("secondmax is: " + a[a.length - 2]);

        // for(int i =0; i < a.length; i++ ){
        //     a[i] = sc.nextInt();
        //     if( a[i] > max){
        //         secondmax = max;
        //         max = a[i];
        //     }
        // }
        // System.out.println(" max is : " + max + " " + " secondmax : " + secondmax);

    }
}
