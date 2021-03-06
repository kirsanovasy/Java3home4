package ru.geekbrains.java3home4;

public class Letters {
    private String currentLetter = "A";

    public void printA() {
        synchronized (this) {
            try {
                for (int i = 0; i < 3; i++) {
                    while (!currentLetter.equals("A")) {
                        wait();
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("A");
                    currentLetter = "B";
                    notifyAll();
                }
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            }
        }
    }

    public void printB() {
        synchronized (this) {
            try {
                for (int i = 0; i < 3; i++) {
                    while (!currentLetter.equals("B")) {
                        wait();
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("B");
                    currentLetter = "C";
                    notifyAll();
                }
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            }
        }
    }

    public void printC() {
        synchronized (this) {
            try {
                for (int i = 0; i < 3; i++) {
                    while (!currentLetter.equals("C")) {
                        wait();
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("C");
                    currentLetter = "A";
                    notifyAll();
                }
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            }
        }
    }

}
// что такое в скобках в ковычках "SWW" throw new RuntimeException("SWW", e); ?

