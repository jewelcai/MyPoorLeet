package com.leet;

import java.util.*;

public class Problem94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(root!=null||!stack.empty())
    	{
    		while(root!=null)
    		{
    			stack.push(root);
    			root=root.left;
    			
    		}
    		if(!stack.empty())
    		{
    			TreeNode p = stack.peek();
    			result.add(p.val);
    			stack.pop();
    			root = p.right;
       		}
    		
    		
    		
    	}
    	
    	return result;
      }
}
