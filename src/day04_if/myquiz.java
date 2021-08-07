package day04_if;

import java.util.Scanner;

public class myquiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 -문제1-
		 세 수를 입력하고 최댓값을 출력하세요
		 최댓값은 (각자 입력한 수중 큰값) 입니다로 출력하세요
		 		
		 */
		int num1, num2, max;
		System.out.println("정수 두 개를 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1>num2)
			max = num1;
		else
			max = num2;
		
		System.out.println("최댓값은 " + max + "입니다");

		/*
		 문제 ) 
국어과목 점수를 입력 받아서
90점이 넘을 경우 A학점
80점이 넘을 경우 B학점 
70점이 넘을 경우 C학점 
나머지는 D학점이 되도록 만들기.
마지막에 “당신의 국어점수는 ___이며, 학점은 ___입니다.”라고 보이게 출력하기.
		 */
		
		int kor;
		System.out.println("국어점수를 입력: ");
		kor = input.nextInt();
		if (kor >=90)
			System.out.println("당신의 국어점수는 " +kor+ "이며, 학점은 A학점입니다" );
		
		else if(kor >=80)
			System.out.println("당신의 국어점수는 " +kor+ "이며, 학점은 B학점입니다" );
		
		else if(kor >= 70)
			System.out.println("당신의 국어점수는 " +kor+ "이며, 학점은 C학점입니다" );
		
		else
			System.out.println("당신의 국어점수는 " +kor+ "이며, 학점은 D학점입니다" );
		
		
		
		/*
		 문제) 
8살 밑이면 "학교를 안다닙니다" 출력
8살 이상이면 "학교를 다닙니다" 출력
		 */
		
		System.out.println("나이를 입력하세요:");
		num1 = input.nextInt();
		if(num1 >=8) 
			System.out.println("학교를 다닙니다");
		else
			System.out.println("학교를 안다닙니다");
			
		
		/*
		 두 정수를 입력받아 비교하는 프로그램 작성
예 ) 1 , 2 = 1<2
      2, 1 = 2 > 1
      2, 2 = 2 = 2
		 */
		System.out.println("두 정수를 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if(num1>num2)
			System.out.println(num1+"이 "+num2+ "보다 더 크다");
		else if(num1<num2)
			System.out.println(num2+"이 " +num1+ "보다 더 크다");
		else
			System.out.println(num1+ "과 " +num2+ "는 같다");
		
			
		
	}
}



