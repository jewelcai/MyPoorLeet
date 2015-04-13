package com.leet;

public class Problem21 {
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode header= new ListNode(0);
      ListNode cur=header;
      while(l1!=null&&l2!=null)
      {
    	  if(l1.val<l2.val)
    	  {
    		  ListNode n= new ListNode(l1.val);
    		  cur.next=n;
    		  cur= cur.next;
    		  l1=l1.next;
    	  }else{
    		  
    		  ListNode n = new ListNode(l2.val);
    		  cur.next=n;
    		  cur=cur.next;
    		  l2=l2.next;
    	  }
    	  
      }
      
      while(l1!=null)
      {
    	  ListNode n= new ListNode(l1.val);
    	  cur.next=n;
		  cur= cur.next;
		  l1=l1.next;
    	  
      }
      while(l2!=null)
      {
    	  ListNode n = new ListNode(l2.val);
		  cur.next=n;
		  cur=cur.next;
		  l2=l2.next;
    	  
      }
	  
	   return header.next;
    }
}
