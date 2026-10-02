public class exception{
    public static void main(String[] args) {
        
    
    int i = 4;
    int j = 0;

    int nums[] = new int[5];

    try
    {
        j = 18/i;
        System.out.println(nums[1]);
        System.out.println(nums[5]);

    }
    catch(ArithmeticException e){
        System.out.println("something went wrong" );
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("invalid index access");
    }

    System.out.println("hello learning exception" + j);
}

}
