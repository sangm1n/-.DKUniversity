package chapter2;


/*
 *  2020.03.23 ��������������
 *  by. sangmin
 */
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		System.out.println("<<<<< ���� ���� �� ���� (��� �� �ٽ�) >>>>>\n");
		
		// �ݺ����� �����ϱ� ���� ���� ���� go
		int go = 0;
		
		while(go == 0) {
			System.out.print("person-A >> ");					
			Scanner scanner = new Scanner(System.in);
			String pA = scanner.next();
			
			// A�� ����, ����, �� �� �ϳ��� �Է��� ���
			if (pA.equals("����") | pA.equals("����") | pA.equals("��")) {
				while(true) {
					System.out.print("person-B >> ");
					String pB = scanner.next();
					
					// B�� ����, ����, �� �� �ϳ��� �Է��� ���
					if (pB.equals("����") | pB.equals("����") | pB.equals("��")) {
						// switch������ ����� ���� ��� go ������ 1�� �����Ͽ� ���� ����
						// ��� ��� go ������ �״�� 0�̹Ƿ� ����ؼ� ���� �ݺ�
						switch(pA) {
						case "����":
							switch(pB) {
							case "����":
								System.out.println("��� : �����ϴ�.");
								break;
							case "����":
								System.out.println("��� : B�� �̰���ϴ�.");
								go = 1;
								break;
							case "��":
								System.out.println("��� : A�� �̰���ϴ�.");
								go = 1;
								break;
							}
							break;
						case "����":
							switch(pB) {
							case "����":
								System.out.println("��� : A�� �̰���ϴ�.");
								go = 1;
								break;
							case "����":
								System.out.println("��� : �����ϴ�.");
								break;
							case "��":
								System.out.println("��� : B�� �̰���ϴ�.");
								go = 1;
								break;
							}
							break;
						case "��":
							switch(pB) {
							case "����":
								System.out.println("��� : B�� �̰���ϴ�.");
								go = 1;
								break;
							case "����":
								System.out.println("��� : A�� �̰���ϴ�.");
								go = 1;
								break;
							case "��":
								System.out.println("��� : �����ϴ�");
								break;
							}
							break;
						}
						break;
					}
					// B�� ����, ����, �� �̿��� ���ڸ� �Է��� ��� �ݺ��� ��� ����
					else
						continue;
				}
			}			
			// A�� ����, ����, �� �̿��� ���ڸ� �Է��� ��� �ݺ��� ��� ����
			else
				continue;
		}
	}
}
