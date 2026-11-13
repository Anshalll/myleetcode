
class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean exponent = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                digit = true;
            } 
            else if (ch == '+' || ch == '-') {
                // Sign is allowed only at the beginning
                // or immediately after e/E
                if (i != 0 && s.charAt(i - 1) != 'e' 
                           && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } 
            else if (ch == '.') {
                // Dot cannot appear after exponent or another dot
                if (dot || exponent) {
                    return false;
                }
                dot = true;
            } 
            else if (ch == 'e' || ch == 'E') {
                // Exponent requires a number before it
                if (exponent || !digit) {
                    return false;
                }

                exponent = true;
                digit = false;
            } 
            else {
                return false;
            }
        }

        return digit;
    }
}
