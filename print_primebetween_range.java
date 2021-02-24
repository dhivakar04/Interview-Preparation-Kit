import java.util.ArrayList;
import java.util.Scanner;

public class print_primebetween_range {
	static boolean isprime(long n) {
    	
    	long lmt=(long)Math.sqrt(n)+1;
	for(long j=2;j<lmt;j++) 	//sqrt(n) time complexity
		if(n%j==0)
			return false;
	return true;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Long> ls=new ArrayList<>();
    	
    	long range=sc.nextLong();
    	
    	for(long i=1;i<=range;i++) {
    		if(isprime(i))
    			ls.add(i);
    	}
    	System.out.print(ls);
    }
}
