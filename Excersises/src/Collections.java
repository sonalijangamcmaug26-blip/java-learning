import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class Collections {
    
    // List <Integer>obj = new ArrayList<Integer>();
    // obj.add(4);
    // obj.add(6);
    // obj.add(9);
    // obj.set(2, 7);
    // obj.contains(4);
    // obj.indexOf(7);
    
    // // for( int n : obj){
        // //     System.out.println(n);
        // // }
        // System.out.println(obj.indexOf(7));
        // =========================================================================
        
        // Set <Integer> obj = new HashSet<Integer>();
        // obj.add(9);
        // obj.add(9);
        // obj.add(8);
        // obj.add(10);
        // System.out.println(obj.size());
        // System.out.println(obj.hashCode());
        // System.out.println(obj.equals(8));
        
        // for(int n : obj){
            //     System.out.println(n);
            // }
            // ===================================================================================================
            
            //    Set  <Integer> values = new TreeSet<Integer>();
            //     values.add(8);
            //     values.add(84);
            //     values.add(86);
            //     values.add(82);
            //     values.add(88);
            
            //     Iterator nums = values.iterator();
            //     while(nums.hasNext())
            //     System.out.println(nums.next());
            // ===============================================================================================================
            // MAP
            
            // Map <String, Integer> students = new TreeMap<>();
            // students.put("anil", 1);
        // students.put("meena", 5);
        // students.put("lela", 6);
        // students.put("nil", 7);
        //  students.put("nil", 78);
        
        // System.out.println(students);
        // ===========================================================================================================
        // List <Integer> nums =  Arrays.asList(2 ,3,4,5,6,7,8);
        // int sum = 0;
        //     for(int n : nums){
            //         if(n%2==0){
                //             n = n*2;
                //             sum = sum+n;
                //         }
                //     }
                //     System.out.println(sum);
                
                
                // for(int i = 0; i<nums.size(); i++){
                    //     System.out.println(nums.get(i));
                    // }
                    
                    
                    // nums.forEach(n -> System.out.println(n* 6));
                    
                    // for forEach works --> it implements the consumer interface and it has a void accept method
                    
                    // Consumer<Integer> con = n -> System.out.println(n); // using lambda function we sort the format as consumer is a functional interface
                    // nums.forEach(con);                                  //instead using this we can use the next line directly
                    // nums.forEach(n -> System.out.println(n* 6));   //where foreach came from through consumer interface!!
                    
                    // STREAM API -- Stream is an interface 
                    // Stream <Integer> s1 = nums.stream();
                    // Stream <Integer> s2 = s1.filter(n -> n %2 == 0);
                    // s2.forEach(n -> System.out.println(n));
                    
                    // nums.forEach(n -> System.out.println(n));
                    
                    public static void main(String[] args) {
            

    }
}
