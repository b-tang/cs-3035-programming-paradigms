package adt;

public class PQEntry {
    private int priority;
    private String value;

    public PQEntry(String value, int priority) {
        this.priority = priority;
        this.value = value;
    }

    public PQEntry() {
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
