package com.leet;

public class Problem110 {
  public boolean isBalanced(TreeNode root) {
      
	  
	  if(root==null) return true;  
	  
	  if(Math.abs(height(root.left)-height(root.right))>1)
		  return false;
	  return isBalanced(root.left)&&isBalanced(root.right);
	  
	  
    }
  
  public int height(TreeNode p)
  {
	  int heightL;
	  int heightR;
	  int heightP;
	  if(p==null) return 0;
	  heightL= height(p.left);
	  heightR=height(p.right);
	  heightP= (heightL>heightR?heightL:heightR)+1;
	  
	  return heightP;
  }
  
}
