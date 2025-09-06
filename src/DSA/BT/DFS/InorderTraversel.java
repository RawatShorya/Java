package DSA.BT.DFS;

import DSA.BT.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversel {

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
        inOrder(root, result);
        return result;
    }

    private static void inOrder(TreeNode<Integer> root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrder(root.left, result);
        result.add(root.data);
        inOrder(root.right, result);
    }
}
