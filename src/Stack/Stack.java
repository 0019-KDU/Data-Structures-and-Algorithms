package Stack;

public class Stack {
    int[] arr;
    int top;
    int capacity;

    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    //check the stack full or empty
    Boolean isFull(){
        return top+1==capacity;
    }

    //check the stack empty
    Boolean isEmpty(){
        return  top==-1;
    }

    //enter the value stack
    void push(int x){
        if(isFull()){
            System.out.println("Over flow !");
        }else {
            top++;
            arr[top]=x;
            System.out.println("Inserting :"+x);
        }
    }
    //remove the value from stack
    void pop(){
        if (isEmpty()){
            System.out.println("Stack Empty !");
        }else {
            System.out.println("Removing :"+arr[top]);
            top--;
        }
    }

    //print the stack
    void printStack(){
        System.out.println("Print Stack");
        for (int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack myStack=new Stack(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.pop();
        myStack.pop();

        myStack.printStack();

    }
}
