package Level1_Practice.solve;

public class Solution2 {
	
	class Solution {
	    public String solution(int[] food) {
	    	
	    	String answer = "0";
//	    	String left = "";
//	    	String right ="";
//	    	
//	    	for(int i=1; i<food.length; i++) {
//	    		if(food[i] != 0) {
//	    			for(int j=0; j < (food[i] / 2); j++) {
//	    				left += Integer.toString(i);
//	    			}
//	    		}
//	    	}
//	    	
//	    	right = left;
//	    	answer = left + "0";
//	    	
//	    	for(int i=right.length()-1; i>=0; i--) {
//	    		answer += right.substring(i, i+1);
//	    	}
	    	
	    	// 더 간단히
	    	for(int i = food.length - 1; i>0; i--) {
	    		for(int j = 0; j < food[i]/2; j++) {
	    			answer = i + answer + i;
	    		}
	    	}
	    	
	    	return answer;
	    }
	}
}
