package test.mypac;

public class UserUnit {
	//숫자를 상수화 시키기
	public static final int Scissor = 0;
	public static final int Rock = 1;
	public static final int Paper = 2;
	
	private int userState = 0;

	public void setUserState(int userState) {
		this.userState = userState;
	}
	
	public int Attack() {
		if(userState == Scissor) {
			System.out.println("가위를 냈습니다.");
		}else if(userState == Rock) {
			System.out.println("바위를 냈습니다.");
		}else if(userState == Paper) {
			System.out.println("보를 냈습니다.");
		}
		
		return this.userState;
	}
}
