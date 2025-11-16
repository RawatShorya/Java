package DSA.BT;

import java.util.ArrayList;
import java.util.List;

import static DSA.BT.TreePrinter.printPrettyTree;

public class RootToLeafNodePaths {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.right.right = new TreeNode<>(6);
    List<List<Integer>> list = getPaths(root);
    printPrettyTree(root);
    System.out.println(list);
  }

  private static List<List<Integer>> getPaths(TreeNode<Integer> root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    List<Integer> curr = new ArrayList<>();
    helper(result, root, curr);
    return result;
  }

  private static void helper(
      List<List<Integer>> result, TreeNode<Integer> root, List<Integer> curr) {
    curr.add(root.data);
    if (root.left != null) {
      helper(result, root.left, curr);
    }
    if (root.right != null) {
      helper(result, root.right, curr);
    }
    if (root.left == null && root.right == null) {
      result.add(new ArrayList<>(curr));
    }
    curr.removeLast();
  }
}
