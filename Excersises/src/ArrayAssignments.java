import java.util.Scanner;
public class ArrayAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("your size is " + size);

        int arr[] = new int[size];

        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("your array is : " );
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");


        Question2(arr, size);
        Question3(arr, size);
        Question4(arr, size);
        Question5(arr, size);
        Question6(arr, size);
        Question7(arr, size);
        Question8(arr, size);

        sc.close();

        
  }

  public static void Question2(int[] arr, int size) {
        System.out.print("\nsorted array : ");
		for (int iTemp = 0; iTemp < size - 1; iTemp++) {
			for (int jTemp = iTemp + 1; jTemp < size; jTemp++) {
				if (arr[iTemp] >= arr[jTemp]) {
					int temp = arr[iTemp];
					arr[iTemp] = arr[jTemp];
					arr[jTemp] = temp;
				}
			}
		}
        for(int i = 0; i< size; i++)
            System.out.print(arr[i] + " ");
	}

    public static void Question3(int arr[], int size){
        int sum = 0;
        for(int i = 0; i < size; i++)
            sum += arr[i];
        System.out.print("\nThe sum o fur array is : " + sum );
    }

    public static void Question4(int arr[], int size){
        int sum = 0;
        for(int i = 0; i<size; i++)
            sum += arr[i];
        System.out.print("\n avg : " + (double)sum/size);
    }

    public static void Question5(int arr[], int size){
        int arr1[] = new int[size];
        System.out.println("\n copied array is : ");
        for(int i = 0; i <size; i++){
            arr1[i] = arr[i];
            System.out.println(arr1[i] + " ");
        }
    }


    public static void Question6(int arr[], int size){
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            } 
        }
        System.out.println("Max : " + max);
		System.out.println("Min : " + min);
    }

    public static void Question7(int arr[], int size){
        System.out.print("\n reversed array : ");
            for(int i = 0; i < size - 1; i++){
               for(int j = i + 1; j <size ; j++){
                   if(arr[i] <= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         for(int i = 0; i< size; i++)
            System.out.print(arr[i] + " ");

    }

    public static void Question8(int arr[] , int size){
        int Dupicate = 0;
        System.out.print("\n duplicates are : ");
        int dup [] = new int[size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    Dupicate ++;
                    dup[i] = arr[i];
                    System.out.print(dup[i] + " ");
                }
            }
        }
        System.out.println("\n Dupicate no. values : " + Dupicate);
         for(int i = 0; i< size; i++)
            System.out.print(arr[i] + " ");

    }
    

}
