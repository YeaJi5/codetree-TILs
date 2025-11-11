import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // Please write your code here.
        printNumber(n);
    }

    public static void printNumber(int n){
        int num=1;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(num + " ");
                num++;

                if (num==10){
                    num=1;
                }
            }
            System.out.println();
        }
    }
}