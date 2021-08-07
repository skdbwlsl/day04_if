package day04_if;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		
		while(true) {
			System.out.print("날짜를 입력 :");
			day = input.nextInt();
			switch(day%7) {
				case 1: System.out.println(day+ ": 월요일");break;
				case 2: System.out.println(day+ ": 화요일");break;
				case 3: System.out.println(day+ ": 수요일");break;
				case 4: System.out.println(day+ ": 목요일");break;
				case 5: System.out.println(day+ ": 금요일");break;
				case 6: System.out.println(day+ ": 토요일");break;
				case 0: System.out.println(day+ ": 일요일");break;
			}	
		
		}
		
		
		}
	}


