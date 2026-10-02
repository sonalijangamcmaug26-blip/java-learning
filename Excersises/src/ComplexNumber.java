
import java.util.Scanner;
 class Complex {
    private int num1;
    private int num2;

    public int getNumber1(){
        return num1;
    }

    public void setNumber1(int num1){
            this.num1 = num1;  
    }
    
    public int getNumber2(){
        return num2;
    }

    public void setNumber2(int num2){
        this.num2 = num2;
    }

    public int computeComplexNumber() {
		return num1 * num2;
	}
}

public class ComplexNumber{
    public static void main(String[] args) {
        Complex[] arr = new Complex[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 complex number : ");

        for(int i = 0; i < 5; i++){
            arr[i] = new Complex();
            System.out.println("Enter the complex number " + (i + 1));
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i].setNumber1(num1);
			arr[i].setNumber2(num2);
		}

		for (int iTemp = 0; iTemp < 5; iTemp++) {
			System.out.println(arr[iTemp].computeComplexNumber());
		}

        }
    }


