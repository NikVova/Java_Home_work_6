package org.example;

public class EquationSolver {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    String equation = String.format("%d%d+%d%d=%d%d", q, w, w, e, q, w);
                    if (q + w == e && equation.equals("?4+?5=69")) {
                        System.out.println(equation.replace("?", String.valueOf(q)).replace("?", String.valueOf(w)));
                        return;
                    }
                }
            }
        }
        System.out.println("Решение не найдено.");
    }
}