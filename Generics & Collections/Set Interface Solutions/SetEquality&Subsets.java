// Equality: set1.equals(set2) returns true if elements are same regardless of order[cite: 24, 25].
// Subset:
public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
    return set2.containsAll(set1); // Check if set1 is subset of set2 [cite: 42]
}