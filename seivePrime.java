package guv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class seivePrime {
	static ArrayList<Long> Findprime(long n){
		boolean[] ls= new boolean[(int) (n+1)];
    	Arrays.fill(ls, true);
    	
    	ArrayList<Long> prime= new ArrayList<>();
    	long lmt =(long)Math.sqrt(n);
    	prime.add((long)1);
    	for(long i=2;i<n;i++) {
    		if(ls[(int) i]) {
    			prime.add(i);
    			if(i<=lmt) {
    				for(long j=2*i;j<=n;j=j+i) {
    					ls[(int) j]=false;
    				}
    			}
    		}
    	}
    	return prime;
	}
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print(Findprime(sc.nextLong()));
    }
}