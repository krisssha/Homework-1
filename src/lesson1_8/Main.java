package lesson1_8;

public class Main {
    public static void main(String[] args) {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;

        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);

        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println(weightDifference);

        weightDifference = boxerWeight2 % boxerWeight1;
        System.out.println(weightDifference);
        System.out.println();

        var totalHours = 640;
        var workinHours = 8;
        var workers = totalHours / workinHours;
        System.out.println("Всего работников в компании - " + workers + " человек");

        var newWorkers = workers + 94;
        System.out.println(newWorkers);

        var newWorkinHours = newWorkers * workinHours;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newWorkinHours + " часов работы может быть поделено между сотрудниками.");

    }
}