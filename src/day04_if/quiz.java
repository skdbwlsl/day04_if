package day04_if;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		
		while(true) {
			System.out.print("��¥�� �Է� :");
			day = input.nextInt();
			switch(day%7) {
				case 1: System.out.println(day+ ": ������");break;
				case 2: System.out.println(day+ ": ȭ����");break;
				case 3: System.out.println(day+ ": ������");break;
				case 4: System.out.println(day+ ": �����");break;
				case 5: System.out.println(day+ ": �ݿ���");break;
				case 6: System.out.println(day+ ": �����");break;
				case 0: System.out.println(day+ ": �Ͽ���");break;
			}	
		
		}
		
		
		}
	}


