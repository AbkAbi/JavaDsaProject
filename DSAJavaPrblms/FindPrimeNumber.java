package DSAJavaPrblms;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int n=11;
        for(int i=2; i<=n; i++)
        
    {
        int flag=0;
        for(int j=2; j<i; j++)
        {
            if(i%j==0){
                flag=1;
            }
        }
    if(flag==0)
    {
        System.out.println(i);
    }
    }}
    
}
