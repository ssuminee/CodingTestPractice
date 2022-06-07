package com.br.p2;

public class P2 {

	public static void main(String[] args) {
		// 피보나치 수열
		// An = An-1 + An-2 (n >= 3)
		int[] arr = new int[100];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];	// arr[2] = 2, arr[3] = 3, arr[4] = 5
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int prevprevNum = 1;
		int prevNum = 1;
		System.out.print(prevprevNum + " ");
		System.out.print(prevNum + " ");
		
		for(int i = 3; i <= 10; i++) {
			int curNum = prevprevNum + prevNum;
			System.out.print(curNum + " ");
			prevprevNum = prevNum;
			prevNum = curNum;
		}
	}

}
