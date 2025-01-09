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

    // Bubble sort
    for (int pass = 0; pass < arraySize - 1; pass++) {
        int exchangeCounter = 0;
        for (int i = 0; i < arraySize - 1 - pass; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                exchangeCounter++;
            }
        }
        // If no exchanges occurred in a pass, the array is already sorted
        if (exchangeCounter == 0) {
            break;
        }
    }

    printf("Array after bubble sort: ");
    for (int i = 0; i < arraySize; i++) {
        printf("%d ", array[i]);
    }
}

/*
Enter size: 5
Enter 5 elements: 9 2 3 6 2
Array after bubble sort: 2 2 3 6 9 
*/