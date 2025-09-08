package DSA.BT.DFS.Iterative;

import DSA.BT.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
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
        Stack<TreeNode<Integer>> st = new Stack<>();
        TreeNode<Integer> node = root;
        while(node != null || !st.empty()){
            while (node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            result.add(node.data);
           node = node.right;
        }
        return result;
    }
}
