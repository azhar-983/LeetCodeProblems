package com.lc.trees;

public class BinaryTreeDemo {
    TreeNode root;
    BinaryTreeDemo(){
        root = null;
    }
    BinaryTreeDemo(int key){
        this.root = new TreeNode(key);
    }

    public void insertNode(){

    }
    public void deleteNode(){

    }
    public void inOrder(){

    }
    public void preOrder(){

    }
    public void postOrder(){

    }
    private int countNodes(){

        return 0;
    }
    public static void main(String[] args) {
        BinaryTreeDemo binaryTreeDemo = new BinaryTreeDemo(10);
        binaryTreeDemo.root.left = new TreeNode(5);
        binaryTreeDemo.root.right = new TreeNode(15);
        int count = binaryTreeDemo.countNodes();
    }
}