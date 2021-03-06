package implimentation;

import myinterface.QueueADT;

public class MyQueueByLinkedList<E> implements QueueADT<E>{
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public MyQueueByLinkedList(){
        front =null;
        rear=null;
        size=0;
    }

    @Override
    public void enqueue(E data) {
        Node<E> node=new Node<E>(data);
        if(!isEmpty()){
            rear.setNext(node);
            rear=node;
        }
        else{
            front=node;
            rear=node;
        }
        size++;
    }

    @Override
    public E dequeue() {
        E response=null;

        if(!isEmpty()){
            response= front.getData();
            front=front.getNext();
            if(front==null){
                rear=null;
            }
        }
        return response;
    }

    @Override
    public E peek() {
        E response=null;
        if(!isEmpty()){
            response=rear.getData();
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
