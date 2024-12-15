package DSAJavaPrblms;

public class FindKthElement {
public static void main(String[] args) {
    
    int A= 3, B=3, K=1;
    int res=A;
    int h=1;
    for(int i=1; i<B; i++){
        res=res*A;
    }
   while(res>0){
    int ans=res%10;
    if(K==h){
        System.err.println(ans);
    }
    h++;
    res=res/10;
   }
}
}
