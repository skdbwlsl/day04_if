package day04_if;

import java.util.Scanner;

public class Ex06_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name=null;
		int num =0;
		if(num==1) {
			name = "test";
		}
		System.out.println(name);
	
	//while�� �ݺ�,������ ��� �ݺ������ش�
	while(true) {
		System.out.print("�̸� �Է�");
		name = input.next();
		System.out.println("����� �̸���" +name+ "�̱���");
	}

}
}