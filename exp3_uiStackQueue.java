interface StackOperations {
    void push(int item);
    int pop();
}

class SimpleStack implements StackOperations {
    private int[] arr;
    private int top;
    private int capacity;

    SimpleStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = item;
        System.out.println(item + " pushed to stack");
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(3);
        stack.push(10);
        stack.push(20);
        System.out.println("Popped item: " + stack.pop());
    }
}
