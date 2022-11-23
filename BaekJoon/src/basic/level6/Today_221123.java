package basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Today_221123 {
	public static void main(String[] args) throws IOException{
		// System.in.read()
		// 반드시 예외처리를 해줘야 한다. (throws IOException)
		// read() 메소드는 1 byte 만 읽기 때문에 나머지 byte 는 스트림에 잔존하게 된다.
		
		int a = System.in.read();
		System.out.println(a);
	}
	
	/////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();// 별로 쓸모 x
		
		int sum = 0;
		
		// getBytes() : 문자열을 byte 배열로 반환
		// readLine()으로 읽어들인 문자를 byte[]로 변환하여 반환 -> for-each
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
			// UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 반드시 '0' 또는 48 을 빼주어야 한다.
		}
		
		System.out.println(sum);
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			// 배열이 -1인 경우에만 초기화
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for(int val : arr) {
			System.out.println(val + " ");
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");	// 공백 분리
			
			int num = Integer.parseInt(str[0]);
			String s = str[1];
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<num; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {	// 소문자
				arr[str.charAt(i) - 'a']++;
			} else {
				arr[str.charAt(i) - 'A']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			} else if(max == arr[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
	////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// split()의 경우 반드시 배열을 반환하므로 빈 문자열일 때 1이 반환되므로 사용 불가
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(st.countTokens());
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// StringBuilder의 reverse() 메소드 -> 저장되있는 문자열 뒤집기
		
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(new StringBuilder(arr[0]).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(arr[1]).reverse().toString());
		
		System.out.println(a > b ? a : b);
	}
	
}
