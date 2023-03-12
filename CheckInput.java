class CheckInput {
    
    public static boolean IsInteger(String input) {
        // algorithm: if any character is not a digit [0,9], 
        //   we should return false. Otherwise, we should return true
        if (input.length() == 0) {
            return false;
        }
        
        int startIndex = 0;
        if (input.charAt(0) == '-') {
            startIndex = 1;
        }
        
        for (int i = startIndex; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }  
}