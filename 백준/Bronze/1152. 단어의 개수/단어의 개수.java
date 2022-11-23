import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // split의 경우 반드시 배열을 반환하므로 빈 문자열일 때 1이 출력되므로 x
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());
    }
}