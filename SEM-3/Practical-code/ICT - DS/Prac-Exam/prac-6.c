// Defination 6 :-

// Write a program to sort the elements of an array using insertion sort. After sorting print the memory address of the largest element

#include <stdio.h>
int main() {
    int arraySize;                                                  // array size

    printf("Enter size: ");                                         
    if (scanf("%d", &arraySize) != 1) {
        printf("Error reading input.\n");
        return 1;
    }

    if (arraySize <= 0) {                                          //cheking if positive or not
        printf("Array size must be positive.\n");
        return 1;
    }

    int array[arraySize];                                           // initializing size into array

    printf("Enter %d elements: ", arraySize);                       // Adding elements
    for (int i = 0; i < arraySize; i++) {
        if (scanf("%d", &array[i]) != 1) {
            printf("Error reading input.\n");
            return 1;
        }
    }

// insertion short

    for (int i = 1; i < arraySize; i++) {
        int temp = array[i];
        int p = i - 1;                                      //p = pointer
            while (p >= 0 && array[p] > temp) {
                array[p + 1] = array[p];
                p--;
            }
        array[p + 1] = temp;
    }

    printf("Array after insertion sort: ");
    for (int i = 0; i < arraySize; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");


    printf("Memory address of largest element: %p\n", &array[arraySize - 1]);         // printing the memory address of larget element

    return 0;
}

/*
O/P:-

Enter size: 5
Enter 5 elements: 3 9 6 2 7
Array after insertion sort: 2 3 6 7 9 
Memory address of largest element: 0x7ffcc3fe21c0

*/
