package adt;

public class ArrayStringPQ implements StringPQ {
    PQEntry[] list;
    int size;

    public ArrayStringPQ() {
        list = new PQEntry[2];
        size = 0;
    }

    @Override
    public void insert(String s, int priority) {
        if (isFull()) {
            expand();
        }
        PQEntry newEntry = new PQEntry(s, priority);
        list[size++] = newEntry;
    }

    @Override
    public String removeMin() {
        if (size == 0) {
            return null;
        }
        PQEntry min = list[0];
        int minIndex = 0;
        for (int i = 0; i < size; i++) {
            PQEntry entry = list[i];
            if (entry.getPriority() < min.getPriority()) {
                min = entry;
                minIndex = i;
            }
        }
        for (int i = minIndex; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
        return min.getValue();
    }

    @Override
    public void setPriority(String value, int newPriority) {
        for (int i = 0; i < size; i++) {
            PQEntry entry = list[i];
            if (entry.getValue().equals(value)) {
                entry.setPriority(newPriority);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void expand() {
        PQEntry[] newList = new PQEntry[list.length * 2];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

}
