// programming homework by sangmin

/*
�Էµ� �� ��ŭ�� �������� ���� 7-5�� �������� ���α׷��� �̿��Ͽ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�̷��� ���İ����� �ݺ��ϸ�,
������ ���� �Է��� �� -1 �� �ԷµǸ� ���α׷��� �����ϵ��� �ۼ��Ͻÿ�.
*/

#define MAX 999										// define ��ũ�� ����
#include <stdio.h>

int main() {
	int num, index, tmp = 0;
	int arr[MAX];									// �� �迭 ����

	printf("============= ���� ���α׷� =============\n");
	while (1) {
		printf("\n������ ������ �� �Է� (���� �� -1 �Է�)\n>> ");
		scanf_s("%d", &num);
		if (num == -1)								// -1 �Է� �� ����
			break;

		printf("%d���� ���� ���ʷ� �Է�\n>> ", num);
		for (int i = 0; i < num; i++)
			scanf_s("%d", &arr[i]);

		for (int i = 0; i < num - 1; i++) {			// ��������
			index = i;
			for (int j = i + 1; j < num; j++)		// ���� ���� �� ����
				if (arr[index] > arr[j])
					index = j;

			tmp = arr[i];							// switch
			arr[i] = arr[index];
			arr[index] = tmp;
		}

		printf("���� ���\n>> ");
		for (int i = 0; i < num; i++)
			printf("%d ", arr[i]);
		printf("\n");
	}

	return 0;
}