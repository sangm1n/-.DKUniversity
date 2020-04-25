package chapter6;

// �߻� Ŭ����
public abstract class GameObject {
	protected int distance;		// �� �� �̵� �Ÿ�
	protected int x, y;			// ���� ��ġ (ȭ�� �� ���� ��ġ)
	
	// �ʱ� ��ġ�� �̵� �Ÿ� ����
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// �� ��ü�� ��ü p�� �浹������ true ����
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	// �̵��� ���� ���ο� ��ġ�� x, y ����
	public abstract void move();
	// ��ü�� ����� ��Ÿ���� ���� ����
	public abstract char getShape();
}
