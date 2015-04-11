package com.leet;

public class Problem111 {
public int minDepth(TreeNode root) {
       int heightL,heightR,height; 
	if(root==null)  height=0;
	
	else if(root.left==null||root.right==null)
	{
		height= 1+(root.left==null?minDepth(root.right):minDepth(root.left));
		
	}
	else{
		
		heightL=minDepth(root.left);
		heightR=minDepth(root.right);
		height= (heightL>heightR?heightR:heightL)+1;
		
	}
	
	return height;
    }
}
