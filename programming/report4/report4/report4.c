// programming homework by sangmin

/*
���� �޸� �Ҵ��� ����Ͽ� ������ �迭�� �����ϰ�, �� �迭�� ũ�⸸ŭ ������ �Է¹޴´�.
�̶� ���� ������ 1�� �̻� �Էµ� �� ������, �ߺ����� ���� �����鸸�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 3���� �ٸ� �����Ϳ� ���� ���α׷��� �����Ͻÿ�.
*/

#include <stdio.h>

int main() {
    int size;
    int* arr = NULL;                            // ���� �޸� �ּ�
    printf("�迭�� ũ�� �Է�: ");
    scanf_s("%d", &size);

    arr = malloc(sizeof(int) * size);           // ���� �޸� �Ҵ�
    printf("%d���� ���� �Է�: ", size);
    for (int i = 0; i < size; i++)
        scanf_s("%d", &arr[i]);

    printf("�ߺ����� ���� ������: ");
    for (int i = 0; i < size; i++) {
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (arr[i] == arr[j])               // ���� �� ������
                count++;                        // count 1 ����
        }
        if (count == 1)
            printf("%d ", arr[i]);
    }

    free(arr);                                  // ���� �޸� ����

    return 0;
}