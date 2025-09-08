package DSA.BT.DFS.Iterative;

import DSA.BT.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.left.right.right = new TreeNode<>(6);
//        root.right.right = new TreeNode<>(6);
        List<Integer> dfs = DFS(root);
        System.out.println(dfs);
    }

    private static List<Integer> DFS(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> node = root;
        while (node!=null || !stack.isEmpty()){
            while (node != null){
                stack.push(node);
                node = node.left;
            }

            if (stack.peek().right != null){
                node = stack.peek().right;
            }else {
                TreeNode<Integer> temp = stack.pop();
                result.add(temp.data);
                while (!stack.isEmpty() && temp == stack.peek().right){
                    temp = stack.pop();
                    result.add(temp.data);
                }
            }

        }
        return result;
    }
}
