import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        printLine(N);
    }

    public static void printLine(int n){
        for(int i=0; i<n; i++){
            System.out.println("12345^&*()_");
        }
    }
}