package com.br.p3;

import java.util.Scanner;

public class P3 {
	// 가장 많이 출현한 수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		for(int i = 0; i < 10; i++) {
			input[i]  = sc.nextInt();
		}
		// 1 4 6 4 3 4 2 3 4 9 (4, 4회)
		
		int[] count = new int[10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(input[j] == i) {
					count[i]++;
				}
			}
		}
		
		/*
		 *  for(int i = 0; i < 10; i++){
		 *  	count[input[i]]++;
		 *  }
		 */
		
		int max = 0;	// 횟수
		int num = 0;	// 최빈수
		for(int i = 0; i < 10; i++) {
			if(count[i] > max) {
				max = count[i];
				num = i;
			}
		}
		System.out.println("정답 : " + num + ", " +  max + "회");
		
	}

}
