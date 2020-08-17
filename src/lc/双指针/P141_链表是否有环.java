package main.双指针;

import struct.ListNode;

import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main.双指针
 * @Description: 快慢指针
 * @date Date : 2020年08月17日 10:11
 */

public class P141_链表是否有环 {

    public boolean hasCycle(ListNode head) {
        ListNode p1 = head, p2 = head;
        while (p1 != null && p2 != null){
            p1 = p1.next;
            if(p2.next != null){
                p2 = p2.next.next;
            }else {
                return false;
            }
            if(p1 == p2) return true;
        }
        return false;
    }
}






















