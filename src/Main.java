public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        int[] arr = generateRandomArray();
        int result = 0;

        for (int j : arr) {
            result += j;
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей.");
        System.out.println();
    }
    public static void task2() {

        int[] arr = generateRandomArray();
        int minWaste = 200_001;
        int maxWaste = 99_999;

        for (int j : arr) {
            if (j < minWaste) {
                minWaste = j;
            }
            if (j > maxWaste) {
                maxWaste = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. " +
                "Максимальная сумма трат за день составила  " + maxWaste + " рублей");
        System.out.println();
    }

    public static void task3() {

        int[] arr = generateRandomArray();
        int summ = 0;
        double arithMean = 0;

        for (int i : arr) {
            summ += i;
            arithMean = (summ * 1.) / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + arithMean + " рублей");
        System.out.println();
    }

    public static void task4() {

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}