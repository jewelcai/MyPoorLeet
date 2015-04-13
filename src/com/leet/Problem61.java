package com.leet;

public class Problem61 {
public ListNode rotateRight(ListNode head, int k) {
	if(head==null) return null;
	if(k<0) return head;
        int count =0;
        ListNode cur =head;
        ListNode oriTail=cur;
        while(cur!=null)
        {   oriTail=cur;
        	cur=cur.next;
        	
        	count++;
        }
	    k=k%count;
	    if(k==0) return head;
	    oriTail.next=head;
	    ListNode newTail=null;
	    ListNode newHead = head;
	    for (int i = 0; i < count-k; i++) {
	    	newTail=newHead;
	    	newHead= newHead.next;
		}
	    newTail.next=null;
	    return newHead;
	    
    }	
}
