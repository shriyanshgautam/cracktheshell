package com.shriyansh.cracktheshell.dataStructures.tree.binarySearchTree;

import com.shriyansh.cracktheshell.dataStructures.tree.binaryTree.BinaryTreeNode;

public class BinarySearchTree {
    private BinaryTreeNode root;

    BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isBST(BinaryTreeNode root, int min, int max) {
        /**
         * TODO : optimize it not to search children of leaf
         * if (root.getLeftChild() == null && root.getRightChild() == null) {
         *     if (root.getValue() > min && root.getValue() < max) {
         *          return true;
         *     }
         * }
         */
        if (root == null) return true;
        if (root.getValue() <= min || root.getValue() > max) {
            return false;
        }
        return isBST(root.getLeftChild(), min, root.getValue()) && isBST(root.getRightChild(), root.getValue(), max);
    }

    public BinaryTreeNode deadEnd(BinaryTreeNode root, int min, int max) {
        if (root == null) return null;
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            if (root.getValue() - 1 == min && root.getValue() + 1 == max) {
                return root;
            }
        }
        if (deadEnd(root.getLeftChild(), min, root.getValue()) != null || deadEnd(root.getRightChild(), root.getValue(), max) != null) {
            return root;
        }
        return null;
    }

    /*
     * ._
     * _...
     * _._.
     * _..
     * .
     * F .._.
     * __.
     * ....
     * ..
     * J .___
     * _._
     * L ._..
     * __
     * _.
     * ___
     * .__.
     * Q __._
     * ._.
     * ...
     * _
     * .._
     * ..._
     * W .__
     * _.._
     * Y _.__
     * __..
     *
     *
     * J .___
     *
     * F .._.
     * L ._..
     *
     * Q __._
     * Y _.__
     *
     * G __.
     * W .__
     *
     * P .__.
     * X _.._
     *
     *
     */


    // ... .... ._. .. _.__ ._ _. ... ....
}
