package DSA.BT;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeInorderPostorderTraversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7});
    TreePrinter.printPretty(root);
  }

  private static TreeNode<Integer> buildTree(int[] inorder, int[] postorder) {

    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      indexMap.put(inorder[i], i);
    }

    int inStartIdx = 0;
    int inEndIdx = inorder.length - 1;
    int postStartIdx = 0;
    int postEndIdx = postorder.length - 1;

    return constructTree(
        inorder, postorder, indexMap, inStartIdx, inEndIdx, postStartIdx, postEndIdx);
  }

  private static TreeNode<Integer> constructTree(
      int[] inorder,
      int[] postorder,
      Map<Integer, Integer> indexMap,
      int inStartIdx,
      int inEndIdx,
      int postStartIdx,
      int postEndIdx) {

    if (inStartIdx > inEndIdx || postStartIdx > postEndIdx) {
      return null;
    }

    int rootData = postorder[postEndIdx];
    int rootIdx = indexMap.get(rootData);
    TreeNode<Integer> rootNode = new TreeNode<>(rootData);

    int leftSubTreeSize = rootIdx - 1 - inStartIdx + 1;
    int rightSubTreeSize = inEndIdx - (rootIdx + 1) + 1;

    rootNode.left =
        constructTree(
            inorder,
            postorder,
            indexMap,
            inStartIdx,
            rootIdx - 1,
            postStartIdx,
            postStartIdx + leftSubTreeSize - 1);
    rootNode.right =
        constructTree(
            inorder,
            postorder,
            indexMap,
            rootIdx + 1,
            inEndIdx,
            postStartIdx + leftSubTreeSize - 1 + 1,
            postEndIdx - 1);
    return rootNode;
  }
}
