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

    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        stack.display();
        
        System.out.println(stack.pop() + " popped from stack");
        stack.display();
    }
}
