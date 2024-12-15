package DSAJavaPrblms;

public class StringValue {
    public static void main(String[] args) {
        String a = "Interview";

        char s[]=a.toCharArray();

        for(int i=0; i<s.length; i++)
        {
            for(int j=i+1; j<s.length; j++)
            {
                if(s[i]==s[j]){

                    System.out.println("duplicate of i="+s[i]);

                }
            }
        }
         

    }
    
}
