class Patient implements Comparable<Patient> {
    String name;
    int severity; // Higher number = higher priority

    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }
}