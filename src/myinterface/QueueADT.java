package myinterface;

public interface QueueADT<E> {
    void enqueue(E data);
    E dequeue();
    E peek();  //can also be called as pole
    boolean isEmpty();
    int size();
}
