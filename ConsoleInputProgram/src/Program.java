class Program {
	public static void main(String args[]) {
		try {

			byte arrInput[] = new byte[100];
			System.out.println("enter the values");
			int length = System.in.read(arrInput);
			byte[] arrFinal = new byte[length - 2];
			System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

			String objstring = new String(arrFinal);
			int num1 = Integer.parseInt(objstring);
			
			System.out.println("DATA ENTERED IS " + num1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static float getFloat() {
		try

		{

			byte arrInput[] = new byte[100];
			System.out.println("enter the values");
			int length = System.in.read(arrInput);
			byte[] arrFinal = new byte[length - 2];
			System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

			String objstring = new String(arrFinal);
			float num1 = Float.parseFloat(objstring);
			System.out.println("DATA ENTERED IS " + num1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		

	}

	public static String getString() {
		try {
			byte arrInput[] = new byte[100];
			System.out.println("enter ur value : ");
			int length = System.in.read(arrInput);
			byte[] arrFinal = new byte[length - 2];
			System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

			String objstring = new String(arrFinal);
			return objstring;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public static int getInt(){
        return Integer.parseInt(getString());
        

	}
}	
