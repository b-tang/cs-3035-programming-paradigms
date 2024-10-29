package adt;

import java.util.LinkedList;

public class LinkedListStringPQ implements StringPQ {
    LinkedList<PQEntry> list;

    public LinkedListStringPQ() {
        list = new LinkedList<>();
    }

    @Override
    public void insert(String s, int priority) {
        list.add(new PQEntry(s, priority));
    }

    @Override
    public String removeMin() {
        if (list.isEmpty()) {
            return null;
        }
        PQEntry min = list.getFirst();
        for (PQEntry entry : list) {
            if (entry.getPriority() < min.getPriority()) {
                min = entry;
            }
        }
        list.remove(min);
        return min.getValue();
    }

    @Override
    public void setPriority(String value, int newPriority) {
        for (PQEntry entry : list) {
            if (entry.getValue().equals(value)) {
                entry.setPriority(newPriority);
            }
        }
    }

    @Override
    public int size() {
        return list.size();
    }

}
