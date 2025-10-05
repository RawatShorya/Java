package DSA.BT.DFS;

import DSA.BT.TreeNode;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreInPostInSingleTraversal {
  static class Result {
    List<Integer> preOrderList;
    List<Integer> inOrderList;
    List<Integer> postOrderList;

    Result(List<Integer> preOrderList, List<Integer> inOrderList, List<Integer> postOrderList) {
      this.preOrderList = preOrderList;
      this.inOrderList = inOrderList;
      this.postOrderList = postOrderList;
    }
  }

  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);
    root.left.left = new TreeNode<>(4);
    root.left.right = new TreeNode<>(5);
    root.right.right = new TreeNode<>(6);
    Result result = traversePreInPost(root);
    System.out.println("PreOrder Traversal : " + result.preOrderList);
    System.out.println("InOrder Traversal : " + result.inOrderList);
    System.out.println("PostOrder Traversal : " + result.postOrderList);
  }

  private static Result traversePreInPost(TreeNode<Integer> root) {
    List<Integer> preOrderList = new ArrayList<>();
    List<Integer> inOrderList = new ArrayList<>();
    List<Integer> postOrderList = new ArrayList<>();
    Stack<Pair<TreeNode<Integer>, Integer>> stack = new Stack<>();
    stack.push(new MutablePair<>(root, 1));
    while (!stack.isEmpty()) {
      Pair<TreeNode<Integer>, Integer> pair = stack.pop();
      TreeNode<Integer> node = pair.getLeft();
      Integer num = pair.getRight();
      if (num == 1) {
        preOrderList.add(node.data);
        stack.push(new MutablePair<>(node, num + 1));
        if (node.left != null) {
          stack.add(new MutablePair<>(node.left, 1));
        }
      } else if (num == 2) {
        inOrderList.add(node.data);
        stack.push(new MutablePair<>(node, num + 1));
        if (node.right != null) {
          stack.add(new MutablePair<>(node.right, 1));
        }
      } else {
        postOrderList.add(node.data);
      }
    }
    return new Result(preOrderList, inOrderList, postOrderList);
  }
}
