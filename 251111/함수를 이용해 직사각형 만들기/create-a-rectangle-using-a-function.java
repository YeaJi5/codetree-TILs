import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowNum = Integer.parseInt(st.nextToken());
        int colNum = Integer.parseInt(st.nextToken());
        // Please write your code here.

        printSquare(rowNum, colNum);


    }

    public static void printSquare(int n, int m){
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print('1');
            }
            System.out.println();
        }
    }
}