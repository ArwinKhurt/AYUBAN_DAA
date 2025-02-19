# Circular Linked List Implementation

## Overview
This project provides an implementation of a **Circular Linked List** in Java. It supports inserting elements and displaying the list in a circular format.

## Features

- Insert elements into the circular linked list
- Display the elements in circular order
- Maintains a linked list structure with a looped connection

## Implementation

The **Circular Linked List** is implemented using a **Node** class that holds data and a reference to the next node. The `circular` class manages insertion and traversal.

### Core of the Code

```java
package repo.linkedlist.circular;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class circular {
    private Node head;

    public circular() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }
}
```

## Usage

### 1. Creating a Circular Linked List
```java
circular myList = new circular();
```

### 2. Inserting Elements
```java
myList.insert(10);
myList.insert(20);
myList.insert(30);
myList.insert(40);
```

### 3. Displaying the List
```java
myList.display();
```

## Example Output

https://asciinema.org/a/H0JAhG6bswVzcb3auF1FYmR8R
```
Circular Linked List:
10 -> 20 -> 30 -> 40 -> (Back to Head)
```

## Notes

- The list maintains a **circular structure**, meaning the last node points back to the head.
- The `display` method prints all nodes in the list and indicates when it loops back to the head.
- The `insert` method adds new elements to the list while maintaining circular links.

## Author
Name: Aarwin Khurt Ayuban

