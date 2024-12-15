package DSAJavaPrblms;

public class ReverseAnumber2 {
public static void main(String[] args) {
    int n=987987;
    int sum=0;
    while(n>0){
      int l = n%10;
      sum=10*sum+l;
      n=n/10;
    }
    System.out.println(sum);
}}