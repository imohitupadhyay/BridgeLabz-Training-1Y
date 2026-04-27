public void setOperations(Set<Integer> s1, Set<Integer> s2) {
    Set<Integer> union = new HashSet<>(s1);
    union.addAll(s2); [cite: 31]

    Set<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2); [cite: 31]

    Set<Integer> symDiff = new HashSet<>(union);
    symDiff.removeAll(intersection); [cite: 35]
}