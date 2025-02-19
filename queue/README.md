# Queue Implementation

## Overview
This project provides an implementation of a **Circular Queue** in Java. It allows enqueueing, dequeueing, and displaying the queue elements efficiently. The queue operates in a circular manner using an array, making efficient use of space.

## Features

- Enqueue elements into the queue
- Dequeue elements from the queue
- Display the queue contents
- Check if the queue is full or empty

## Implementation

The **Circular Queue** is implemented using an **array** with front and rear pointers to efficiently manage insertions and deletions. The queue follows the **FIFO (First-In-First-Out)** principle. The circular nature ensures optimal use of the allocated memory.

### Core of the Code

```java
package repo.queue;

class queue {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
```

## Usage

### 1. Creating a Queue
```java
queue myQueue = new queue(5);
```

### 2. Enqueue Elements
```java
myQueue.enqueue(10);
myQueue.enqueue(20);
myQueue.enqueue(30);
```

### 3. Dequeue Elements
```java
int removed = myQueue.dequeue();
System.out.println("Dequeued: " + removed);
```

### 4. Displaying the Queue
```java
myQueue.display();
```

## Example Output
```
10 enqueued to queue
20 enqueued to queue
30 enqueued to queue
Queue: 10 20 30 
10 dequeued from queue
Queue: 20 30 
```

## Notes

- The queue is **circular**, meaning the rear wraps around to the front when reaching the array limit.
- Uses **modulus arithmetic** to handle circular behavior.
- Implemented using a **fixed-size array**.
- Efficient for **first-in, first-out (FIFO)** operations.

## Author
Name: Ayuban, Arwin Khurt M.

