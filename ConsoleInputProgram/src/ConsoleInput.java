
public class ConsoleInput {

    // Get String input
    public static String getString() {

        try {
            byte[] arrInput = new byte[100];

            int length = System.in.read(arrInput);

            // Remove Enter key characters
            String input = new String(arrInput, 0, length).trim();

            return input;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    // Get Integer input
    public static int getInt() {

        return Integer.parseInt(getString());
    }


    // Get Float input
    public static float getFloat() {

        return Float.parseFloat(getString());
    }
}

