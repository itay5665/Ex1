
public class Ex1 {

    //replace the string with int value
    public static int number2Int(String num) {
        int ans = -1;//הגדרת ברירת מחדל

        //
        if (isNumber(num)) {
            String[] parts = num.split("b");
            String numberPart = parts[0];
            int base = Integer.parseInt(parts[1]);
            try {
                ans = Integer.parseInt(numberPart, base);
            } catch (NumberFormatException e) {
                ans = -1;
            }
        }

        return ans;
    }
    //check if the input string is by the format of <number>b<base>
    public static boolean isNumber(String a) {
       //check if "b" exist in the input string
        if (a == null || !a.contains("b")) {
            return false;
        }

        String[] parts = a.split("b");
        if (parts.length != 2) {
            return false;
        }

        String numberPart = parts[0];
        String basePart = parts[1];
        try {
            int base = Integer.parseInt(basePart);
            return base >= 2 && base <= 16;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //replace the int with string value for out result
    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) {
            return "";
        }
        return Integer.toString(num, base).toUpperCase() + "b" + base;
    }
    //provide insurance that the inputs arent the same.
    public static boolean equals(String n1, String n2) {
        return number2Int(n1) != -1 && number2Int(n2) != -1 && number2Int(n1) == number2Int(n2);
    }
    //find the max index for the max value
    public static int maxIndex(String[] arr) {
        int maxIndex = 0;
        int maxValue = -1;

        for (int i = 0; i < arr.length; i++) {
            int value = number2Int(arr[i]);
            if (value > maxValue) {
                maxValue = value;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
