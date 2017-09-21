/**
 * Created by Тимур on 01.02.2017.
 */
public class LinkedList<E> {


    private int size;
    private Node<E> head;
    private Node<E> tail;

    public LinkedList(){
        size=0;
        head=null;
        tail=null;
    }
//METHODS******************************
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return(size==0);
    }

    public E first(){
        if (head.getElement()==null){return null;}
        return head.getElement();
    }

    public E last(){
        if(tail.element==null){return null;}
        return tail.element;
    }

    public void addFirst(E e){
        Node temp=head;
        head=new Node<E>(e,temp);
        if (size==0){tail=head;}
        size++;
    }

    public void addLast(E e){
        Node temp = new Node(e, null);
        if (size == 0) {//tail=new Node<E>(e,null);
            tail = temp;
            head = tail;
            size++;
            return;
        }
        tail.setNext(temp);
        tail = temp;
        size++;
        return;
    }

    public E removeFirst(){
        if(size==0){return null;}
        Node temp=head.next;
        E e=head.getElement();
        head=temp;
        size--;
        return e;
    }


//NODE CLASS***********************
    protected static class Node<E>{

        private E element;
        private Node next;


        public Node(E e,Node<E> node){
            element=e;
            next=node;
        }


        public E getElement(){
            return element;
        }

        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node n){
            next = n;
        }
    }

}
