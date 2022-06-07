package com.br.p4;

import java.util.Scanner;

public class P4 {
	// 10진수 -> 2진수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 수 : ");
		int num = sc.nextInt();
		int[] arr = new int[10];
		boolean bool = true;
		int count = 0;
		
//		while(bool) {
//			for(int i = 0; i < 10; i++) {
//				arr[i] = num % 2;
//				num = num / 2;
//				count++;
//				if(num == 0) {
//					bool = false;
//					break;
//				}
//			}
//			for(int i = count - 1; i >= 0; i--) {
//				System.out.print(arr[i]);
//
//			}
//		}
//		
		System.out.println();
		System.out.print("변환할 수 : ");
		int Num = sc.nextInt();
		int k = 0;
		int[] a = new int[100];
		while(num > 0) {
			a[k] = Num % 2;
			Num /= 2;
			k++;
		}
		k--;
		for(int j = k; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
	}
}
/*
 * 19 
 * arr[0] = 1 / num = 9 / count = 1
 * arr[1] = 1 / num = 4 / count = 2
 * arr[2] = 0 / num = 2 / count = 3
 * arr[3] = 0 / num = 1 / count = 4
 * arr[4] = 1 / num = 0 / count = 5 
 */ 		
