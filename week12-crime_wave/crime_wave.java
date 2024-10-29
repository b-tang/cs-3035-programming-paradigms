package week12;

import java.util.PriorityQueue;
import java.util.Queue;

public class crime_wave {
    public static void main(String[] args) {
        queue1 = new PriorityQueue<Integer>();
        queue2 = new PriorityQueue<Integer>();

        /*
         * crimes -> counts total number of crimes committed
         * solved -> counts total number of crimes solved
         * totalSev -> adds up the severities of all cases
         */
        int crimes = 0, solved = 0, totalSev = 0;

        while (crimes < 200 && solved < 200) {
            // randomly choosing a move
            int move = randMove();
            /*
             * If both the queues are empty , then there are no cases to solve.
             * The only option is to commit a crime
             * So set move = 0
             */
            if (queue1.isEmpty() && queue2.isEmpty()) {
                move = 0;
            }

            // Commit a crime
            if (move == 0) {
                int criminal = randCriminal(); // Randomly choosen criminal
                int severity = randSeverity(); // Randomly choosen severity
                totalSev += severity; // Adding total severity
                commitCrime(criminal, severity); // committing crime
                crimes++;
            }
            
            // Solve a crime case
            else {
                int criminal = randCriminal(); // Randomly choosen criminal
                int detective = randDetective(); // Randomly choosen detective
                if (queue1.isEmpty()) {
                    criminal = 2; // If the queue of criminal 1 is empty, set criminal to 2
                }
                if (queue2.isEmpty()) {
                    criminal = 1; // If the queue of criminal 2 is empty, set criminal to 1
                }
                solveCase(criminal, detective); // solving case
                solved++;
            }
        }

        /*
         * When all the crimes will be committed, then there is task of only solving
         * crimes
         * The loop body is same as above
         */
        while (solved < 200) {
            int criminal = randCriminal();
            int detective = randDetective();
            if (queue1.isEmpty()) {
                criminal = 2;
            }
            if (queue2.isEmpty()) {
                criminal = 1;
            }
            solveCase(criminal, detective);
            solved++;
        }

        double avgSeverity = totalSev * 1.00 / crimes * 1.00;
        System.out.println("\nCrimes committed: " + crimes);
        System.out.println("Average severity: " + avgSeverity);
        System.out.println("Cases solved: " + solved);
    }

    /*
     * two queues for storing crime severities of two criminals
     * queue1 -> criminal 1
     * queue2 -> criminal 2
     */
    static Queue<Integer> queue1;
    static Queue<Integer> queue2;

    // It returns random criminal in the range [1-2]
    static int randCriminal() {
        return (int) (Math.random() * 2 + 1);
    }

    // It returns random detective in the range [1-2]
    static int randDetective() {
        return (int) (Math.random() * 2 + 1);
    }

    // It returns random severity in the range [0-10]
    static int randSeverity() {
        return (int) (Math.random() * 11);
    }

    // It returns random move in the range [0-1]
    static int randMove() {
        return (int) (Math.random() * 2);
    }

    /*
     * Method that simulates committing a crime
     * It adds crime severity in the queue of criminal
     */
    static void commitCrime(int criminal, int severity) {
        if (criminal == 1) {
            queue1.add(severity);
        } else {
            queue2.add(severity);
        }
        System.out.println("\ncriminal " + criminal + " commits a crime of severity " + severity);
    }

    /*
     * Method that simulates solving a crime
     * It removes crime severity from the front of queue of corresponding criminal
     */
    static void solveCase(int criminal, int detective) {
        int severity;
        if (criminal == 1) {
            severity = queue1.poll();
        } else {
            severity = queue2.poll();
        }
        System.out.println("\ndetective " + detective + " solves a crime of severity " + severity);
    }

}
