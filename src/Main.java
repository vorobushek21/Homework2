public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println("dog = "+dog);
        var cat = 3.6;
        System.out.println("cat = "+cat);
        var paper = 763789;
        System.out.println("paper = "+paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println("dog + 4 = "+dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println("cat + 4 = "+cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println("paper + 4 = "+paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8;
        dog = dog - 3;
        System.out.println("dog - 3 = "+dog);
        dog = dog - 5;
        System.out.println("dog - 5 = "+dog);
        var cat = 3.6;
        cat = cat - 1;
        System.out.println("cat - 1 = "+cat);
        cat = cat - 6;
        System.out.println("cat - 6 = "+cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println("paper - 7639 = "+paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = "+friend);
        friend = friend * 2;
        System.out.println("friend * 2 = "+friend);
        friend = friend / 7;
        System.out.println("friend / 7 = "+friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = "+frog);
        frog = frog * 10;
        System.out.println("frog * 10 = "+frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = "+frog);
        frog = frog + 4;
        System.out.println("frog + 4 = "+frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        System.out.println("Вес первого боксера = "+weightBoxer1);
        var weightBoxer2 = 82.7;
        System.out.println("Вес второго боксера = "+weightBoxer2);
        var weightBoxer = weightBoxer1 + weightBoxer2;
        System.out.println("Вес двух бойцов = "+weightBoxer);
        var weightDifference = weightBoxer%weightBoxer1;
        System.out.println("Разница в весе бойцов = "+weightDifference);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        System.out.println("Вес первого боксера = "+weightBoxer1);
        var weightBoxer2 = 82.7;
        System.out.println("Вес второго боксера = "+weightBoxer2);
        var weightDifference = (weightBoxer1+weightBoxer2)%weightBoxer1;
        System.out.println("Разница в весе бойцов методом функции остатка = "+weightDifference);
        var weightDifference1 = weightBoxer2-weightBoxer1;
        System.out.println("Разница в весе бойцов методом вычитания = "+weightDifference1);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workHours = 640;
        System.out.println(workHours+" часов работы поделено между сотрудниками");
        var personHours = 8;
        System.out.println("Каждый сотрудник работает по "+personHours+" часов");
        var workers = workHours/personHours;
        System.out.println("Всего работников в компании - "+workers+" человек");
        var workers1 = workers+94;
        var workHours1 = workers1*personHours;
        System.out.println("Если в компании работает "+workers1+" человека, то всего "+workHours1+" часов работы может быть поделено между сотрудниками");
    }
}