package DSA.Arrays;

public class StringCompression {
  public static void main(String[] args) {

    char[] chars = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    compress(chars);
  }

  public static int compress(char[] chars) {
    char letter = '\0';
    int count = 0;
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < chars.length; i++) {
      if (letter == '\0') {
        letter = chars[i];
        count++;
      } else if (letter == chars[i]) {
        count++;
      } else {
        str.append(letter);
        if (count > 1) {
          str.append(count);
        }
        letter = chars[i];
        count = 1;
      }
    }
    if (letter != '\0') {
      str.append(letter);
      if (count > 1) {
        str.append(count);
      }
    }
    for (int i = 0; i < str.length(); i++) {
      chars[i] = str.charAt(i);
    }
    return str.length();
  }
}
