/* develop the Data structure program to implement the concept of queue using Doubly link list (switch case) in c*/
//Fist in first out 
// insert first and delete last

#include<stdio.h>
#include<stdlib.h>

struct Node {
    int info;
    struct Node* next; 
    struct Node* prev;  
};

struct Queue {
    struct Node* front; 
    struct Node* rear;  
};

// Creation of new Node
struct Node* createNode(int info) {
    struct Node* newnode = (struct Node*)malloc(sizeof(struct Node));
    newnode->info = info;
    newnode->next = NULL;
    newnode->prev = NULL;
    return newnode;
}

// Creating queue
struct Queue* createqueue() {
    struct Queue* q = (struct Queue*)malloc(sizeof(struct Queue));
    q->front = NULL;
    q->rear = NULL;
    return q;
}

// check if its Empty used for display
int isEmpty(struct Queue* q) {
    return (q->front == NULL);
}

//Inserting
void insert(struct Queue* q, int info) {
    struct Node* newnode = createNode(info);
    if (q->rear == NULL) {
        q->front = q->rear = newnode;
    } else {
        newnode->prev = q->rear;
        q->rear->next = newnode;
        q->rear = newnode;
    }
}

//Deletaion
int delete(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return -1; 
    }
    
    struct Node* temp = q->front;
    int dv = temp->info;
    
    q->front = q->front->next;
    
    if (q->front == NULL) {
        q->rear = NULL; 
    } else {
        q->front->prev = NULL;
    }
    
    free(temp);
    return dv;
}

//Display 
void display(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return;
    }
    
    struct Node* temp = q->front;
    printf("Queue contents: ");
    while (temp != NULL) {
        printf("%d ", temp->info);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    struct Queue* q = createqueue();
    int choice, info;
//while and switch case to select prefered chocie
    while(1) {
        printf("\nqueue using Doubly link list\n");
        printf("1. Insert\n");
        printf("2. Delete\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                printf("Enter the element to insert: ");
                scanf("%d", &info);
                insert(q, info);
                display(q);
                break;
            case 2:
                info = delete(q);
                if(info != -1)
                    printf("Deleted element: %d\n", info);
                    display(q);
                break;
            case 3:
                display(q);
                break;
            case 4:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}

/*
queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 1
Enter the element to insert: 20
Queue contents: 20 

queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 1
Enter the element to insert: 30
Queue contents: 20 30 

queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 1
Enter the element to insert: 40
Queue contents: 20 30 40 

queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 1
Enter the element to insert: 50
Queue contents: 20 30 40 50 

queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 2
Deleted element: 20
Queue contents: 30 40 50 

queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 3
Queue contents: 30 40 50 

queue using Doubly link list
1. Insert
2. Delete
3. Display
4. Exit
Enter your choice: 4
Exiting...
*/