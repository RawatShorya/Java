package DSA.BT;

import java.util.*;

public class BFS {
    static class TreeNode<T>{
        T data;
        TreeNode left;
        TreeNode right;

        TreeNode(T data){
            this.data = data;
        }
    }
    public static void main(String[] args){

        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        List<Integer> bfsResult = BFS(root);
        System.out.println(bfsResult);
    }

    public static List<Integer> BFS(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode<Integer> node =  queue.poll();
            result.add(node.data);
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
        return result;
    }

}

