import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){    // 소문자
                arr[str.charAt(i) - 97]++;
            } else{
                arr[str.charAt(i) - 65]++;
            }
        }
        
        int max = -1;
        char ch = '?';
        
        for(int i=0; i<26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65);
            } else if(arr[i] == max){
                ch = '?';
            }
        }
        
        System.out.println(ch);
    }
}
