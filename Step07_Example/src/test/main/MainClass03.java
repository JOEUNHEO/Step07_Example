package test.main;

import java.rmi.server.SocketSecurityException;
import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �Է�:");
		//���� �Է� �ޱ�
		int inputNum = scan.nextInt();
		
		//����ڰ� �� ������������ ����Ѵ�.
		if(inputNum == 0) {
			System.out.println("������ �½��ϴ�.");
		}else if(inputNum == 1) {
			System.out.println("������ �½��ϴ�.");
		}else if(inputNum == 2) {
			System.out.println("���� �½��ϴ�.");
		}
		
		//��ǻ�Ͱ� �� ������������ ����Ѵ�.
		int outputNum = new Random().nextInt(2);
		if(outputNum == 0) {
			System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
		}else if(outputNum == 1) {
			System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
		}else if(outputNum == 2){
			System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");
		}
		
		//����� ���忡�� ����� ����Ѵ�.
		if(inputNum == outputNum) {//����� ���
			System.out.println("�����ϴ�.");
		}else if(inputNum == 0 && outputNum == 2 || inputNum == 1 && outputNum == 0 || inputNum == 2 && outputNum == 1) {//����ڰ� �̰��� ���
			System.out.println("����� �̰���ϴ�!");
		}else if(inputNum == 0 && outputNum == 1 || inputNum == 1 && outputNum == 2 || inputNum == 2 && outputNum == 0) {//���� ���
			System.out.println("����� �����ϴ�!");
		}
		
	}
}
