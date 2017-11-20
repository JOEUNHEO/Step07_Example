package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		// Scanner 객체 생성해서
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력:");
		// 문자열 입력 받기
		String msg = scan.nextLine();
		
		System.out.println("msg:"+msg);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
