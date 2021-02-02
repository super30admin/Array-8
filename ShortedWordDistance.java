//TC: O(n*l), n: length of words[], l: average length of all the strings in words[]
//SC: O(1)

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int n = words.length;
        int i1 = -1; int i2 = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(words[i].equals(word1)){
                i1 = i;
            }
            if(words[i].equals(word2)){
                i2 = i;
            }
            if(i1 != -1 && i2 != -1){
                min = Math.min(min, Math.abs(i2-i1));
            }
        }
        return min;
    }
}
