package com.br.p1.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.br.p1.Student;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student("구수민", "12161410"));
		list.add(new Student("박채은", "12161419"));
		list.add(new Student("정유림", "12161417"));

		char ch = ' ';

		while(true) {
			System.out.print("검색할 학생 이름 입력 : ");
			String name = sc.nextLine();
			String str = null;
			
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getName().equals(name)) {
					str = list.get(i).getNo();
					System.out.println(str);
					break;
				} 
			}
			if(str == null) {
				System.out.println("없는 학생 이름");
			}

			System.out.print("계속 진행 하시겠습니까? (Y/N) : ");
			ch = sc.nextLine().charAt(0);
			if(ch == 'Y') {
				continue;
			} else if(ch == 'N') {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}





