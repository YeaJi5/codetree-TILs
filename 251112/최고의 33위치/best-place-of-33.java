import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] num = new int [N][N];

        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++){
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        for (int i=0; i<N-2; i++){
            for (int j=0; j<N-2; j++){
                int sum = 0;
                for (int i3=i; i3<i+3; i3++){
                    for (int j3=j; j3<j+3; j3++){
                        sum += num[i3][j3];
                    }
                }

                result = Math.max(result, sum);
                
            }
        }
        
        System.out.println(result);
        
    }
}