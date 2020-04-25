package chapter6;

public class Fish extends GameObject {
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	public void move() {
		// 1~4 ���� ������ ���� ����
		int num = (int)(Math.random()*4 + 1);
		
		// ���� ��ǥ�� �� ĭ���� �ʱ�ȭ
		Game.background[x][y] = '��';
		
		// ����� �������� ���� ����
		switch(num) {
		// y=0(�� ����)�� ���� ���� ��쿡�� �������� �̵�
		case 1:
			if (y != 0)
				y = y - distance;
			break;
		// x=9(�� �Ʒ�)�� ���� ���� ��쿡�� �Ʒ��� �̵�
		case 2:
			if (x != 9)
				x = x + distance;
			break;
		// x=0(�� ��)�� ���� ���� ��쿡�� ���� �̵�
		case 3:
			if (x != 0)
				x = x - distance;
			break;
		// y=19(�� ������)�� ���� ���� ��쿡�� ���������� �̵�
		case 4:
			if (y != 19)
				y = y + distance;
			break;
		}
		
		// �̵��� ��ǥ�� getShape() �Լ��� ���� F ǥ��
		Game.background[x][y] = getShape();

	}

	@Override
	public char getShape() {
		return 'F';
	}
}
