package test.main;

import java.rmi.server.SocketSecurityException;
import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 입력:");
		//정수 입력 받기
		int inputNum = scan.nextInt();
		
		//사용자가 낸 가위바위보를 출력한다.
		if(inputNum == 0) {
			System.out.println("가위를 냈습니다.");
		}else if(inputNum == 1) {
			System.out.println("바위를 냈습니다.");
		}else if(inputNum == 2) {
			System.out.println("보를 냈습니다.");
		}
		
		//컴퓨터가 낸 가위바위보를 출력한다.
		int outputNum = new Random().nextInt(2);
		if(outputNum == 0) {
			System.out.println("컴퓨터가 가위를 냈습니다.");
		}else if(outputNum == 1) {
			System.out.println("컴퓨터가 바위를 냈습니다.");
		}else if(outputNum == 2){
			System.out.println("컴퓨터가 보를 냈습니다.");
		}
		
		//사용자 입장에서 결과를 출력한다.
		if(inputNum == outputNum) {//비겼을 경우
			System.out.println("비겼습니다.");
		}else if(inputNum == 0 && outputNum == 2 || inputNum == 1 && outputNum == 0 || inputNum == 2 && outputNum == 1) {//사용자가 이겼을 경우
			System.out.println("당신이 이겼습니다!");
		}else if(inputNum == 0 && outputNum == 1 || inputNum == 1 && outputNum == 2 || inputNum == 2 && outputNum == 0) {//졌을 경우
			System.out.println("당신이 졌습니다!");
		}
		
	}
}
