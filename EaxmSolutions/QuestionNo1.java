import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Result{
    int studentId;
    String studentName;
    String subjectName;
    int marks;
    char grade;
    int examDate;

    enum grade 
    {
        Distinction, First_class, Second_class, Pass, Fail
        
    }
    Scanner sc = new Scanner(System.in);

    Set<Integer> Id = new HashSet<>();
    for(int i = 0; i < Id.size; i++){
        Id.add(sc.nextInt());
    }

    Map <Integer , String> grade = new HashMap<>();
    for(int i = 0; i < grade.size; i++){
        grade.map()
    }
    sc.close();
    

}