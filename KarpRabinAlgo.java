public class KarpRabinAlgo {
    private final int PRIME = 101;
    private long calculateHash(String str){
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (long) (hash +str.charAt(i)*Math.pow(PRIME,i));
        }
        return hash;
    }
    private long updateHash (long prevHash , char oldChar , char newChar , int patternLength){
        long newHash = (prevHash-oldChar)/PRIME;
        newHash = (long) (newHash + newChar * Math.pow(PRIME,patternLength-1));
        return newHash;
    }
    public void search(String text , String pattern){
        int patterLength = pattern.length();
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0,patterLength));
        for (int i = 0; i <= text.length()-patterLength ; i++) {
            if(textHash==patternHash){
                if(text.substring(i,i+patterLength).equals(pattern)){
                    System.out.println();
                }
            }
            if(i<text.length()-patterLength){
                textHash = updateHash(textHash,text.charAt(i),text.charAt(i+patterLength),patterLength);
            }
        }
    }
}
