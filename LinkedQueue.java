/**
 * Created by Тимур on 01.02.2017.
 */
public class LinkedQueue<E> extends LinkedList<E> {


    @Override
    public void addFirst(E e) {
        return;
    }

    public void enqueue(E e){
    addLast(e);
}
public E dequeue(){
  E e=  removeFirst();
  return e;
}

}
