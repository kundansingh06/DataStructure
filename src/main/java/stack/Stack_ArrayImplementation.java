package stack;
public class Stack_ArrayImplementation {
    int top;
    int capacity;
    int [] arr;
    Stack_ArrayImplementation(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    boolean isEmpty() {
        return (top < 0);
        //return top == -1;  or return size() == 0;
    }
    public int size() {
        return top + 1;
    }
    public boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
        return -1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public int pop() {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
    public static void main(String[] args) {
        Stack_ArrayImplementation stack=new  Stack_ArrayImplementation(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("Stack: ");
        stack.printStack();

    }
}
