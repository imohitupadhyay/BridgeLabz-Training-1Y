public static <T> void rotateList(List<T> list, int n) {
    int size = list.size();
    if (size == 0) return;
    n = n % size;
    for (int i = 0; i < n; i++) {
        T last = list.remove(size - 1);
        list.add(0, last);
    }
}