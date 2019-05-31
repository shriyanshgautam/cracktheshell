package com.shriyansh.cracktheshell.dataStructures.tree.binaryTree;

import java.util.LinkedList;

public class BinaryTree {

    BinaryTreeNode root;

    BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void inOrdertraverseBinaryTree(BinaryTreeNode rootNode) {

        if(rootNode.getLeftChild()!=null) {
            inOrdertraverseBinaryTree(rootNode.getLeftChild());
        }
        System.out.println(rootNode.getValue());
        if(rootNode.getRightChild()!=null) {
            inOrdertraverseBinaryTree(rootNode.getRightChild());
        }
        return;
    }

    public void preOrderTraverseBinaryTree(BinaryTreeNode rootNode) {
        System.out.println(rootNode.getValue());
        if(rootNode.getLeftChild()!=null) {
            preOrderTraverseBinaryTree(rootNode.getLeftChild());
        }
        if(rootNode.getRightChild()!=null) {
            preOrderTraverseBinaryTree(rootNode.getRightChild());
        }
        return;
    }

    public void postOrderTraverseBinaryTree(BinaryTreeNode rootNode) {
        if(rootNode.getLeftChild()!=null) {
            postOrderTraverseBinaryTree(rootNode.getLeftChild());
        }
        if(rootNode.getRightChild()!=null) {
            postOrderTraverseBinaryTree(rootNode.getRightChild());
        }
        System.out.println(rootNode.getValue());

        return;
    }

    public void levelOrderTraversal(BinaryTreeNode rootNode){
        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(rootNode);
        while(!queue.isEmpty()){
            BinaryTreeNode node = queue.pop();
            System.out.println(node.getValue());
            if(node.getLeftChild()!=null){
                queue.add(node.getLeftChild());
            }
            if(node.getRightChild()!=null) {
                queue.add(node.getRightChild());
            }
        }
    }

    public BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, int val1, int val2) {
        if (root == null) return null;
        if (root.getValue() == val1 || root.getValue() == val2) return root;
        BinaryTreeNode left = lowestCommonAncestor(root.getLeftChild(), val1, val2);
        BinaryTreeNode right = lowestCommonAncestor(root.getRightChild(), val1, val2);
        if (left != null && right != null) return root;
        if (left == null && right == null) return null;
        return left != null ? left : right;
    }

    public int size(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + size(root.getLeftChild()) + size(root.getRightChild());
    }

    public int height(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.getLeftChild()), height(root.getRightChild()));
    }

    public boolean pathSum(BinaryTreeNode root, int sum) {
        if (root == null) return false;
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            if (root.getValue() == sum) {
                // Add to list;
                return true;
            }
        }
        if (pathSum(root.getLeftChild(), sum - root.getValue())) {
            // Add to list
            return true;
        }
        if (pathSum(root.getRightChild(), sum - root.getValue())) {
            // Add to list
            return true;
        }
        return false;
    }


    


}
