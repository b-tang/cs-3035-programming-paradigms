package adt;

public interface StringPQ {
    public void insert(String s, int priority);

    public String removeMin();

    public void setPriority(String value, int newPriority); // sets the priority for *all* matching entries to the new
                                                            // priority

    public int size();
}