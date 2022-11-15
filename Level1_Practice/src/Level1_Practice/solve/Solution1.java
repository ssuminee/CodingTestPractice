package Level1_Practice.solve;

import java.util.Arrays;

public class Solution1 {
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 오름차순 정렬 ***
        Arrays.sort(score);
        
//        int[] tScore = new int[score.length];
//        
//        // 배열 역순 정렬
//        for(int i=0;i<score.length;i++){
//            tScore[i] = score[score.length - 1 - i];
//        }
//        
//        int index = 0;
//        
//        // 계산
//        while(true){
//            if(index >= score.length || index + m > score.length){
//                break;
//            }
//            
//            answer += m * tScore[index + m -1];
//            index += m;
//        }
        
        // 더 간단히
        for(int i = score.length; i>=m; i-=m) {
        	answer += m * score[i-m];
        }
        
        return  answer;
    }
}
