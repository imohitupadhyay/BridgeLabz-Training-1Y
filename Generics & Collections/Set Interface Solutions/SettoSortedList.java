public List<Integer> setToSortedList(Set<Integer> set) {
    List<Integer> list = new ArrayList<>(set);
    Collections.sort(list);
    return list;
}