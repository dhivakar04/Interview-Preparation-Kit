package Sample;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Stair_case_ways {
    public static Map<Integer,Integer> memo=new HashMap<>();
    static int stepPerms(int k) {
        if(k==1 || k==2)
            return k;
        if(k==3)
            return 4;
        if(memo.containsKey(k)) {
            return memo.get(k);
        }
        int result=stepPerms(k-3)+stepPerms(k-2)+stepPerms(k-1);
        memo.put(k,result);
        
        return result;
        }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int value=sc.nextInt();
    	System.out.println(stepPerms(value));
}

}