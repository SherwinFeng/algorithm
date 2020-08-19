package exam.bytedance;

import java.util.*;
/**
给定两个非空链表来代表两个非负整数，

		数字最高位位于链表开始位置,

		它们的每个节点只存储单个数字,

		将这两数相加会返回一个新的链表。

		示例:

		输入: (8 -> 2 -> 0 -> 3) + (2 -> 6 -> 4)

		输出: 8 -> 4 -> 6 -> 7
 */
public class 链表相加 {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(2);
		Node n2 = new Node(2);
		//Node ret = handler(n1, n2);
		//while(ret != null){
		//    System.out.println(ret.val);
		//    ret = ret.next;
		//}

		Node n11 = reverse(n1);
		while(n11 != null){
			System.out.println(n11.val);
			n11 = n11.next;
		}
	}

	public static Node handler(Node n1, Node n2){
		Node n11 = reverse(n1);
		Node n22 = reverse(n2);
		int c = 0;  //进位
		List<Integer> list = new ArrayList<>();
		while(n11 != null && n22 != null){
			int val = n11.val + n22.val + c;
			c = val/10;
			list.add(val%10);
			n11 = n11.next;
			n22 = n22.next;
		}
		while(n11 != null){
			list.add(n11.val);
			n11 = n11.next;
		}
		while(n22 != null){
			list.add(n22.val);
			n22 = n22.next;
		}
		if(list.size() <= 1) return new Node(list.get(0));
		Node header = new Node(list.get(list.size() - 1));
		header.next = new Node(list.get(list.size() - 2));
		Node cur, next;
		for(int i = list.size() - 1; i >= 1; i--){
			cur = new Node(list.get(i));
			next = new Node(list.get(i - 1));
			cur.next = next;
		}
		return header;
	}

	public static Node reverse(Node node){
		if(node == null) return null;
		if(node.next == null) return node;
		Node p1 = node;
		Node p2 = node.next;
		Node p3;
		while(p2 != null){
			p3 = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p3;
		}
		return p2;
	}
}
class Node{
	int val;
	Node next;
	public Node(int val, Node next){
		this.val = val;
		this.next = next;
	}
	public Node(int val){
		this.val = val;
	}
}