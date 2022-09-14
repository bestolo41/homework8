public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1: объявил массивы\n");

        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;

        double[] numbers2 = {1.57, 7.654, 9.986};

        String[] names = {"Иван", "Дмитрий", "Сергей"};

        System.out.println("\nЗадача 2\n");

        for (int i = 0; i < 3; i++) {
            if (i == numbers1.length - 1) {
                System.out.print(numbers1[i] + "\n");
            } else {
                System.out.print(numbers1[i] + ", ");
            }
        }

        for (int i = 0; i < 3; i++) {
            if (i == numbers2.length - 1) {
                System.out.print(numbers2[i] + "\n");
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }

        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.print(names[i] + "\n");
            } else {
                System.out.print(names[i] + ", ");
            }
        }

        System.out.println("\nЗадача 3\n");

        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers1[i] + "\n");
            } else {
                System.out.print(numbers1[i] + ", ");
            }
        }

        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers2[i] + "\n");
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }

        for (int i = names.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(names[i] + "\n");
            } else {
                System.out.print(names[i] + ", ");
            }
        }

        System.out.println("\nЗадача 4\n");

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 == 0) {
                System.out.println(numbers1[i]);
            } else {
                System.out.println(numbers1[i] + 1);
            }
        }
    }
}
