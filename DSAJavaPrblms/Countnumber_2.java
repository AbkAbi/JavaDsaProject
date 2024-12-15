package DSAJavaPrblms;

public class Countnumber_2 {
        public static void main(String[] args) {
    
            int n = 9879;
            int count=0;
            while(n>0){
                int l=n%10;
                count =count+1;
                n=n/10;
            }
            System.out.println(count);
    
            
        }
        
    }
    
