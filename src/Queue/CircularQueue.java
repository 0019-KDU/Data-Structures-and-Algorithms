package Queue;

public class CircularQueue {

    int font;
    int rear;
    int capacity;


    int queueArr[];
    CircularQueue(int size){
        capacity=size;
        font=-1;
        rear=-1;
        this.queueArr=new int[size];
    }

    boolean isEmpty(){
        if(font==-1){
            return true;
        }else {
            return false;
        }
    }

    boolean isFull(){
        if(font==0 && rear==capacity-1){
            return true;
        }
        if (font==rear+1){
            return true;
        }
        return false;
    }

    void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is Full..!");
        }else {
            if (font==-1){
                font=0;
            }
            rear=(rear+1)%capacity;
            queueArr[rear]=element;
            System.out.println("Inserted :"+element);
        }
    }

    int deQueue(){
        int element;
        if (isEmpty()){
            System.out.println("Queue is Empty..!");
            return (-1);
        }else {
            element=queueArr[font];
            if (font==rear){
                font=-1;
                rear=1;
            }else {
                font=(font+1)%capacity;
            }
            return element;
        }

    }

    void display(){
        //Function to display status of circular
        int i;
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else{

            System.out.print("Items ->");
            for(i=font;i!=rear;i=(i+1)%capacity){
                System.out.print(queueArr[i]+" ");
            }
            System.out.println(queueArr[i]);
            //System.out.println("Rear ->"+rear);
        }
    }

    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(8);

        //fails front is -1
        cq.deQueue();

        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.enQueue(6);
        cq.enQueue(7);
        cq.enQueue(8);

        //Will Fail to enqueue is size full
        cq.enQueue(9);

        //Display Queue
        cq.display();

        int elem=cq.deQueue();

        if(elem!=-1){
            System.out.println("Deleted Element is :"+elem);
        }

        cq.display();

        cq.enQueue(9);

        cq.display();

        cq.enQueue(10);


    }
}
