package DSAJavaPrblms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=11;
        int flag=1;
        for(int i=2; i<n; i++){

            if(n%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("is a prime");
        }
        else{
            System.out.println("not prime");
        }

    }
    
}
