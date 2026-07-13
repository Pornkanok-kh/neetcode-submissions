class Solution {
    public boolean isAnagram(String s, String t) {
        String[] letterS = s.split("");
        Arrays.sort(letterS);
        Arrays.toString(letterS);

        String[] letterT = t.split("");
        Arrays.sort(letterT);
        Arrays.toString(letterT);
        
        boolean isEqual = Arrays.equals(letterS, letterT);
        return isEqual;

    }
}

