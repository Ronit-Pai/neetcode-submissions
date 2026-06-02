class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> r = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            r.putIfAbsent(sortedS, new ArrayList<>());
            r.get(sortedS).add(s);
        }
        return new ArrayList<>(r.values());
    }
}