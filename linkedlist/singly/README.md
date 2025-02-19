# Doubly Linked List Implementation

## Overview
This project provides an implementation of a **Singly Linked List** in Java. A singly linked list is a linear data structure where each node points only to its **next** node.

## Features

- Insert elements into the list
- Display the list in forward order
- Simple, efficient, and dynamically allocated structure

## Implementation

Each node contains:
- `data`: Stores the value of the node.
- `next`: Points to the next node in the list.

### Core of the Code

```java
package repo.linkedlist.singly;

class Node {
    int data;
    Node next; 

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singly {
    private Node head;

    public singly() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; 
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singly list = new singly();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Singly Linked List:");
        list.display();
    }
}
```

## Usage

### 1. Creating a Singly Linked List

```java
singly list = new singly();
```

### 2. Inserting Elements

```java
list.insert(10);
list.insert(20);
```

### 3. Displaying the List

```java
list.display();
```

## Example Output

```
Singly Linked List:
10 -> 20 -> 30 -> 40 -> null
```

## Notes

- The list is **unidirectional**, meaning traversal is only possible in **one direction**.
- Simple structure with minimal overhead.
- Dynamically grows as elements are added.

## Author
Name: Arwin Khurt Ayuban
