#include <stdio.h>
int main() {
    int arraySize;

    printf("Enter size: ");
    if (scanf("%d", &arraySize) != 1) {
        printf("Error reading input.\n");
        return 1;
    }

    if (arraySize <= 0) {
        printf("Array size must be positive.\n");
        return 1;
    }

    int array[arraySize];

    printf("Enter %d elements: ", arraySize);
    for (int i = 0; i < arraySize; i++) {
        if (scanf("%d", &array[i]) != 1) {
            printf("Error reading input.\n");
            return 1;
        }
    }

    // Insertion sort
    for (int i = 1; i < arraySize; i++) {
        int temp = array[i];
        int pointer = i - 1;
        while (pointer > 0 && array[pointer] > temp) {
            array[pointer + 1] = array[j];
            pointer--;
        }
        array[pointer + 1] = temp;
    }

    printf("Array after insertion sort: ");
    for (int i = 0; i < arraySize; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

    return 0;
}