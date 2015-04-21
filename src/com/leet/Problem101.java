package com.leet;

public class Problem101 {

public boolean isSymmetric(TreeNode root) 
//{
//	    if(root ==null)return true;
//        if(root.left==null&&root.right==null)
//        	return true;
//        else{
//        	if(root.left==null||root.right==null)
//        		return false;
//        	else{
//        		
//        		if(root.left.val==root.right.val)
//        		{
//        			return true;
//        		}else return false;
//        	}
//        				
//        	
//        }
//	    
//	   return isSymmetric(root.left)&&isSymmetric(root.right);
//    }

{
	if(root ==null)return true;
	return isSymmetric(root.left,root.right);
}

public boolean isSymmetric(TreeNode left,TreeNode right)
{
	if(left==null&&right==null)
	{
		return true;
	}
	
	else{
		if(left==null||right==null)
		return false;
		
	}
	return left.val==right.val&&isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
}

}
