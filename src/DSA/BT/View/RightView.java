package DSA.BT.View;

import DSA.BT.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static DSA.BT.TreePrinter.printPrettyTree;

public class RightView {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.left.right.right = new TreeNode<>(7);
    root.right.right = new TreeNode<>(6);
    printPrettyTree(root);
    List<Integer> dfs = rightView(root);
    System.out.println(dfs);
  }

  private static List<Integer> rightView(TreeNode<Integer> root) {
    List<Integer> result = new ArrayList<>();
    treeRightView(root, result, 0);
    return result;
  }

  private static void treeRightView(TreeNode<Integer> root, List<Integer> result, int level) {
    if (root == null) {
      return;
    }
    if (result.size() == level) {
      result.add(root.data);
    }
    treeRightView(root.right, result, level + 1);
    treeRightView(root.left, result, level + 1);
  }
}
