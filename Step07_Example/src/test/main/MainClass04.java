package test.main;

import java.util.Scanner;

import test.mypac.ComputerUnit;
import test.mypac.UserUnit;

public class MainClass04 {
	public static void main(String[] args) {
		//유저가 가위, 바위, 보를 낸다.
		Scanner scan = new Scanner(System.in);
		System.out.println("Sissor(0), Rock(1), Paper(2) 입력:");
		//유저의 입력값을 받는다.
		UserUnit user = new UserUnit();
		user.setUserState(scan.nextInt());
		//유저의 낸 값이 무엇인지 출력한다.
		int userState = user.Attack();
		
		//컴퓨터가 가위, 바위, 보를 낸다.
		ComputerUnit computer = new ComputerUnit();
		computer.getComputerState();
		
		//유저와 컴퓨터랑 가위, 바위, 보 한 결과를 출력한다.
		computer.Fight(userState);
	}
}
