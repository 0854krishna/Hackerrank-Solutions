//https://www.hackerrank.com/challenges/bigger-is-greater
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) 
    {
        int  r=0;
        String s="";
        String s1="";
        int i=w.length()-1;
        int j=i-1;;

        while(i>=1 && w.charAt(j)>=w.charAt(i))
        {
            i--;
            j--;
        }
        if(j<0)
        {
            return "no answer";
        }
        s=w.substring(0,j);
        char[] c=w.substring(j+1).toCharArray();
        Arrays.sort(c);
        for(int t=0;t<c.length;t++)
        {
            if(c[t]>w.charAt(j))
            {
                s=s+c[t];
                //System.out.println(c[t]);
                c[t]=w.charAt(j);
                
                //System.out.println(c[t]+" after");
                s=s+String.valueOf(c);
                System.out.println(s);
                r=1;
                break;
            }
        }
       


        
     
return s;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
