public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
    Iterator<T> mainPtr = list.iterator();
    Iterator<T> refPtr = list.iterator();

    for (int i = 0; i < n; i++) {
        if (!refPtr.hasNext()) return null;
        refPtr.next();
    }

    T result = null;
    while (refPtr.hasNext()) {
        refPtr.next();
        result = mainPtr.next();
    }
    return result;
}