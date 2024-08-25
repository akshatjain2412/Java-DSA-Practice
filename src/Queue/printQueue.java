package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printqueue(num);
        sc.close();
    }

    private static void  printqueue(int num) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<num;i++){
            q.add(sc.nextInt());
        }
        sc.close();
        Queue<Integer> helper = new ArrayDeque<>();  //we use additional queue to print because if we don't do that q will empty
        while(!q.isEmpty()) {
            System.out.println(q.element());
            helper.add(q.poll());
        }

    }
}
