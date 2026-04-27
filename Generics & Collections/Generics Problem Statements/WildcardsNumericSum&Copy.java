public static double sumNumbers(List<? extends Number> list) {
    double sum = 0;
    for (Number n : list) sum += n.doubleValue();
    return sum;
}

public static void copyList(List<? super Number> dest, List<? extends Number> src) {
    dest.addAll(src); [cite: 401]
}