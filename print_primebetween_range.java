package guv;

import java.util.*; 

public class print_primebetween_range{
	static ArrayList<Long> isprime(long n) {
		ArrayList<Long> ls=new ArrayList<>();
		
		long lmt=(long) Math.sqrt(n)+1;
		for(long i=1;i<=n;i++) {
			
			int flag=0;
			for(long j=2;j<lmt;j++) {	//sqrt(n) time complexity
				if(i%j==0 && i!=j) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				ls.add(i);
		}
		return ls;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(isprime(sc.nextLong()));
	}
}