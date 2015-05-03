package com.leet;

public class Problem203 {
	 public ListNode removeElements(ListNode head, int val) {
		 
		 if(head==null)
			 return null;
		 
	     ListNode dummy = new ListNode(-1); 
		 dummy.next= head;
		 ListNode pre= dummy;
		 ListNode cur = head;
		 
		 while(cur!=null)
		 {
			 if(cur.val==val)
			 {
				 pre.next=cur.next;
				 cur = cur.next;
				 
			 }else{
				 pre= cur;
				 cur = cur.next;
				 
			 }
			 
		 }
		 
		 
		 return dummy.next;
		 
	    }
	

}
