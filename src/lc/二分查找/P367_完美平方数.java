package main;

import java.util.PriorityQueue;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月13日 9:51
 */

public class P367_完美平方数 {

    public boolean isPerfectSquare(int num) {
        long l = 1, h = num;
        if(num > 4){
            h = num / 2;
        }
        while (l <= h){
            long mid = (h - l) / 2 + l;
            long tmp = mid * mid;
            if(tmp == num) return true;
            if(tmp < num){
                l = mid + 1;
            }else {
                h = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        P367_完美平方数 test = new P367_完美平方数();
//        System.out.println(test.isPerfectSquare(2));
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }

}
