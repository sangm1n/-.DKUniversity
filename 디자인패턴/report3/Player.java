package chapter4;

import java.util.Scanner;

public class Player {
	Scanner scanner = new Scanner(System.in);
	
	public String name;
	public String input;
	
	// �Է¹��� �ܾ �������ִ� �޼ҵ�
	public String getWordFromUser() {
		input = scanner.next();
		return input;
	}
	
	// �Ű������� ������ ���ڸ� �Է¹޾� T/F �������ִ� �޼ҵ�
	public boolean checkSuccess(char lastChar) {
		// �Ű������� ���� ������ ���ڿ� �Է��� ù���ڰ� ���� ��� true
		if (lastChar == input.charAt(0))
			return true;
		// �׷��� ������ false
		else
			return false;
	}
}
