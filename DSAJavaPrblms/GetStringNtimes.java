package TrainingProjects;

import java.util.Scanner;

public class GetStringNtimes {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
        String x = s.next();
        String y = s.next();
        int n = s.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println(x+y);
        }
        
        
    }
}
