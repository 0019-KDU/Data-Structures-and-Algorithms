package Queue;

public class Queue {

    int font;
    int rear;
    int capacity;

    int queueArr[];
    Queue(int size){
        capacity=size;
        font=0;
        rear=-1;
        queueArr=new int[size];
    }

    //check the queue is full
    boolean isFull(){
        return  rear+1==capacity;
    }

    //check the queue is Empty
    boolean isEmpty(){
        return font>rear;
    }

    //add the data for queue
    void enQueue(int x){
        if(isFull()){
            System.out.println("The Queue is full..");
        }else {
            rear++;
            queueArr[rear]=x;
            System.out.println("Inserting :"+x);
        }
    }

    //remove the data for queue
    void deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
        }else {
            System.out.println("Removing :"+queueArr[font]);
            font++;
        }
    }

    //print the Queue
    void printQueue(){
        for (int i=font;i<=rear;i++){
            System.out.print(queueArr[i]+" ");
        }
    }

    public static void main(String[] args) {
       Queue myQueue=new Queue(5);

       myQueue.enQueue(10);
       myQueue.enQueue(20);
       myQueue.enQueue(30);
       myQueue.deQueue();
       myQueue.printQueue();
    }
}
