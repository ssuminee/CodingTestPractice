package basic.level35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


// level 5_함수
public class Today_221123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int type = sc.nextInt();
		
		int sum = 0;
		
		// 물건과 개수를 곱해 합계 계산
		for(int i=0; i<type; i++) {
			sum += sc.nextInt() * sc.nextInt();
		}
		
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	/////////////////////////////////////////////////////////
	
	public class Test{
		long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
		}
	}
	
	//////////////////////////////////////////////////////////////
	
	public static void main(String[] args){
		
		boolean[] check = new boolean[10001];	// 1~10000
		
        // 1부터 10000까지 검사한 뒤 생성자 거르기
        for(int i=0; i<10001; i++){
            int n = d(i);
            
            if(n < 10001) {
            	check[n] = true;
            }
        }
        
        // String 객체끼리 더하면 메모리 할당과 해제를 발생시켜 성능이 저하됨
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<10001; i++) {
        	if(!check[i]) {	// false인 index만 출력
        		sb.append(i).append("\n");
        	}
        }
        System.out.println(sb);
        
    }
    
    public static int d(int num){
        int sum = num;
        
        if(num != 0) {
        	sum = sum + (num % 10);
        	num = num / 10;
        }
        
        return sum;
    }
    
    ////////////////////////////////////////////////////////////////
    public class Main{
    	public static void main(String[] args) throws IOException {
//    		Scanner sc = new Scanner(System.in);
//    		System.out.println(arithmetic_sequence(sc.nextInt()));
    		
    		// 속도를 향상 시키기 위해
    		// 많은 입력이 있을 때 BufferedReader가 좋다  / String으로만 저장하지만 Scanner는 다른 타입 파싱 가능 / thread safe함
    		// java.io.BufferedReader;	/ InputStreamReader;
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
    	}
    	
    	// 함수
    	public static int arithmetic_sequence(int num) {
    		int cnt = 0;	// 한수 개수
    		
    		// 1~99까지 그 자체가 수열
    		if(num < 100) {
    			return num;	// cnt = num
    		} else {
    			cnt = 99;	// 기본 99개로 초기화
    			
    			for(int i=100; i<=num; i++) {
    				int hun = i / 100;
    				int ten = (i / 10) % 10;
    				int one = i % 10;
    				
    				if((hun - ten) == (ten - one)) {
    					cnt++;
    				}
    			}
    		}
    		
    		return cnt;
    	}
    }
    
    //////////////////////////////////////////////////////////////////
    
    
	
}


