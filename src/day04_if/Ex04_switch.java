package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력");
		select = input.nextInt();
		/*
		switch(select){
		
		case 1: System.out.println("1.입력값 : " +select);break;	
		case 2: System.out.println("2.입력값 : " +select);break;	
		case 3: System.out.println("3.입력값 : " +select);break;	
		default: System.out.println("1,2,3을 제외한 다른 값 입력");
		}
		
		*/
		//default는 else와 같다.(case로 실행하다 실행이 안되는 상황이면 default이고 생략도 가능
		//break는 case마지막에 꼭 넣어야한다.이게 없으면 그 뒤내용이 계속 출력돼기 때문에 써야한ㄷ.
		//스위치문 빠져나오려고 break넣어주는것,
		
		/*if문으로도 가능하다
		if(select ==1) {
			
		}
	
		*/
		
		switch( select%2 ) {
		case 0:System.out.println("입력 값은 짝수 입니다");break;
		case 1:
			System.out.println("1.입력값 : "+select); 
			break;
		case 2:System.out.println("2.입력값 : "+select); break;
		case 3:System.out.println("3.입력값 : "+select); break;
		default:System.out.println("1,2,3을 제외한 다른 값 입력");break;
		}
}
}
