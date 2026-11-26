class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("-(?!\\d)|[^a-zA-Z0-9-]", "").toLowerCase();
        System.out.println(s1);
        String srev = new StringBuilder(s1).reverse().toString();
        System.out.println(srev);

        if(s1.equals(srev)) { 
            return true;
        }  
        else{ 
            return false;
        }
      
    }
}; 
