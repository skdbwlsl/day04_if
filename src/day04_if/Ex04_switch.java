package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("�� �Է�");
		select = input.nextInt();
		/*
		switch(select){
		
		case 1: System.out.println("1.�Է°� : " +select);break;	
		case 2: System.out.println("2.�Է°� : " +select);break;	
		case 3: System.out.println("3.�Է°� : " +select);break;	
		default: System.out.println("1,2,3�� ������ �ٸ� �� �Է�");
		}
		
		*/
		//default�� else�� ����.(case�� �����ϴ� ������ �ȵǴ� ��Ȳ�̸� default�̰� ������ ����
		//break�� case�������� �� �־���Ѵ�.�̰� ������ �� �ڳ����� ��� ��µű� ������ ����Ѥ�.
		//����ġ�� ������������ break�־��ִ°�,
		
		/*if�����ε� �����ϴ�
		if(select ==1) {
			
		}
	
		*/
		
		switch( select%2 ) {
		case 0:System.out.println("�Է� ���� ¦�� �Դϴ�");break;
		case 1:
			System.out.println("1.�Է°� : "+select); 
			break;
		case 2:System.out.println("2.�Է°� : "+select); break;
		case 3:System.out.println("3.�Է°� : "+select); break;
		default:System.out.println("1,2,3�� ������ �ٸ� �� �Է�");break;
		}
}
}
