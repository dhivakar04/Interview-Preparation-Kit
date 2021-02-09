package Sample;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class new_Year_Chaos{

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        ArrayList<Integer> lst= new ArrayList<>();
        int count=0;
        for(int i=0;i<q.length;i++){
            lst.add(q[i]);
        }
        for(int i=lst.size()-1;i>-1;i--){
            if( i+1==lst.get(i)){
                continue;
            }
            else if(i+1==lst.get(i-1)){
                count++; 
                lst.remove(i-1); 
            }
            else if(i+1==lst.get(i-2)){
                count+=2;
                lst.remove(i-2);  
            }
            else{
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
