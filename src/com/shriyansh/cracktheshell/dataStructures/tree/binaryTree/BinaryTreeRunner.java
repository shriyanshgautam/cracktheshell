package com.shriyansh.cracktheshell.dataStructures.tree.binaryTree;

public class BinaryTreeRunner {

    public static void main(String[] args) {
        //Creating a tree
        BinaryTreeNode rootNode = new BinaryTreeNode(3);

        rootNode.setLeftChild(new BinaryTreeNode(4));
        rootNode.getLeftChild().setLeftChild(new BinaryTreeNode(2));
        rootNode.getLeftChild().setRightChild(new BinaryTreeNode(5));
        rootNode.setRightChild(new BinaryTreeNode(6));
        rootNode.getRightChild().setRightChild(new BinaryTreeNode(8));


        BinaryTree tree = new BinaryTree(rootNode);

        System.out.println("In Order");
        tree.inOrdertraverseBinaryTree(rootNode);
        System.out.println("Pre Order");
        tree.preOrderTraverseBinaryTree(rootNode);
        System.out.println("Post Order");
        tree.postOrderTraverseBinaryTree(rootNode);
        System.out.println("Level Order");
        tree.levelOrderTraversal(rootNode);
        /*
         *     3
         *    / \
         *   4  6
         *  / \  \
         * 2  5  8
         */
    }
}
