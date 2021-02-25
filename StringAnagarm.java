package guv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class StringAnagarm{
	static void anagram(String table[],String queries[]) {
		ArrayList<String>dic=new ArrayList<>();
		for(int i=0;i<table.length;i++) {
			int alpha[] =new int[26];
			for(int j=0;j<table[i].length();j++) {
				char c=table[i].charAt(j);
				int ascii=(int)c-97;
				alpha[ascii]=1;
			}
			String s=Arrays.toString(alpha).replaceAll("[^0-1]","");
			dic.add(s);
		}
		System.out.println(dic);
		 
		TreeMap<String,Integer>ans=new TreeMap<>();
		for(int i=0;i<queries.length;i++) {
			int count=0;
			int alpha[] =new int[26];
			for(int j=0;j<queries[i].length();j++) {
				char c=queries[i].charAt(j);
				int ascii=(int)c-97;
				alpha[ascii]=1;
			}
			String s=Arrays.toString(alpha).replaceAll("[^0-1]","");
			count=Collections.frequency(dic, s);
			ans.put(s,count);
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int l=sc.nextInt();
		
		String[] s1=new String[l];
		
		for(int i=0;i<l;i++)
			s1[i]=sc.next().toLowerCase();
		
		int queries=sc.nextInt();
		
		String s2[]=new String[queries];
		
		for(int i=0;i<queries;i++)
			s2[i]=sc.next().toLowerCase();
		
		anagram(s1,s2);
	}
}