package test.mypac;

import java.util.Random;

public class ComputerUnit {
	//숫자를 상수화 시키기
	public static final int Scissor = 0;
	public static final int Rock = 1;
	public static final int Paper = 2;
	
	private int computerState = new Random().nextInt(2);
	
	public void getComputerState() {
		if(this.computerState == Scissor) {
			System.out.println("컴퓨터가 가위를 냈습니다.");
		}else if(this.computerState == Rock){
			System.out.println("컴퓨터가 바위를 냈습니다.");
		}else if(this.computerState == Paper) {
			System.out.println("컴퓨터가 보를 냈습니다.");
		}
	}
	
	public void Fight(int userState) {
		if(this.computerState == userState) {
			System.out.println("비겼습니다.");
		}else if(this.computerState == Scissor && userState == Rock ||
				 this.computerState == Rock && userState == Paper ||
				 this.computerState == Paper && userState == Scissor) {
			System.out.println("당신이 이겼습니다.");
		}else if(this.computerState == Scissor && userState == Paper ||
				 this.computerState == Rock && userState == Scissor ||
				 this.computerState == Paper && userState == Rock) {
			System.out.println("당신이 졌습니다.");
		}
	}
}
