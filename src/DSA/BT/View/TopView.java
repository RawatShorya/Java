package DSA.BT.View;

import DSA.BT.TreeNode;

import java.util.*;

import static DSA.BT.TreePrinter.printPrettyTree;

public class TopView {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.right.left = new TreeNode<>(8);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.left.right.right = new TreeNode<>(7);
    root.right.right = new TreeNode<>(6);
    printPrettyTree(root);
    List<Integer> dfs = topView(root);
    System.out.println(dfs);
  }

  private static List<Integer> topView(TreeNode<Integer> root) {
    Queue<NodeByColClass> queue = new LinkedList<>();
    queue.offer(new NodeByColClass(root, 0));
    List<Integer> result = new ArrayList<>();
    TreeMap<Integer, Integer> colByValue = new TreeMap<>();
    while (!queue.isEmpty()) {
      NodeByColClass nodeByCol = queue.poll();
      if (!colByValue.containsKey(nodeByCol.col)) {
        colByValue.put(nodeByCol.col, nodeByCol.node.data);
      }
      if (nodeByCol.node.left != null) {
        queue.offer(new NodeByColClass(nodeByCol.node.left, nodeByCol.col - 1));
      }
      if (nodeByCol.node.right != null) {
        queue.offer(new NodeByColClass(nodeByCol.node.right, nodeByCol.col + 1));
      }
    }
    for (Map.Entry<Integer, Integer> entry : colByValue.entrySet()) {
      result.add(entry.getValue());
    }
    return result;
  }
}
