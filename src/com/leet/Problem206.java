package com.leet;

public class Problem206 {
	public ListNode reverseList(ListNode head) {
    
     ListNode pre = null;
     ListNode cur = head;
     ListNode next;
    
     while(cur!=null)
     {
    	 next= cur.next;
    	 cur.next= pre;
    	 pre = cur;
    	 cur = cur.next;
    	 
     }
     return pre;
     
	}

}
