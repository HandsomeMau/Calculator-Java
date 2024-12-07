public class Calculate {
    public static int addition(int firstNo, int secondNo, String operation) {
        GUI.ans = firstNo + secondNo;
        return GUI.ans;
    }
    public static int subtraction(int firstNo, int secondNo, String operation) {
        GUI.ans = firstNo - secondNo;
        return GUI.ans;
    }
    public static int multiply(int firstNo, int secondNo, String operation) {
        GUI.ans = firstNo * secondNo;
        return GUI.ans;
    }
    public static int divide(int firstNo, int secondNo, String operation) {
        GUI.ans = firstNo / secondNo;
        return GUI.ans;
    }
}

//Note: For other operations, just copy paste. Ill do the displaying the answer part later

