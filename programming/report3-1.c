// programming homework by sangmin

/*
���� �迭�� �Է¹޾� ���ڿ��� ���̸� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��, ���ڿ��� ���̸� ���� �� ���� �迭�� ���Ҹ� ����Ű�� �����͸� �̿��Ͻÿ�. 
(���ǻ���: ���̺귯�� �Լ��� strlen �Լ��� �̿����� ���� �����Ͻÿ�.)
*/

#include <stdio.h>

int main() {
	char str[100];
	char* p = NULL;					// �� ������
	int count = 0;

	printf("===== ���ڿ� ���� ��� ���α׷� =====\n");
	printf("���ڿ� �Է�: ");
	gets(str);						

	for (p = str; *p; p++)			// *p != '\0' ���� �ݺ�
		count++;
	printf("�Է��� ���ڿ��� ����: %d\n", count);

	return 0;
}