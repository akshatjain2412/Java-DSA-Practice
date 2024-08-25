package Queue;

public class implementByArray {
    public static class Arraydequeue{
        int rear;
        int front;
        int size;
        int []arr ;
        Arraydequeue() {

            this.rear=-1;
            this.front=-1;
            this.size=0;
            this.arr=new int[2];
        }
        Arraydequeue(int capacity){
            this.rear=-1;
            this.front=-1;
            this.size=0;
            this.arr=new int[capacity];
        }
        void add(int val){   //we use isEmpty here because of if we put(front==rear) it will give error because after inserting
            if(isEmpty()){   // one element still rear and front is equal
                front=arr.length-1;
                rear=arr.length-1;
                arr[rear]=val;
                size++;
                return;
            }
            if(isfull()){
                System.out.println("error");
                return;
            }
                rear=rear-1;
                arr[rear]=val;

            size++;
        }
        int element(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
        int size(){
            return this.size;
        }
        int poll(){
            if(isEmpty()){
                return -1;
            }
            int val=arr[front];
            front=front-1;
            size--;
            return val;
        }
        boolean isEmpty(){
            return size==0;
        }
        boolean isfull(){
            return rear==0;
        }
    }
    public static void print(Arraydequeue q)
    {
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

    public static void main(String[] args) {
        Arraydequeue q=new Arraydequeue();
        q.add(12);
        q.add(23);
        q.add(213);
        System.out.println(q.size());
        print(q);
    }
}
