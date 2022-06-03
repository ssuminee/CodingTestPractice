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
	
	public void problem_1025() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tThousand = num / 10000;
		int thousand = (num % 10000) / 1000;
		int hundred = (num % 1000) / 100;
		int ten = (num % 100) / 10;
		System.out.println("[" + tThousand * 10000 + "]");
		System.out.println("[" + thousand * 1000 + "]");
		System.out.println("[" + hundred * 100 + "]");
		System.out.println("[" + ten * 10 + "]");
		System.out.println("[" + num % 10 + "]");
	}
	
	public void problem_1026() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(":");
		int a = Integer.parseInt(arr[1]);
		if(a < 10) {
			System.out.printf("%1d", a);
		} else {
			System.out.println(a);
		}
	}
	
	public void problem_1027() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("\\.");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		System.out.printf("%02d-%02d-%04d", day, month, year);
	}
	
	public void problem_1028() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLong());
	}
	
	public void problem_1029() {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.printf("%.11f", d);
	}
	
	public void problem_1030() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLong());
	}
	
	public void problem_1031() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(Integer.toOctalString(i));
		// 8진수 변환
	}
	
	public void problem_1032() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print(Integer.toHexString(i));
	}
	
	public void problem_1033() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(Integer.toHexString(i).toUpperCase());
	}
	
	public void problem_1034() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.valueOf(sc.next(), 8));
		// 8진수 -> 10진수
	}
	
	public void problem_1035() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.toOctalString(Integer.valueOf(sc.next(), 16)));
	}
	
	public void problem_1036() {
		Scanner sc = new Scanner(System.in);
		System.out.println((int) (sc.nextLine().charAt(0)));
	}
	
	public void problem_1037() {
		Scanner sc = new Scanner(System.in);
		System.out.println((char) (sc.nextInt()));
	}
	
	public void problem_1038() {
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		System.out.println(num1 + num2);
	}
	
	public void problem_1039() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(a + b);
	}
	
	public void problem_1040() {
		Scanner sc = new Scanner(System.in);
		System.out.println(-(sc.nextInt()));
	}
	
	public void problem_1041() {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		System.out.println((char) (a + 1));
	}
	
	public void problem_1042() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a / b);
	}
	
	public void problem_1043() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a % b);
	}
	
	public void problem_1044() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(++a);
	}
	
	public void problem_1045() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.printf("%.2f",(double)(a) / (double)(b));
	}
	
	public void problem_1046() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		double avg = sum / 3.0;
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}
	
	public void problem_1047() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(2 * a);
	}
	
	public void problem_1048() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;
		for(int i = 0; i < b; i++) {
			c = 2 * c;
		}
		System.out.println(a * c);
	}
	
	public void problem_1049() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public void problem_1050() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public void problem_1051() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b >= a) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public void problem_1052() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
	
	public void problem_1053() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a == 0) {
			System.out.println(1);
		} else if (a == 1) {
			System.out.println(0);
		}
	}
	
	public void problem_1054() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 && b == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public void problem_1055() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 || b == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
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