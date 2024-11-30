package TrainingProjects;

import java.util.Scanner;

public class PrintXtimesOfY {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        
        for(int i=0; i<y; i++){
            System.out.println(x);
        }
        
        
    }
}
