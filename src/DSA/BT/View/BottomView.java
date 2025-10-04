package DSA.BT.View;

import DSA.BT.TreeNode;

import java.util.*;

import static DSA.BT.TreePrinter.printPrettyTree;

public class BottomView {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);

    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);

    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);

    root.right.left = new TreeNode<>(8);
    root.right.right = new TreeNode<>(6);

    root.left.right.right = new TreeNode<>(7);

    printPrettyTree(root);
    List<Integer> dfs = bottomView(root);
    System.out.println(dfs);
  }

  private static List<Integer> bottomView(TreeNode<Integer> root) {
    TreeMap<Integer, Integer> colByValueMap = new TreeMap<>();
    List<Integer> ans = new ArrayList<>();
    Queue<NodeByColClass> queue = new LinkedList<>();
    queue.offer(new NodeByColClass(root, 0));
    while (!queue.isEmpty()) {
      NodeByColClass nodeByColClass = queue.poll();
      TreeNode<Integer> node = nodeByColClass.node;
      int col = nodeByColClass.col;
      colByValueMap.put(col, node.data);
      if (node.left != null) {
        queue.offer(new NodeByColClass(node.left, col - 1));
      }
      if (node.right != null) {
        queue.offer(new NodeByColClass(node.right, col + 1));
      }
    }
    for (Map.Entry<Integer, Integer> entry : colByValueMap.entrySet()) {
      ans.add(entry.getValue());
    }
    return ans;
  }
}
