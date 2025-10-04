package DSA.BT;

import java.util.*;

public class TreePrinter {

  public static <T> void printPrettyTree(TreeNode<T> root) {
    List<List<String>> lines = new ArrayList<>();

    List<TreeNode<T>> level = new ArrayList<>();
    List<TreeNode<T>> next = new ArrayList<>();

    level.add(root);
    int nn = 1;

    int widest = 0;

    while (nn != 0) {
      List<String> line = new ArrayList<>();

      nn = 0;

      for (TreeNode<T> n : level) {
        if (n == null) {
          line.add(null);
          next.add(null);
          next.add(null);
        } else {
          String aa = String.valueOf(n.data);
          line.add(aa);
          if (aa.length() > widest) widest = aa.length();

          next.add(n.left);
          next.add(n.right);

          if (n.left != null) nn++;
          if (n.right != null) nn++;
        }
      }

      if (widest % 2 == 1) widest++;

      lines.add(line);

      List<TreeNode<T>> tmp = level;
      level = next;
      next = tmp;
      next.clear();
    }

    int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
    for (int i = 0; i < lines.size(); i++) {
      List<String> line = lines.get(i);

      if (i > 0) {
        for (int j = 0; j < line.size(); j++) {
          char c = ' ';
          if (j % 2 == 1) {
            if (line.get(j - 1) != null) {
              c = '/';
            } else if (line.get(j) != null) {
              c = '\\';
            }
          }
          System.out.print(c);

          for (int k = 0; k < perpiece - 1; k++) {
            System.out.print(" ");
          }
        }
        System.out.println();
      }

      for (int j = 0; j < line.size(); j++) {
        String f = line.get(j);
        if (f == null) f = "";
        int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
        int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

        for (int k = 0; k < gap1; k++) System.out.print(" ");
        System.out.print(f);
        for (int k = 0; k < gap2; k++) System.out.print(" ");
      }
      System.out.println();

      perpiece /= 2;
    }
  }
}
