/**
 * Created by Тимур on 01.02.2017.
 */
public class LinkedStack<E> extends LinkedList<E> {
    @Override
    public void addLast(Object o) {
        return;
    }

    public void push(E e){
        addFirst(e);
    }
    public E pop(){
        return removeFirst();
    }

    public E peak(){
 return first();
    }

}
