class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int m = s.length();
        int n = t.length();
        if (m!=n) return false;
        for(int i = 0; i < m; i++) {
            arr[s.charAt(i) - 'a']+=1;
            arr[t.charAt(i) - 'a']-=1;
        }
        for(int i = 0; i < 26; i++) {
            if(arr[i] != 0) return false;
        }
        return true;

    }
}
