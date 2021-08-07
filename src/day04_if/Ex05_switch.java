package day04_if;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("문자열 입력");
		str = input.next();
		switch(str) {//넣으려고 하는 변수명을 적어줌
		case "안녕" : System.out.println("안녕을 입력");break;
		case "그래" : System.out.println("그래를 입력");break;
		}
		System.out.println("다음 문장들 실행");
	}

}
//이렇게 dafault가 없는 경우 아무것도 출력돼지 않고 다음장들 실행이 나옴