package com.lc.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class DoorProblem {

    public static String getDoorOrder(int N, int[] A, int[] D) {
        // N = number of people, A = arrival time, D = direction
        byte doorState = 1;
        int nCounter = 0;
        int second = 0;
        Queue<Integer> enter = new LinkedList<>();
        Queue<Integer> exit = new LinkedList<>();
        boolean waitingToEnter = false;
        boolean waitingToExit = false;

        while (nCounter < N || (waitingToEnter || waitingToExit)) {
            while (nCounter < N && A[nCounter] == second) {
                if (D[nCounter] == 0) {
                    enter.add(nCounter);
                } else {
                    exit.add(nCounter);
                }
                nCounter++;
            }

            waitingToEnter = !enter.isEmpty();
            waitingToExit = !exit.isEmpty();

            if (waitingToEnter && waitingToExit) {
                if (doorState == 1) {
                    A[exit.poll()] = second;
                } else {
                    A[enter.poll()] = second;
                }
            }
            else if (waitingToEnter) {
                A[enter.poll()] = second;
                doorState &= 0;
            }
            else if (waitingToExit) {
                A[exit.poll()] = second;
                doorState |= 1;
            }
            else {
                // Nothing happened this second but we're not done processing
                // people at the door.  Reset the door back to Exit status and
                // save iterations by jumping ahead in time to A[nCurrent] - 1
                // (minus 1 so that second++ doesn't skip us ahead erroneously).
                doorState |= 1;
                if (nCounter < N) {
                    second = A[nCounter] - 1;
                }
            }

            second++;
        }

        StringBuilder resultBuffer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                resultBuffer.append(" ");
            }
            resultBuffer.append(A[i]);
        }

        return resultBuffer.toString();
    }
}
