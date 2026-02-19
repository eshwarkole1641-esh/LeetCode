class Solution {
    public boolean equalFrequency(String word) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Try removing one occurrence of each character
        for (int i = 0; i < 26; i++) {

            if (freq[i] == 0) continue;

            freq[i]--;  // remove one character

            if (allEqual(freq)) {
                return true;
            }

            freq[i]++;  // restore
        }

        return false;
    }

    private boolean allEqual(int[] freq) {
        int value = 0;

        for (int f : freq) {
            if (f == 0) continue;

            if (value == 0) {
                value = f;
            } else if (f != value) {
                return false;
            }
        }

        return true;
    }
}
