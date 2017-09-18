package GetOffer;

import java.util.ArrayList;

public class Solution3 {
	ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {       
        while(listNode != null){
			this.printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
        return list;
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode ln = new ListNode(10);
		ln.next =new ListNode(20);
		ln.next.next = new ListNode(30);
		ln.next.next.next = null;
		Solution3 a = new Solution3();
		a.printListFromTailToHead(ln);
	}

}
