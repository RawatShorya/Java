package DSA.String;

import java.util.Arrays;

public class ReverseAString {
  public static void main(String[] args) {
    System.out.println(reverseWords1("  the sky is  blue "));
  }

    public static String reverseWords1(String s) {
        String[] arr = s.split(" ");
        return null;
    }

  public static String reverseWords(String s) {

    char[] strArray = s.toCharArray();
    char previous = '\0';

    StringBuilder cleaned = new StringBuilder();
    for (int i = 0; i < strArray.length; i++) {
      char current = strArray[i];
      if (current != ' ') {
        cleaned.append(current);
        previous = current;
      } else if (previous != ' ' && previous != '\0') {
        cleaned.append(' ');
        previous = ' ';
      }
    }
    int len = cleaned.length();
    while (cleaned.charAt(len - 1) == ' ') {
      cleaned.setLength(len - 1);
      len--;
    }
    cleaned.reverse();
    StringBuilder word = new StringBuilder();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < cleaned.length(); i++) {
      char current = cleaned.charAt(i);
      if (current != ' ') {
        word.append(current);
      } else {
        result.append(word.reverse());
        result.append(' ');
        word.setLength(0);
      }
    }
    if (!word.isEmpty()){
        result.append(word.reverse());
    }
      return result.toString();
  }
}
