package chapter6;

/*
 *  2020.04.21 Bear and Fish Game

 *  by. sangmin
 */


public class Main {
	public static void main(String[] args) {
		System.out.println("========== start 'Bear eat Fish' game !! ==========");
		System.out.print("   �� is bear, your mission is reach the F(fish)");
		System.out.println();
		
		// Game ��ü�� ����� runGame() �޼ҵ� ȣ��
		Game g = new Game();
		g.runGame();
	}
}
