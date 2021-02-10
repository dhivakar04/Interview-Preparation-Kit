package Sample;

import java.math.*;
import java.util.Scanner;

public class Sum_OF_Digits{
    
    static int Dsum(BigInteger v) {
        BigInteger m= new BigInteger("9");
       
        v=v.mod(m);
        if(v.intValue()==0)
            return 9;
        return v.intValue();
    
    }
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String k=sc.next(); 
        
        BigInteger v= new BigInteger(s);
        BigInteger s1= new BigInteger(k);
        
        
        int res=Dsum(v.multiply(s1));
        System.out.print(res);
        
        }
}
