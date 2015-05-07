package com.leet;

public class Problem206 {
//	public ListNode reverseList(ListNode head) {
//    
//     ListNode pre = null;
//     ListNode cur = head;
//     ListNode next;
//    
//     while(cur!=null)
//     {
//    	 next= cur.next;
//    	 cur.next= pre;
//    	 pre = cur;
//    	 cur = cur.next;
//    	 
//     }
//     return pre;
//     
//	}
	public ListNode reverseList(ListNode head) {
		ListNode newHead ;
		if(head==null||head.next==null)
			return head;
		
		newHead = reverseList(head.next);
		head.next.next= head;
		head.next= null;
		
		return newHead;
	}
}
