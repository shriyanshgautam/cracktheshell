package com.shriyansh.cracktheshell.dataStructures.tree.binaryTree;

public class BinaryTreeNode {

    BinaryTreeNode(int value){
        this.value = value;
        leftChild = null;
        rightChild = null;
    }
    private int value;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
}
