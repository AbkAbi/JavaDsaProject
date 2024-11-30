package TrainingProjects;

import java.util.Scanner;

public class MarkOfStudent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        if(a>=90)
        {
            System.out.println("GRADE A");
        }
        else if(a>=80){
            System.out.println("GRADE B");
        }
        else if(a>=60){
            System.out.println("GRADE C");
        }
        else if(a>=35){
            System.out.println("GRADE D");
        }
        else{
             System.out.println("FAIL");
        }
        
    
    }
}
