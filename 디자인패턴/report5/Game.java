package chapter6;

import java.util.Scanner;

public class Game {
	// 10�� 20���� ������ �迭 ����
	static char background[][] = new char[10][20];	
	int height = 10;
	int width = 20;
	Bear bear;
	Fish fish;
	
	// ��ü���� ������ �����ϴ� �޼ҵ�
	public void runGame() {
		startShow();
		
		while(true) {
			int i;	
			// fish�� ���������� ī��Ʈ���ִ� ����
			int count = 0;			
			
			int random[] = new int[2];
			// 0~4 ���� �ߺ��� �����Ͽ� ������ �� 2�� ����
			for (i = 0; i < 2; i++) {
				random[i] = (int)(Math.random() * 5);
				
				for (int j = 0; j < i; j++) {
					if (random[i] == random[j]) {
						i--;
						break;
					}
				}
			}
			
			// 5���� �� �������� ����
			for (int j = 0; j < 5; j++) {
				gameShow();
				
				bear.move();
				// bear�� �������µ� collide �޼ҵ尡 true ���� �� ���� ����
				if((bear.collide(fish))) {
					endShow();
					System.out.println("Congratulation ! Bear eat the Fish !!");
					return;
				}
				
				// �����ϰ� ����� �� ���� �ε����� j�� ���� ��� fish ��ġ �̵�
				for (int k = 0; k < 2; k++) {
					if (j == random[k]) {
						count++;
						fish.move();
					}
				}
			}
		}
	}
	
	// ������ ���۵ǰ� ó������ �������� ������
	public void startShow() {
		int bHeight, bWidth, fHeight, fWidth;
		// bear�� fish�� ��ġ�� 10�� 20�� �� �����ϰ� ��ġ�� �� �ֵ��� ����
		while(true) {
			bHeight = (int)(Math.random() * 10);
			bWidth = (int)(Math.random() * 20);
			fHeight = (int)(Math.random() * 10);
			fWidth = (int)(Math.random() * 20);
			
			// bear�� fish�� �������� ��ġ�� �ʵ���
			if (bHeight != fHeight && bWidth != fWidth)
				break;
		}
		
		bear = new Bear(bHeight, bWidth, 1);
		fish = new Fish(fHeight, fWidth, 1);
		
		// �������� �� ĭ���� �ʱ�ȭ
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				background[i][j] = '��';
			}
		}
		
		// bear�� fish ���� ��ġ�� ��ü�� ����� ��Ÿ���� ���� ǥ��
		background[bear.x][bear.y] = bear.getShape();
		background[fish.x][fish.y] = fish.getShape();

	}
	
	// ������ ����� ������ �������� ������
	public void gameShow() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(background[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// bear�� fish ��ġ�� �������� ��� �������� ������
	public void endShow() {
		// bear�� ��Ÿ���� ���� ǥ���� ��Ÿ������
		background[bear.x][bear.y] = bear.getShape();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(background[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}

