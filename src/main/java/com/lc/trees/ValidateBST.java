package com.lc.trees;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, Integer max, Integer min) {
        if(root == null)
            return true;
        else if((max!=null && root.val>=max) || (min !=null && root.val <= min)){
            return false;
        } else {
            return validate(root.left,root.val,min) && validate(root.right, max, root.val);
        }
    }
}
