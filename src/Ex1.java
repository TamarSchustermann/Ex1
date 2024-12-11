public class Ex1 {

    public static void main(String[] args) {  //לא לשכוח למחוק
        if (isNumber("0b")) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");
        }
    }
    public static boolean isValidNumberPart(String num) {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int j = 0; j < num.length(); j++) {
            char c = num.charAt(j);
            boolean isValid = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == c) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidBasePart(String num) {
        char[] arr = {'2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num.charAt(0)) {
                return true;
            }
        }
        return false;
    }
    private static int convertBase(String basePart) {
        if (basePart.length() == 1) {
            char c = basePart.charAt(0);
            if (Character.isDigit(c)) {
                return c - '0';
            } else if (c >= 'A' && c <= 'G') {
                return 10 + (c - 'A');
            }
        }
        return -1;
    }

    public static boolean isNumber(String a) {
        if (a == null || a.isEmpty()) {
            return false;
        }
        int bIndex = a.indexOf('b');
        if (bIndex == -1) {
            return false;
        }
        String numberPart = a.substring(0, bIndex);
        String basePart = a.substring(bIndex + 1);
        if (!isValidNumberPart(numberPart) || numberPart.isEmpty() || basePart.isEmpty()) {
            return false;
        }
        int base = convertBase(basePart);
        if (base < 2 || base > 16) {
            return false;
        }
        for (char c : numberPart.toCharArray()) {
            if (Character.digit(c, base) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int number2Int(String num) {
        int ans = -1;
        if (isNumber(num)) {
        int bIndex = num.indexOf('b');
        String numberPart = num.substring(0, bIndex);
        String basePart = num.substring(bIndex + 1);
        int decimalValue = Integer.parseInt(numberPart, convertBase(basePart));
        ans = decimalValue;}
        return ans;
    }

    public static String int2Number(int num, int base) {
        String ans = "";
//        // Add your code here
//        if (isNumber(int num, int base)) {
//            int result = Integer.parseInt(int num, int base);
//        } else {
//            System.out.print("");
//        }
//        ////////////////////
        return ans;
    }

    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        // Add your code here
        if (equals(n1, n2)) {
            return ans;
        }
        return ans;
        }

        public static int maxIndex(String[] arr){
            int ans = 0;
            int max = 0;
            int index = -1;
            for(int i = 0; i< arr.length; i++) {
                if (isNumber((arr[i]))) ; {
                    int[] a;
                     if (number2Int(arr[i])>max){
                         max= number2Int(arr[i]);
                         index= i;
                     }
                }
            }
            ans = index;
            return ans;
        }
}
