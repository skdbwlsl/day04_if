package day04_if;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String spot=null, office=null; //�ݺ��� �ȿ� ������ null�� ��µż� ������ �����Ѵ�
		
		
		while(true) {
		System.out.println("1.�츮�� ���");
		System.out.println("2.ȸ�� ���");
		System.out.println("3.��� ����");
		num = input.nextInt();
		
		/*
			switch(num) {
			case 1: System.out.println("�츮�� ������ �Է� : ");
			spot = input.next();
			System.out.println("��� ����"); break;
			
			case 2 : System.out.println("ȸ�� ������ �Է� : ");
			office = input.next();
			System.out.println("��� ����");break;
			
			case 3 : System.out.println("�츮�� : " + spot);
					System.out.println("ȸ�� : " + office);
			
			}
			*/
		
		
		if(num==1) {
			System.out.println("�츮�� ������ �Է� :");
			spot = input.next();
			System.out.println("��� ����");
			
		}else if(num==2) {
			System.out.println("ȸ�� ������ �Է� :");
			office = input.next();
			System.out.println("��� ����");
			
		}else if(num==3) {System.out.println("�츮�� : " +spot);
				System.out.println("ȸ�� : " + office);
		
		}else {
			System.out.println("�߸� �Է�");
		}
		

		}
		}
}
