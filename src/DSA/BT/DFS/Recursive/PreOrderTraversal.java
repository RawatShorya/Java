package DSA.BT.DFS.Recursive;

import DSA.BT.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.right = new TreeNode<>(6);
        List<Integer> dfs = DFS(root);
        System.out.println(dfs);
    }

    private static List<Integer> DFS(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private static void preOrder(TreeNode<Integer> root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.data);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
}
