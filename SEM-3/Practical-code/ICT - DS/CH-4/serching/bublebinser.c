#include <stdio.h>

// Binary search
int binarySearch(int array[], int start, int end, int target) {
    if (start > end) {
        return -1; // not found
    }

    int middle = start + (end - start) / 2;

    if (array[middle] == target) {
        return middle;
    }

    if (array[middle] < target) {
        return binarySearch(array, middle + 1, end, target);
    } else {
        return binarySearch(array, start, middle - 1, target);
    }
}

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
    printf("\n");

    int choice;
    while (1) {
        printf("Enter your choice:\n");
        printf("1. Search for an element\n");
        printf("2. Print the array\n");
        printf("3. Exit\n");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                // calling binary search
                int key;
                printf("Enter key to search: ");
                if (scanf("%d", &key) != 1) {
                    printf("Error reading input.\n");
                    return 1;
                }

                int index = binarySearch(array, 0, arraySize - 1, key);
                if (index == -1) {
                    printf("Key not found in the array.\n");
                } else {
                    printf("Key found at index %d.\n", index);
                }
                break;
            case 2:
                printf("Array: ");
                for (int i = 0; i < arraySize; i++) {
                    printf("%d ", array[i]);
                }
                printf("\n");
                break;
            case 3:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
                break;
        }
    }

    return 0;
}


/*
Enter size: 5
Enter 5 elements: 9 2 5 3 1
Array after bubble sort: 1 2 3 5 9 
Enter your choice:
1. Search for an element
2. Print the array
3. Exit
1
Enter key to search: 3
Key found at index 2.
Enter your choice:
1. Search for an element
2. Print the array
3. Exit
2
Array: 1 2 3 5 9 
Enter your choice:
1. Search for an element
2. Print the array
3. Exit
3
Exiting...
*/