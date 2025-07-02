package DSA.String;

public class MaximumConsecutiveRepeatingCharacter {

    public static void main(String[] args){
        String inputString = "wowowowowowwwwwwwww";
//        char output = getOutputON2(inputString); // o(n^2)
        char output = getOutputON1(inputString); // o(n^2)
        System.out.println("Most repeted character is : " + output);
    }

    private static char getOutputON1(String str) {

        int n = str.length();
        int count = 0;
        char res = str.charAt(0);
        int cur_count = 1;

        for (int i =0; i<n; i++){

            if (i<n-1 && str.charAt(i) == str.charAt(i+1)){
                cur_count++;
            }else {
                if (cur_count > count){
                    res = str.charAt(i);
                    count = cur_count;
                }
                cur_count=1;
            }

        }
        return res;
    }

    private static char getOutputON2(String inputString) {

        int stringLength = inputString.length();
        int count = 0;
        char result = inputString.charAt(0);

        for (int i=0; i<stringLength; i++){
            int currentCount = 1;
            for (int j=i+1; j<stringLength; j++){
                if (inputString.charAt(i) != inputString.charAt(j)){
                    break;
                }
                currentCount++;
            }

            if (currentCount > count){
                count = currentCount;
                result = inputString.charAt(i);
            }
        }
        return result;
    }
}