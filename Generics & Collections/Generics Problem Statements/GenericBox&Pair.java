class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

class Pair<T, U> {
    private T first;
    private U second;
    public Pair(T first, U second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
}