// programming homework by sangmin

/*
�Ʒ��� ����ü�� ����Ͽ� 5�� ��ǥ���� ���� �迭�� �����ϰ�, 5���� ��ǥ���� �о� �鿩��. 
�׸��� 5���� ��ǥ���� ���� ���� ������ �Ÿ��� ����Ͽ� ���� ����� �� ��ǥ���� �� �Ÿ��� ����϶�.
	struct point {
	   int x, y;
	};
*/

#include <stdio.h>
#include <math.h>

struct point {
	int x, y;
};

int main() {
	struct point arr[5];
	double dist, min;
	int index1, index2;

	for (int i = 0; i < 5; i++) {
		printf("%d��° ��ǥ (x, y) �Է�: ", i + 1);
		scanf_s("%d %d", &arr[i].x, &arr[i].y);
	}

	min = sqrt(pow((arr[0].x - arr[1].x), 2) + pow((arr[0].y - arr[1].y), 2));
	for (int i = 1; i < 5; i++) {
		for (int j = i + 1; j < 5; j++) {
			dist = sqrt(pow((arr[i].x - arr[j].x), 2) + pow((arr[i].y - arr[j].y), 2));

			if (dist < min) {
				min = dist;
				index1 = i;
				index2 = j;
			}
		}
	}

	printf("\n========== ���� ����� ��ǥ ==========\n");
	printf("ù��° ��ǥ: (%d, %d)\n", arr[index1].x, arr[index1].y);
	printf("�ι�° ��ǥ: (%d, %d)\n", arr[index2].x, arr[index2].y);
	printf("�� ��ǥ ���� �Ÿ�: %lf\n", min);

	return 0;
}