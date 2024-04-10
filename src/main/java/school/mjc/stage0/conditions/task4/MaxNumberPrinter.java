package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int a = first > second ? first : second;
        System.out.println(a > third ? a : third);
    }
}
