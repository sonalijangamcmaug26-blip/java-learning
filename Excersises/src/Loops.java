public class Loops {

	public static void main(String args[]) {

		System.out.println("odd numbers : ");

		for (int i = 0; i <= 10; i++) {
			if (i % 2!= 0) {
				System.out.println(i);
			}

		}

		System.out.println("even numbers : ");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			System.out.print(" ");

		}
		
//		3. using for loops write a Java Program to display every 7th number from 1 to 200
		 System.out.println("all the 7th elemet between 1 to 100 : ");
		for (int i = 7; i <= 200; i = i + 7){
			System.out.print("\n" + i);
		}

		System.out.print(" ");
		 
		 
		
		
	}
}
