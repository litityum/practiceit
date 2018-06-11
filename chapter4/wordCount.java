public static int wordCount(String sentence) {
    int length = sentence.length();
    int result = 0;
    if(sentence.charAt(0) != ' ')
        result++;
    for(int i = 0; i < length - 1; i++){
        if(sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' '){
            result++;
            
        }
    }
    return result;
}