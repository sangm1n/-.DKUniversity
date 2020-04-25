package chapter6;

import java.util.Scanner;

public class Bear extends GameObject {
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	public void move() {
		System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) �Է� >> ");
		
		Scanner scan = new Scanner(System.in);
		// charAt(0)�� ���� �ϳ��� ���� �Է�
		char input = scan.next().charAt(0);
		
		// ���� ��ǥ�� �� ĭ���� �ʱ�ȭ
		Game.background[x][y] = '��';
		
		// �Է¹��� ���ڸ��� switch���� ���� ���� ����
		switch(input) {
		// y=0(�� ����)�� ���� ���� ��쿡�� �������� �̵�
		case 'a':
			if (y != 0)
				y = y - distance;
			break;
		// x=9(�� �Ʒ�)�� ���� ���� ��쿡�� �Ʒ��� �̵�
		case 's':
			if (x != 9)
				x = x + distance;
			break;
		// x=0(�� ��)�� ���� ���� ��쿡�� ���� �̵�
		case 'd':
			if (x != 0)
				x = x - distance;
			break;
		// y=19(�� ������)�� ���� ���� ��쿡�� ���������� �̵�
		case 'f':
			if (y != 19)
				y = y + distance;
			break;
		}
		
		// �̵��� ��ǥ�� getShape() �Լ��� ���� �� ǥ��
		Game.background[x][y] = getShape();
	}

	@Override
	public char getShape() {
		return '��';
	}
	
}
