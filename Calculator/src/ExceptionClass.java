public class ExceptionClass extends Exception {
    public static void exitProgram1() {
        System.out.println("В римской системе нет отрицательных чисел");
        System.exit(0);
    }

    public static void exitProgram2() {
        System.out.println("Используются одновременно разные системы счисления");
        System.exit(0);
    }

    public static void exitProgram3() {
        System.out.println("Строка не является математической операцией");
        System.exit(0);
    }

    public static void exitProgram4() {
        System.out.println("Формат математической операции не удовлетворяет " +
                "заданию - два операнда и один оператор (+, -, /, *)");
        System.exit(0);
    }

    public static void exitProgram5() {
        System.out.println("Значения чисел должны быть от 1 до 10");
        System.exit(0);
    }


}
