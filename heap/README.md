# HEAP

## Overview
This project provides an implementation of a **Max Heap** in Java. It allows insertion, deletion of the maximum element, and displaying the heap structure.

## Features

- Insert elements into the heap
- Remove the maximum element
- Display the heap structure

## Implementation

The **Max Heap** is implemented using a **List** (ArrayList) as the underlying data structure. It maintains the heap property using **heapify-up** during insertions and **heapify-down** during deletions.

## Usage

### 1. Creating a Heap
```java
heap myHeap = new heap();
```

### 2. Inserting Elements
```java
myHeap.insert(10);
myHeap.insert(20);
myHeap.insert(5);
```

### 3. Removing Maximum Element
```java
int max = myHeap.removeMax();
System.out.println("Max element removed: " + max);
```

### 4. Displaying the Heap
```java
myHeap.display();
```

## Example Output

https://asciinema.org/a/BpAOMmbZfpy2vXVwEQsCIhr4l
```
Heap after insertions:
[20, 15, 5, 10]
Max element removed: 20
Heap after removal:
[15, 10, 5]
```

## Notes

- The heap maintains the **Max Heap** property where the highest value is always at the root.
- It uses **heapify-up** for insertion and **heapify-down** for removal.
- Implemented using an **ArrayList** for dynamic resizing.

## Author
Name: Ayuban, Arwin Khurt M.

