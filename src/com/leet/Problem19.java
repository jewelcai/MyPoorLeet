package com.leet;

public class Problem19 {
   public static ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode pre=null;
//        ListNode cur=head;
//        int count=0;
//        while(cur!=null)
//        {
//        	pre=cur;
//        	cur=cur.next;
//        	count++;
//        	
//        }
//        pre=null;
//        cur=head;
//       
//        
//        if(n==count){//delete current head
//        	head=cur.next;
//        	cur=null;
//        	
//        }else{
//        	for (int i = 0; i < count-n+1; i++) {
//        		pre=cur;
//            	cur=cur.next;
//			}
//        	pre.next=cur.next;
//        	cur=null;
//        }
//        
//        return head;
	   ListNode r = new ListNode(0);
	   ListNode p= head;
	   ListNode prev = r;
	   r.next= head;
	   int i =0;
	   while(p!=null)
	   {
		   if(i<n)
		   {
			   p=p.next;
			   i++;
			   
		   }else{
			   
			   p=p.next;
			   prev=head;
			   head=head.next;
			   
			   
		   }
		   
	   }
	   
	   prev.next= head.next;
	   return r.next;
	   
    }
   public static void main(String[] args) {
	   ListNode l1= new ListNode(1);
	   ListNode l2= new ListNode(2);
	   ListNode l3= new ListNode(3);
	   ListNode l4= new ListNode(4);
	   ListNode l5= new ListNode(5);
	   l1.next=l2;
	   l2.next=l3;
	   l3.next=l4;
	   l4.next=l5;
	   
	   ListNode l= removeNthFromEnd(l1, 2);   
	   String s= l.toString();
	   System.out.print(s);
	   
	   
	   
}
}
 class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	      }
	 }