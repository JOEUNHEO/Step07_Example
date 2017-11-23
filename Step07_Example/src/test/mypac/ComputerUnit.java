package test.mypac;

import java.util.Random;

public class ComputerUnit {
	//���ڸ� ���ȭ ��Ű��
	public static final int Scissor = 0;
	public static final int Rock = 1;
	public static final int Paper = 2;
	
	private int computerState = new Random().nextInt(2);
	
	public void getComputerState() {
		if(this.computerState == Scissor) {
			System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
		}else if(this.computerState == Rock){
			System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
		}else if(this.computerState == Paper) {
			System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");
		}
	}
	
	public void Fight(int userState) {
		if(this.computerState == userState) {
			System.out.println("�����ϴ�.");
		}else if(this.computerState == Scissor && userState == Rock ||
				 this.computerState == Rock && userState == Paper ||
				 this.computerState == Paper && userState == Scissor) {
			System.out.println("����� �̰���ϴ�.");
		}else if(this.computerState == Scissor && userState == Paper ||
				 this.computerState == Rock && userState == Scissor ||
				 this.computerState == Paper && userState == Rock) {
			System.out.println("����� �����ϴ�.");
		}
	}
}
