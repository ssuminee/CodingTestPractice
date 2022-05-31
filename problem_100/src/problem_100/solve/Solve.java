package problem_100.solve;

import java.util.Scanner;

public class Solve {
	public void problem_1015() {
		Scanner sc = new Scanner(System.in);
		// float f1 = sc.nextFloat();
		System.out.printf("%.2f", sc.nextFloat());
	}

	public void problem_1017() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("%d %d %d", num, num, num);
	}

	public void problem_1018() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] aStr = str.split(":");
		System.out.printf("%s:%s", aStr[0], aStr[1]);
	}

	public void problem_1019() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] aStr = str.split("\\.");
		int[] iArr = new int[aStr.length];
		for(int i = 0; i < aStr.length; i++) {
			iArr[i] = Integer.parseInt(aStr[i]);
		}

		System.out.printf("%d.%02d.%02d", iArr[0], iArr[1], iArr[2]);
	}


	/*
	 * str.split("[.]");
정규식에서 []는 문자의 집합이나 범위를 나타냅니다.
마침표(.)를 범위를 나타내는 [] 사이에 넣어서, 문자로 취급하였습니다.
 
str.split("\\.");
정규식에서 역슬래시(\) 다음에 마침표와 같은 특수문자(즉, 정규식에서 특정한 의미를 가지는 문자)가 오면
역슬래시(\) 다음에 오는 문자를 일반 문자로 취급합니다.
즉, 정규식에서 '\.'는 일반문자 마침표를 의미합니다.
그리고, Java의 문자열에서 역슬래시(\)를 표현하기 위해서는 
앞에 \를 붙여서 escape 처리를 해야합니다.
따라서, 위 예제에서는 split()의 파라미터로 "\\."를 전달하여, 
문자열을 마침표 단위로 자르도록 하였습니다.
출처: https://hianna.tistory.com/618 [어제 오늘 내일:티스토리]
	 */

	public void problem_1020() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("-");
		System.out.println(arr[0] + arr[1]);
	}
	
	public void problem_1021() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
	}
	
	public void problem_1023() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
	
	public void problem_1024() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
}




	/*import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

    }
}

	 */