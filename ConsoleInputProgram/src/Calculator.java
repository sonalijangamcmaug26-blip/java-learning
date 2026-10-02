
public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter a number ");
		float num1 = ConsoleInput.getFloat();
		
		System.out.println("enter a number ");
		float num2 = ConsoleInput.getFloat();
		
		Calculator obj = new Calculator();
		float result = obj.add(num1, num2);
		System.out.println(result);
		
		
	}

	private float add(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
