package chapter3;


/*
 *  2020.04.03 ī�� ��ȣ���߱� ����

 *  by. sangmin
 */

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		startGame();
	}
	
	// ������ �����ϴ� startGame �޼ҵ�
	static void startGame() {
		// 0~100 ���� ���� ����
		int result = (int)(Math.random()*100);
		
		System.out.println("Hidden number is created. Try it!");
		System.out.print("Input Number (For loop : 1 / While loop : 2 / Do-while loop : 3) \n"
				+ ">> ");	
		
		Scanner scanner = new Scanner(System.in);	
		int num = scanner.nextInt();
		
		// ������� �Է¿� ���� ���� �ٸ� �ݺ��� �޼ҵ� ���
		// ���ڷ� ������ ���� �� ����
		if (num == 1) 
			forLoop(result);
		else if (num == 2) 
			whileLoop(result);
		else if (num == 3) 
			dowhileLoop(result);
	}
	
	// ���� ���� ���θ� ���� continueGame �޼ҵ�
	static void continueGame() {		
		while(true) {
			System.out.print("More Game(y/n) >> ");
			Scanner scanner = new Scanner(System.in);
			String ans = scanner.next();
			
			// y �Է� �� startGame �޼ҵ� �����Ͽ� ���� �����
			if (ans.equals("y")) {
				startGame();
				break;
			}
			// n �Է� �� ���α׷� ����
			else if (ans.equals("n")) {
				System.out.println("End Game");
				break;
			}
			// y�� n �̿��� ���� �Է� �� while�� ��� �ݺ�
			else 
				continue;
		}
	}
	
	// for���� ����� forLoop �޼ҵ�
	static void forLoop(int result) {	
		System.out.println("You selected For loop !");
		
		// ������ result ���� ����ڰ� �Է��ϴ� val ���� ���������� ���� �ݺ�
		for (;;) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input number >> ");
			int val = scanner.nextInt();
			
			if (val > result) {
				System.out.println(" --> Lower !");
				continue;
			}
			else if (val < result) {
				System.out.println(" --> Higher !");
				continue;
			}
			// ������ ���� ��� ���� ���� ���θ� ���� continueGame �޼ҵ� ����
			else {
				System.out.println(" --> Correct !");
				continueGame();
				break;
			}
		}
	}
	
	// while���� ����� whileLoop �޼ҵ�
	static void whileLoop(int result) {	
		System.out.println("You selected While loop !");
		
		// ������ result ���� ����ڰ� �Է��ϴ� val ���� ���������� ���� �ݺ�
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input number >> ");
			int val = scanner.nextInt();
			
			if (val > result) {
				System.out.println(" --> Lower !");
				continue;
			}
			else if (val < result) {
				System.out.println(" --> Higher !");
				continue;
			}
			// ������ ���� ��� ���� ���� ���θ� ���� continueGame �޼ҵ� ����
			else {
				System.out.println(" --> Correct !");
				continueGame();
				break;
			}
		}
	}
	
	// do-while���� ����� dowhileLoop �޼ҵ�
	static void dowhileLoop(int result) {	
		System.out.println("You selected Do-while loop !");
		
		// ������ result ���� ����ڰ� �Է��ϴ� val ���� ���������� ���� �ݺ�
		do {	
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input number >> ");
			int val = scanner.nextInt();
			
			if (val > result) {
				System.out.println(" --> Lower !");
				continue;
			}
			else if (val < result) {
				System.out.println(" --> Higher !");
				continue;
			}
			// ������ ���� ��� ���� ���� ���θ� ���� continueGame �޼ҵ� ����
			else {
				System.out.println(" --> Correct !");
				continueGame();
				break;
			}
		} while(true);
	}
}
