package adt;

public class PQTester {
    public static void main(String[] args) {
        PQTester t = new PQTester();
        System.out.println("Testing with ArrayStringPQ: ");
        t.test(new ArrayStringPQ());
        System.out.println();
        System.out.println("Testing with LinkedListStringPQ: ");
        t.test(new LinkedListStringPQ());
    }

    public void test(StringPQ pq) {
        pq.insert("Eat", 3);
        pq.insert("Sleep", 2);
        pq.insert("Rake the lawn", 5);
        pq.insert("Study", 1);
        pq.insert("Maintain social relationships", 4);

        pq.setPriority("Eat", 4);
        pq.setPriority("Maintain social relationships", 3);

        while (pq.size() > 0)
            System.out.println(pq.removeMin());
    }

}