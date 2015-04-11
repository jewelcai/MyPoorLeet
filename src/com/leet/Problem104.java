package com.leet;

public class Problem104 {
  public int maxDepth(TreeNode root) {
      int heightLeft, heightRight, height;
      if(root==null)
    	  height=0;
      else{
    	  heightLeft=maxDepth(root.left);
    	  heightRight= maxDepth(root.right);
    	  height= 1+(heightLeft>heightRight?
    			  heightLeft:heightRight);    	     	  
      }
	  return height;	  
    }
}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	  }