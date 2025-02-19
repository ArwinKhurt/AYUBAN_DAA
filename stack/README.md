# Stack Implementation

## Overview
This project provides an implementation of a **Stack** in Java. It allows pushing, popping, and displaying elements in a **Last-In-First-Out (LIFO)** manner.

## Features
git add README.md
- Push elements onto the stack
- Pop elements from the stack
- Display the stack contents
- Check if the stack is full or empty

## Implementation

The **Stack** is implemented using an **array** with a `top` pointer to manage insertions and deletions efficiently. It follows the **LIFO (Last-In-First-Out)** principle.

### Core of the Code

```java
package repo.stack;

class stack {
    private int top;
    private int capacity;
    private int[] array;

    public stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.array = new int[capacity];
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        array[++top] = item;
        System.out.println(item + " pushed onto stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return array[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
```

## Usage

### 1. Creating a Stack
```java
stack myStack = new stack(5);
```

### 2. Pushing Elements
```java
myStack.push(10);
myStack.push(20);
myStack.push(30);
```

### 3. Popping Elements
```java
int removed = myStack.pop();
System.out.println("Popped: " + removed);
```

### 4. Displaying the Stack
```java
myStack.display();
```

## Example Output

https://asciinema.org/a/vRBbVUqN5TRFea2xxIly6QuUR
```
10 pushed onto stack
20 pushed onto stack
30 pushed onto stack
Stack: 30 20 10 
30 popped from stack
Stack: 20 10 
```

## Notes

- The stack follows a **Last-In-First-Out (LIFO)** order.
- Uses a **fixed-size array** to store elements.
- Efficient for **push and pop operations**.

## Author
Name: Arwin Khurt M. Ayuban

