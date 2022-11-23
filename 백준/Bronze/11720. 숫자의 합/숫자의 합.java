import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < a; i++) {
			int num = str.charAt(i) - '0';
			sum += num;
		}
		System.out.println(sum);
	}
}