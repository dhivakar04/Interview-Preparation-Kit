package guv;

import java.util.*;

public class Hour_Glass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] =new int[6][6];
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				a[i][j]=sc.nextInt();
		
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int j=0;j<4;j++) {
				int top=a[i][j]+a[i][j+1]+a[i][j+2];
				
				int mid=a[i+1][j+1];
				
				int bottom=a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				
				sum=top+mid+bottom;
				
				if(sum>max)
					max=sum;
			}
		}
			System.out.println(max);
	}
}