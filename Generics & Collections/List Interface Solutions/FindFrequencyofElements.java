public static Map<String, Integer> getFrequency(List<String> list) {
    Map<String, Integer> freqMap = new HashMap<>();
    for (String s : list) {
        freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
    }
    return freqMap;
}