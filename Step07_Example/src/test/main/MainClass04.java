package test.main;

import java.util.Scanner;

import test.mypac.ComputerUnit;
import test.mypac.UserUnit;

public class MainClass04 {
	public static void main(String[] args) {
		//������ ����, ����, ���� ����.
		Scanner scan = new Scanner(System.in);
		System.out.println("Sissor(0), Rock(1), Paper(2) �Է�:");
		//������ �Է°��� �޴´�.
		UserUnit user = new UserUnit();
		user.setUserState(scan.nextInt());
		//������ �� ���� �������� ����Ѵ�.
		int userState = user.Attack();
		
		//��ǻ�Ͱ� ����, ����, ���� ����.
		ComputerUnit computer = new ComputerUnit();
		computer.getComputerState();
		
		//������ ��ǻ�Ͷ� ����, ����, �� �� ����� ����Ѵ�.
		computer.Fight(userState);
	}
}
