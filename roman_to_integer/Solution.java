class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> numeralMap = new HashMap<Character, Integer>();
        numeralMap.put('I', 1);
        numeralMap.put('V', 5);
        numeralMap.put('X', 10);
        numeralMap.put('L', 50);
        numeralMap.put('C', 100);
        numeralMap.put('D', 500);
        numeralMap.put('M', 1000);
        
        int total = 0;
        
        int i;
        for (i = 0; i < s.length(); i++) {
            // i+1 < s.length() ensures iteration doesn't surpass string array end
            if (i+1 < s.length() && numeralMap.get(s.charAt(i)) < numeralMap.get(s.charAt(i+1))) {
                total -= numeralMap.get(s.charAt(i));
            }
            else {
                total += numeralMap.get(s.charAt(i));
            }
        }
        return total;
    }
}
