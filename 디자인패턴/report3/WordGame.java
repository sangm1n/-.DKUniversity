package chapter4;

/*
 *  2020.04.11 �����ձ� ����
 *  by. sangmin
 */

import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		// ���� �ܾ�
		String word = "�ƹ���";				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >> ");
		int num = scanner.nextInt();		
		
		run(num, word);
	}
	
	// �ο� ���� ���� �ܾ �Ű������� �ϴ� �޼ҵ�
	public static void run(int num, String word) {
		// �Է¹��� ����ŭ ��ü ����
		Player[] people = new Player[num];
		Scanner scanner = new Scanner(System.in);
		
		// ������ �̸��� Player ��ü�� name ������ ���� 
		for (int i = 0; i < num; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			people[i] = new Player();
			people[i].name = scanner.next();
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");
				
		// while���� �ݺ��ϱ� ���� check ����
		boolean check = true;
		
		while(check) {
			for (int i = 0; i < num; i++) {
				System.out.print(people[i].name + " >> ");
				people[i].getWordFromUser();
				
				// �ܾ��� �� ���ڸ� �ε���
				int lastIndex = word.length() - 1;
				// lastIndex�� ���� �ܾ��� ������ ���ڸ� lastChar ������ ����
				char lastChar = word.charAt(lastIndex);
				
				check = people[i].checkSuccess(lastChar);
				
				// check�� false�� ��� while�� ��������
				if (check == false) {
					System.out.println(people[i].name + "��(��) �����ϴ�");
					break;
				}
				// word ������ �Է��� �ܾ�� �ٲ���
				word = people[i].input;
			}
		}
	}
}
