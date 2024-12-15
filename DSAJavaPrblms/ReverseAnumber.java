package DSAJavaPrblms;

public class ReverseAnumber {
public static void main(String[] args) {
    int n=325345;
    int sum=0;
    while(n>0){
      int l = n%10;//32534 /4
      sum=10*sum+l;
      n=n/10;
    }
    System.out.println(sum);
}}