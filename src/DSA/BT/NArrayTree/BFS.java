package DSA.BT.NArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
  public static class NArrayTreeNode<T> {
    T data;
    List<NArrayTreeNode<T>> children;

    NArrayTreeNode(T data) {
      this.data = data;
      this.children = new ArrayList<>();
    }

    NArrayTreeNode(T data, List<NArrayTreeNode<T>> children) {
      this.data = data;
      this.children = children;
    }
  }

  public static void main(String[] args) {
      NArrayTreeNode<Integer> node5 = new NArrayTreeNode<>(5);
      NArrayTreeNode<Integer> node6 = new NArrayTreeNode<>(6);
      List<NArrayTreeNode<Integer>> childrenOf3 = Arrays.asList(node5, node6);

      NArrayTreeNode<Integer> node2 = new NArrayTreeNode<>(2);
      NArrayTreeNode<Integer> node3 = new NArrayTreeNode<>(3, childrenOf3);
      NArrayTreeNode<Integer> node4 = new NArrayTreeNode<>(4);

      List<NArrayTreeNode<Integer>> childrenOfRoot = Arrays.asList(node2, node3, node4);
      NArrayTreeNode<Integer> root = new NArrayTreeNode<>(1, childrenOfRoot);
    List<Integer> result = NarrayBFS(root);
    for (Integer i : result) {
      System.out.print(i + " ");
    }
  }

  private static List<Integer> NarrayBFS(NArrayTreeNode<Integer> root) {
      List<Integer> result = new ArrayList<>();
      Queue<NArrayTreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()){
          NArrayTreeNode<Integer> node = queue.poll();
          result.add(node.data);
          for (int i = 0; i<node.children.size(); i++){
              queue.offer(node.children.get(i));
          }
      }
      return result;
  }
}
