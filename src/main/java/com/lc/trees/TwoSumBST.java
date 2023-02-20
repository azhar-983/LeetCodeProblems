package com.lc.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary search tree and an integer k, return true if there exist two elements
 * in the BST such that their sum is equal to k, or false otherwise.
 */
public class TwoSumBST {
    public static void main(String[] args) {

    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = inorder(root);
        int lo=0,hi=values.size()-1;
        while(lo<hi){
            if((values.get(lo)+values.get(hi))==k)
                return true;
            else if ((values.get(lo)+values.get(hi))>k)
                hi--;
            else
                lo++;
        }
        return false;
    }
    public List<Integer> inorder(TreeNode root){
        List<Integer> values = new ArrayList<>();
        if(root != null){
            values.addAll(inorder(root.left));
            values.add(root.val);
            values.addAll(inorder(root.right));
        }
        return values;
    }
}
