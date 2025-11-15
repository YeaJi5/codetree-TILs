import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayList<Integer> a = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String c = st.nextToken();

            if (c.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                a.add(num);
            }else if (c.equals("pop_back")){
                a.remove(a.size()-1);
            }else if (c.equals("size")){
                sb.append(a.size()).append("\n");
            }else{
                int num = Integer.parseInt(st.nextToken());
                sb.append(a.get(num-1)).append("\n");
            }
        }

        System.out.println(sb);
    }
}