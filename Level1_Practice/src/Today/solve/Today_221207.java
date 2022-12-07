package Today.solve;

public class Today_221207 {
	// 한번만 등장한 문자 -> 내가 다함!!
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        int[] alpha = new int[26];
	        
	        for(int i=0; i<s.length(); i++){
	            alpha[s.charAt(i) - 'a']++;
	        }
	        for(int i=0; i<26; i++){
	            if(alpha[i] == 1){
	                answer = answer + (char)(i + 97);
	            }
	        }
	        
	        return answer;
	    }
	}
	
	// 외계인 나이
	class Solution {
	    public String solution(int age) {
	        String answer = "";
	        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
	        
	        while(age > 0){
	            answer = alpha[age % 10] + answer;
	            age = age / 10;
	        }
	        
	        return answer;
	    }
	}
	
	// 로그인 성공
	class Solution {
	    public String solution(String[] id_pw, String[][] db) {
	        String answer = "";
	        
	        for(int i=0; i<db.length; i++){
	            if(id_pw[0].equals(db[i][0])){		// 문자열일 땐 equals 주의주의!!!!!!
	                if(id_pw[1].equals(db[i][1])){
	                    answer = "login";
	                } else{
	                    answer = "wrong pw";
	                }
	            }
	        }
	        return (answer.equals("")) ? "fail" : answer;
	    }
	}
	
	// 편지
	class Solution {
	    public int solution(String message) {
	        int answer = 0;
	        
	        answer = 2 * (message.length());
	        return answer;
	    }
	}
	
	// 각도기
	class Solution {
	    public int solution(int angle) {
	        int answer = 0;
	        
	        if(angle > 0 && angle < 90){
	            answer = 1;
	        } else if(angle == 90){
	            answer = 2;
	        } else if(angle < 180){
	            answer = 3;
	        } else {
	            answer = 4;
	        }
	        return answer;
	    }
	}
	
	// 나누어 떨어지는 숫자 배열
	import java.util.Arrays;

	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	        int count = 0;
	        
	        for(int i=0; i<arr.length; i++){
	            if((arr[i] % divisor) == 0){
	                count++;
	            }
	        }
	        
	        int[] answer = new int[count];
	        count = 0;
	        
	        for(int i=0; i<arr.length; i++){
	            if((arr[i] % divisor) == 0){
	                answer[count++] = arr[i];
	            }
	        }
	        
	        Arrays.sort(answer);
	        
	        if(count == 0){
	            answer = new int[1];
	            answer[0] = -1;
	        }
	        
	        return answer;
	    }
	}
	
	// 가위 바위 보
	class Solution {
	    public String solution(String rsp) {
	        String answer = "";
	        
	        for(int i=0; i<rsp.length(); i++){
	            if(rsp.charAt(i) == '2'){
	                answer += "0";
	            } else if(rsp.charAt(i) == '0'){
	                answer += "5";
	            } else if(rsp.charAt(i) == '5'){
	                answer += "2";
	            }
	        }
	        
	        return answer;
	    }
	}
	
	// 완주하지 못한 선수
	// 각 배열을 정렬 후 일치하지 않는 선수 / 완주자 목록에 다른게 없으면 마지막 한 사람
	// 근데 아직도 왜 마지막 사람이 중복인 사람인지 모르겠음
	// -> 정렬을 했으니까 일치하지 않는 인덱스의 배열이 답
	import java.util.Arrays;

	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        for(int i=0; i<completion.length; i++){
	            if(!(completion[i].equals(participant[i]))){
	                return participant[i];
	            }
	        }
	        
	        return participant[completion.length];
	       
	    }
	}
	
	
	// 해시
	// map.getOrDefault(Object key, V DefaultValue) : 찾는 key가 존재하면 해당 key에 매핑되어있는
	// 													값을 반환하고, 그렇지 않으면 디폴트 값
	// map.keySet() : map값 전체 출력, key값 필요
	// map.entrySet() : ""	, key값 필요 없음
	
	import java.util.HashMap;

	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        for(String name : participant){
	            map.put(name, map.getOrDefault(name, 0) + 1);
	        }
	        
	        for(String name : completion){
	            map.put(name, map.get(name) - 1);
	        }
	        
	        for(String key : map.keySet()){
	            if(map.get(key) > 0){
	                answer = key;
	                break;
	            }
	        }
	        return answer;
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
