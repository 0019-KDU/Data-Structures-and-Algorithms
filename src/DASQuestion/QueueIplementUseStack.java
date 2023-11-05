package DASQuestion;

public class QueueIplementUseStack {
    private int maxSize;
    private int top;
    public int[] data;

    public QueueIplementUseStack(int size) {
        this.maxSize = size;
        this.data = new int[maxSize];
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            data[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }


}
class QueueUsingStacks {
    private QueueIplementUseStack stack1;
    private QueueIplementUseStack stack2;

    public QueueUsingStacks(int size) {
        stack1 = new QueueIplementUseStack(size);
        stack2 = new QueueIplementUseStack(size);
    }

    public void enqueue(int item) {
        if (stack1.isFull() || stack2.isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            stack1.push(item);
            System.out.println("Enqueued: " + item);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int dequeuedItem = stack2.pop();
        System.out.println("Dequeued: " + dequeuedItem);
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public int[] getFullQueue() {
        int[] fullQueue = new int[size()];
        int index = 0;

        for (int i = 0; i < stack2.size(); i++) {
            fullQueue[index++] = stack2.data[i];
        }
        for (int i = stack1.size() - 1; i >= 0; i--) {
            fullQueue[index++] = stack1.data[i];
        }

        return fullQueue;
    }


    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue(); // Output: Enqueued: 1, Enqueued: 2, Enqueued: 3, Dequeued: 1

        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue(); // Output: Enqueued: 4, Enqueued: 5, Dequeued: 2

        queue.dequeue(); // Output: Dequeued: 3
        //queue.dequeue(); // Output: Dequeued: 4, Dequeued: 5

        int[] fullQueue = queue.getFullQueue();
        System.out.print("Full Queue: ");
        for (int item : fullQueue) {
            System.out.print(item + " ");
        }
    }
}