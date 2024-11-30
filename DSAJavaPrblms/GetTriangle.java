package TrainingProjects;
import java.util.Scanner;
class GetTriangle{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        if(a+b+c==180)
        {
            System.out.println("The triangle can be formed");
        }
        else{
            System.out.println("The triangle cannot be formed");
        }
        
    
    }
}