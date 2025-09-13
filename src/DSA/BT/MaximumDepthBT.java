package DSA.BT;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBT {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.right.right = new TreeNode<>(6);
    TreePrinter.printPretty(root);
    System.out.println(maxDepth(root));
  }

  public static int maxDepth(TreeNode<Integer> root) {
    if (root == null) {
      return 0;
    }

    Queue<TreeNode<Integer>> queue = new LinkedList<>();
    queue.offer(root);
    int level = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size > 0) {
        TreeNode<Integer> node = queue.poll();
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
        size--;
      }
      if (!queue.isEmpty()) {
        level++;
      }
    }
    return level + 1;
  }
}
