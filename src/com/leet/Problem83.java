package com.leet;

public class Problem83 {
   public ListNode deleteDuplicates(ListNode head) {
       ListNode pre= null;
       ListNode cur= head;
       if(head==null) return null;
       while(cur!=null)
       {
    	   pre=cur;
    	   cur=cur.next;
    	   if(pre.val==cur.val)
    		   pre.next=cur.next;
    	   
       }
       
       return head;
	   
    }
}
