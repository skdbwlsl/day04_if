package day04_if;

import java.util.Scanner;

public class myquiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 -����1-
		 �� ���� �Է��ϰ� �ִ��� ����ϼ���
		 �ִ��� (���� �Է��� ���� ū��) �Դϴٷ� ����ϼ���
		 		
		 */
		int num1, num2, max;
		System.out.println("���� �� ���� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1>num2)
			max = num1;
		else
			max = num2;
		
		System.out.println("�ִ��� " + max + "�Դϴ�");

		/*
		 ���� ) 
������� ������ �Է� �޾Ƽ�
90���� ���� ��� A����
80���� ���� ��� B���� 
70���� ���� ��� C���� 
�������� D������ �ǵ��� �����.
�������� ������� ���������� ___�̸�, ������ ___�Դϴ�.����� ���̰� ����ϱ�.
		 */
		
		int kor;
		System.out.println("���������� �Է�: ");
		kor = input.nextInt();
		if (kor >=90)
			System.out.println("����� ���������� " +kor+ "�̸�, ������ A�����Դϴ�" );
		
		else if(kor >=80)
			System.out.println("����� ���������� " +kor+ "�̸�, ������ B�����Դϴ�" );
		
		else if(kor >= 70)
			System.out.println("����� ���������� " +kor+ "�̸�, ������ C�����Դϴ�" );
		
		else
			System.out.println("����� ���������� " +kor+ "�̸�, ������ D�����Դϴ�" );
		
		
		
		/*
		 ����) 
8�� ���̸� "�б��� �ȴٴմϴ�" ���
8�� �̻��̸� "�б��� �ٴմϴ�" ���
		 */
		
		System.out.println("���̸� �Է��ϼ���:");
		num1 = input.nextInt();
		if(num1 >=8) 
			System.out.println("�б��� �ٴմϴ�");
		else
			System.out.println("�б��� �ȴٴմϴ�");
			
		
		/*
		 �� ������ �Է¹޾� ���ϴ� ���α׷� �ۼ�
�� ) 1 , 2 = 1<2
      2, 1 = 2 > 1
      2, 2 = 2 = 2
		 */
		System.out.println("�� ������ �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if(num1>num2)
			System.out.println(num1+"�� "+num2+ "���� �� ũ��");
		else if(num1<num2)
			System.out.println(num2+"�� " +num1+ "���� �� ũ��");
		else
			System.out.println(num1+ "�� " +num2+ "�� ����");
		
			
		
	}
}



