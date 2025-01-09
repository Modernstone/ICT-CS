    #include <stdio.h>
    int main() {
        int arraySize;
        int minIndex;

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

        // Selection sort
        for (int pass = 0; pass < arraySize - 1; pass++) {
            minIndex = pass;
            for (int i = pass + 1; i < arraySize; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != pass) {
                int temp = array[pass];
                array[pass] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        printf("Array after selection sort: ");
        for (int i = 0; i < arraySize; i++) {
            printf("%d ", array[i]);
        }
        printf("\n");

        return 0;
    }
