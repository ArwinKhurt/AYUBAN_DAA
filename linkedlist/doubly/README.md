# Doubly Linked List Implementation

## Overview
This project provides an implementation of a **Doubly Linked List** in Java. A doubly linked list is a linear data structure where each node points to both its **next** and **previous** nodes.

## Features

- Insert elements into the list
- Display the list in forward order
- Doubly linked structure allows traversal in both directions

## Implementation

Each node contains:
- `data`: Stores the value of the node.
- `next`: Points to the next node in the list.
- `prev`: Points to the previous node in the list.

### Core of the Code

```java
package repo.linkedlist.doubly;

class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doubly {
    private Node head;

    public doubly() {
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
            newNode.prev = temp;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doubly list = new doubly();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Doubly Linked List:");
        list.display();
    }
}
```

## Usage

### 1. Creating a Doubly Linked List

```java
doubly list = new doubly();
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
Doubly Linked List:
10 <-> 20 <-> 30 <-> 40 <-> null
```

## Notes

- The list allows **bi-directional traversal**.
- Each node has both `next` and `prev` pointers.
- The list grows dynamically without predefined size constraints.

## License

This project is open-source and free to use.

