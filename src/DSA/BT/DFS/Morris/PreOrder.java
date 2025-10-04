package DSA.BT.DFS.Morris;

import DSA.BT.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.right = new TreeNode<>(6);
        List<Integer> dfs = morrisTraversalPreOrder(root);
        System.out.println(dfs);
    }

    private static List<Integer> morrisTraversalPreOrder(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        TreeNode<Integer> curr = root;
        while (curr!=null){
            if (curr.left == null){
                result.add(curr.data);
                curr = curr.right;
            }else {
                TreeNode<Integer> pp = findPP(curr);
                if (pp.right == null){
                    result.add(curr.data);
                    pp.right = curr;
                    curr = curr.left;
                }else {
                    pp.right = null;
                    curr = curr.right;
                }
            }
        }
        return result;
    }

    private static TreeNode<Integer> findPP(TreeNode<Integer> curr) {
        TreeNode<Integer> pp = curr.left;
        while (pp.right != null && pp.right != curr){
            pp = pp.right;
        }
        return pp;
    }
}
