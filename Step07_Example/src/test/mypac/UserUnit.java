package test.mypac;

public class UserUnit {
	//���ڸ� ���ȭ ��Ű��
	public static final int Scissor = 0;
	public static final int Rock = 1;
	public static final int Paper = 2;
	
	private int userState = 0;

	public void setUserState(int userState) {
		this.userState = userState;
	}
	
	public int Attack() {
		if(userState == Scissor) {
			System.out.println("������ �½��ϴ�.");
		}else if(userState == Rock) {
			System.out.println("������ �½��ϴ�.");
		}else if(userState == Paper) {
			System.out.println("���� �½��ϴ�.");
		}
		
		return this.userState;
	}
}
