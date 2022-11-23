import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int a = Integer.parseInt(new StringBuilder(arr[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(arr[1]).reverse().toString());
        
        System.out.println(a>b?a:b);
    }
}