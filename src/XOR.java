public class XOR {
    public static void main(String[] args){
//    System.out.println(decimalToBinary(4));
        System.out.println(binaryToDecimal("100"));
    }

    private static int binaryToDecimal(String x) {
        int decimal = 0;
        for (int i =0; i<x.length(); i++){
            decimal = decimal * 2 + (x.charAt(i) - '0');
        }
        return decimal;
    }

    private static String decimalToBinary(int x) {
        if (x == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (x>0){
            binary.append(x%2);
            x = x/2;
        }
        return binary.reverse().toString();
    }

    static String xorBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        a = String.format("%" + maxLen + "s", a).replace(' ', '0');
        b = String.format("%" + maxLen + "s", b).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }
}
