package DASQuestion;

public class Reversetheelementsofastack {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    Reversetheelementsofastack(int size){
        arr=new int[size];
        top=-1;
    }

    // Method to push an element onto the stack
    public void push(int num){
        if(top==arr.length-1){
            System.out.println("Stack is full");
        }else{
            top++;
            arr[top]=num;
        }
    }

    // Method to pop an element from the stack
    public int pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
            return -1;
        }else{
            int popedElement=arr[top];
            top--;
            return popedElement;
        }
    }
    // Method to get the top element of the stack
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return arr[top];
        }
    }
    // Method to check if the stack is empty
    boolean isEmpty(){
        return top==-1;
    }

    public void reverse(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }

        int[] reversedArray=new int[arr.length];
        int index=0;

        while(!isEmpty()){
            int temp=pop();
            reversedArray[index++]=temp;
        }

        for (int i=0;i<index;i++){
            push(reversedArray[i]);
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Stack elemet is :");
            for(int i=top;i>=0;i--){
                System.out.print(arr[i]+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Reversetheelementsofastack myStack=new Reversetheelementsofastack(5);
        System.out.println("\nInput some elements on the stack:");
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.display();
        System.out.println("\nReverse the elements of the said stack:");
        myStack.reverse();
        myStack.display();
        System.out.println("\nInput two more elements on the stack:");
        myStack.reverse();
        myStack.display();
        myStack.push(5);
        //myStack  .pop();
        myStack.display();


    }
}
