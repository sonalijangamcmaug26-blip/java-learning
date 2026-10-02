public class Pattern3 {
    public static void main(String[] args){

        int num = 1;

        for( int i = 1; i <5; i++){ 
            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
}

// public class Pattern3 {
// 	public static void main(String[] args) {

// 		int num1 = 1;

// 		for (int iTemp = 1; iTemp <= 4; iTemp++) {

// 			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
// 				System.out.print(num1 + " ");
// 				num1++;
// 			}

// 			System.out.println();
// 		}
// 	}
// }

