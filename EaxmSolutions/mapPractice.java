import java.util.*;
class mapPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of books :");
        int N = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter book titles");
            String bookTitle = sc.next();
            System.out.println("booktitles are :" );
            map.put(bookTitle , map.getOrDefault(bookTitle , 0)+1);
            
        }
            }
}
