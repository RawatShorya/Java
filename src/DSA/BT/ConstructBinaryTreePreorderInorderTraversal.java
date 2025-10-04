package DSA.BT;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorderInorderTraversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7});
    TreePrinter.printPrettyTree(root);
  }

  public static TreeNode<Integer> buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      indexMap.put(inorder[i], i);
    }
    int preIdxStart = 0;
    int preIdxEnd = preorder.length - 1;
    int inIdxStart = 0;
    int inIdxEnd = inorder.length - 1;

    return constructTree(preorder, inorder, indexMap, preIdxStart, preIdxEnd, inIdxStart, inIdxEnd);
  }

  private static TreeNode<Integer> constructTree(
      int[] preorder,
      int[] inorder,
      Map<Integer, Integer> indexMap,
      int preIdxStart,
      int preIdxEnd,
      int inIdxStart,
      int inIdxEnd) {
    if (preIdxStart > preIdxEnd || inIdxStart > inIdxEnd) {
      return null;
    }

    int rootData = preorder[preIdxStart];
    int rootIdx = indexMap.get(rootData);
    TreeNode<Integer> root = new TreeNode<>(rootData);

    int leftSubTreeSize = (rootIdx - 1) - (inIdxStart) + 1;

    root.left =
        constructTree(
            preorder,
            inorder,
            indexMap,
            preIdxStart + 1,
            preIdxStart + 1 + leftSubTreeSize - 1,
            inIdxStart,
            rootIdx - 1);

    root.right =
        constructTree(
            preorder,
            inorder,
            indexMap,
            preIdxStart + 1 + leftSubTreeSize - 1 + 1,
            preIdxEnd,
            rootIdx + 1,
            inIdxEnd);

    return root;
  }
}
