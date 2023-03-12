class Contains {
    
    public static boolean contains(String phrase, char c) {
        int length = phrase.length();
        int counter = 0;
        for(int i = 0; i < length; i++){
            if (c == phrase.charAt(i)) {
                counter = 1;
            }
        }
        if (counter == 1){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        boolean result = contains("lolcats", 'a');
        System.out.println(result); // should print true
        
        result = contains("lolcats", 'g');
        System.out.println(result); // should print false
    }
}
