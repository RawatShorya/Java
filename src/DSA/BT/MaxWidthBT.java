package DSA.BT;

import java.util.Deque;
import java.util.LinkedList;

import static DSA.BT.TreePrinter.printPrettyTree;

public class MaxWidthBT {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.right.right = new TreeNode<>(6);
    int maxWidth = widthOfBinaryTree(root);
    printPrettyTree(root);
    System.out.println(maxWidth);
  }

  static class CustomClass {
    TreeNode<Integer> node;
    int idx;

    CustomClass(TreeNode<Integer> node, int idx) {
      this.node = node;
      this.idx = idx;
    }
  }

  private static int widthOfBinaryTree(TreeNode<Integer> root) {
    if (root == null) return 0;
    Deque<CustomClass> queue = new LinkedList<>();
    queue.offer(new CustomClass(root, 0));
    int maxWidth = 0;
    while (!queue.isEmpty()) {
      int currentLevelSize = queue.size();
      long last = queue.getLast().idx;
      long start = queue.getFirst().idx;
      maxWidth = Math.max(maxWidth, ((int) (last - start + 1)));
      for (int i = 0; i < currentLevelSize; i++) {
        CustomClass customClass = queue.poll();
        TreeNode<Integer> node = customClass.node;
        int idx = customClass.idx;
        if (node.left != null) queue.offer(new CustomClass(node.left, 2 * idx + 1));
        if (node.right != null) queue.offer(new CustomClass(node.right, 2 * idx + 2));
      }
    }
    return maxWidth;
  }
}
