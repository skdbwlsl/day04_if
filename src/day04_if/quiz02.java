package day04_if;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String spot=null, office=null; //반복문 안에 있으면 null로 출력돼서 밖으로 빼야한다
		
		
		while(true) {
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록 보기");
		num = input.nextInt();
		
		/*
			switch(num) {
			case 1: System.out.println("우리집 목적지 입력 : ");
			spot = input.next();
			System.out.println("등록 성공"); break;
			
			case 2 : System.out.println("회사 목적지 입력 : ");
			office = input.next();
			System.out.println("등록 성공");break;
			
			case 3 : System.out.println("우리집 : " + spot);
					System.out.println("회사 : " + office);
			
			}
			*/
		
		
		if(num==1) {
			System.out.println("우리집 목적지 입력 :");
			spot = input.next();
			System.out.println("등록 성공");
			
		}else if(num==2) {
			System.out.println("회사 목적지 입력 :");
			office = input.next();
			System.out.println("등록 성공");
			
		}else if(num==3) {System.out.println("우리집 : " +spot);
				System.out.println("회사 : " + office);
		
		}else {
			System.out.println("잘못 입력");
		}
		

		}
		}
}
