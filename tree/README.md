# Binary Search Tree Implementation

## Overview
This project provides an implementation of a **Binary Search Tree (BST)** in Java. It allows inserting elements and performing an **inorder traversal** to display the elements in sorted order.

## Features

- Insert elements into the BST
- Perform an inorder traversal
- Maintain a sorted binary tree structure

## Implementation

The **Binary Search Tree (BST)** is implemented using a **Node** class that contains the data, left child, and right child. The `tree` class manages insertion and traversal.

### Core of the Code

```java
package repo.tree;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree {
    Node root;

    public tree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
```

## Usage

### 1. Creating a Binary Search Tree
```java
tree myTree = new tree();
```

### 2. Inserting Elements
```java
myTree.insert(50);
myTree.insert(30);
myTree.insert(20);
myTree.insert(40);
myTree.insert(70);
myTree.insert(60);
myTree.insert(80);
```

### 3. Performing Inorder Traversal
```java
myTree.inorder();
```

## Example Output
```
Inorder traversal of the tree:
20 30 40 50 60 70 80 
```

## Notes

- The tree follows the **Binary Search Tree (BST) property**, where the left child is smaller than the parent, and the right child is greater.
- Inorder traversal outputs the elements in **sorted order**.
- The insert function maintains the BST structure efficiently.

## License
This project is open-source and free to use.

