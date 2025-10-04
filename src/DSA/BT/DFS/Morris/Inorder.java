package DSA.BT.DFS.Morris;

import DSA.BT.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.right.right = new TreeNode<>(6);
    List<Integer> dfs = morrisTraversal(root);
    System.out.println(dfs);
  }

  private static List<Integer> morrisTraversal(TreeNode<Integer> root) {
    List<Integer> result = new ArrayList<>();
    TreeNode<Integer> curr = root;
    while (curr != null) {
      if (curr.left == null) {
        result.add(curr.data);
        curr = curr.right;
      } else {
        TreeNode<Integer> ip = curr.left;
        while (ip.right != null && ip.right != curr) {
          ip = ip.right;
        }
        if (ip.right == null) {
          ip.right = curr;
          curr = curr.left;
        } else {
          ip.right = null;
          result.add(curr.data);
          curr = curr.right;
        }
      }
    }
    return result;
  }
}
