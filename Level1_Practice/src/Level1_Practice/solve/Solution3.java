package Level1_Practice.solve;

import java.util.ArrayList;

public class Solution3 {
	public int solution(int[] ingredient) {
        int answer = 0;
        // 시간 초과 -> stack으로 해결

//        ArrayList<Integer> hamList = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//
//        result.add(1);
//        result.add(2);
//        result.add(3);
//        result.add(1);
//
//        for(int i=0; i < ingredient.length; i++){
//            hamList.add(ingredient[i]);
//
//            if(hamList.size() >= 4){
//                ArrayList<Integer> tmpList = new ArrayList<>();
//                tmpList.add(hamList.get(hamList.size() - 4));
//                tmpList.add(hamList.get(hamList.size() - 3));
//                tmpList.add(hamList.get(hamList.size() - 2));
//                tmpList.add(hamList.get(hamList.size() - 1));
//
//                if(tmpList.equals(result)){
//                    answer++;
//
//                    hamList.remove(hamList.size() - 1);
//                    hamList.remove(hamList.size() - 1);
//                    hamList.remove(hamList.size() - 1);
//                    hamList.remove(hamList.size() - 1);
//                }
//            }
//        }
        
        // 간단히
        int[] stack = new int[ingredient.length];
        int sp = 0;
        
        for(int i : ingredient) {
        	stack[sp++] = i;
        	
        	if(sp >= 4 && stack[sp - 1] == 1 && stack[sp - 2] == 3
        			&& stack[sp - 3] == 2 && stack[sp - 4] == 1) {
        		answer++;
        		sp -= 4;
        	}
        }
        
        
        
        return answer;
    }

}
