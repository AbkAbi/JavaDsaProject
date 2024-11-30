package TrainingProjects;

import java.util.Scanner;

public class PrintMultipeofX {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        for(int i=x; i<=1000; i=i+x){
            System.out.println(i);
        }
        
        
    }
}
