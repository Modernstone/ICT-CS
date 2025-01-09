// write a program of sequential search 


#include <stdio.h>

int main() {
    int size, searchElement;
    printf("Enter size: ");
    scanf("%d", &size);

    int array[size];
    printf("Enter %d elements: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    printf("Enter element to search: ");
    scanf("%d", &searchElement);

    int found = 0;
    for (int i = 0; i < size; i++) {
        if (array[i] == searchElement) {
            printf("Element found at index %d\n", i);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Element not found\n");
    }

    return 0;
}
