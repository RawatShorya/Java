package DSA.BT;

import java.util.*;

import static DSA.BT.TreePrinter.printPrettyTree;

public class VerticalOrderTraversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.right.right = new TreeNode<>(6);
    List<List<Integer>> list = verticalTraversal(root);
    printPrettyTree(root);
    System.out.println(list);
  }

  static class NodeByVertical {
    TreeNode<Integer> node;
    int vertical;
    int level;

    NodeByVertical(TreeNode<Integer> node, int vertical, int level) {
      this.node = node;
      this.vertical = vertical;
      this.level = level;
    }
  }

  public static List<List<Integer>> verticalTraversal(TreeNode<Integer> root) {
    List<List<Integer>> result = new ArrayList<>();
    TreeMap<Integer, TreeMap<Integer, List<Integer>>> map =
        new TreeMap<>(); // Level by (vertical by node)
    Queue<NodeByVertical> queue = new LinkedList<>();
    queue.offer(new NodeByVertical(root, 0, 0));
    while (!queue.isEmpty()) {
      NodeByVertical pair = queue.poll();
      TreeNode<Integer> node = pair.node;
      Integer vertical = pair.vertical;
      Integer level = pair.level;
      if (!map.containsKey(level)) {
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        treeMap.put(vertical, Collections.singletonList(node.data));
        map.put(level, treeMap);
      } else {
        TreeMap<Integer, List<Integer>> temp = map.get(level); // vertical by data map
        if (temp.containsKey(vertical)) {
          List<Integer> list = new ArrayList<>(temp.get(vertical));
          list.add(node.data);
          Collections.sort(list);
          temp.put(vertical, list);
        } else {
          temp.put(vertical, Collections.singletonList(node.data));
        }
        map.put(level, temp);
      }
      if (node.left != null) {
        queue.offer(new NodeByVertical(node.left, vertical - 1, level + 1));
      }
      if (node.right != null) {
        queue.offer(new NodeByVertical(node.right, vertical + 1, level + 1));
      }
    }

    TreeMap<Integer, List<Integer>> resultMap = new TreeMap<>();
    for (Map.Entry<Integer, TreeMap<Integer, List<Integer>>> entry : map.entrySet()) {
      TreeMap<Integer, List<Integer>> integerListTreeMap = entry.getValue();
      for (Map.Entry<Integer, List<Integer>> entry1 : integerListTreeMap.entrySet()) {
        if (resultMap.containsKey(entry1.getKey())) {
          List<Integer> integerList = new ArrayList<>(resultMap.get(entry1.getKey()));
          integerList.addAll(entry1.getValue());
          resultMap.put(entry1.getKey(), integerList);
        } else {
          resultMap.put(entry1.getKey(), entry1.getValue());
        }
      }
    }

    for (Map.Entry<Integer, List<Integer>> entry1 : resultMap.entrySet()) {
      result.add(entry1.getValue());
    }

    return result;
  }
}
