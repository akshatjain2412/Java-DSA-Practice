package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>() ;
            dq.addFirst(221);//to add at first if empty then direct insert
            dq.addLast(231);// add always in end
            dq.add(123);  //if we add use method after addLast then the end will be this because we add element after addLast
                          //whenever we add() the element it always adds at end
                           //in deque add means insert at right side
            dq.push(213);//and push means add at left side
        System.out.println(dq.size()); //size of deque
//            dq.pop();  //always pop left most element in deque
//            dq.poll();//same as pop
//            dq.pollLast(); //remove last element in deque
        System.out.println(dq);
//            dq.pollFirst();  //remove first element in deque
        System.out.println(dq.peek());// print left most element in queue
//            dq.remove();  //remove from left
//            dq.removeFirst(); //remove first left
//            dq.removeLast(); //remove last
        System.out.println(dq.getFirst());//same as peek()
        System.out.println(dq.getLast());//print last most element
        dq.removeFirstOccurrence(2);
        dq.removeLastOccurrence(342);
        System.out.println(dq.offer(9)); //add at last and give boolean value
        System.out.println(dq.offerFirst(3));//add at first with boolean value
        System.out.println(dq.offerLast(21));//add at last and give boolean value
        dq.removeAll(dq);// remove all element present in deque
        dq.reversed();
        System.out.println(dq);

    }
}
