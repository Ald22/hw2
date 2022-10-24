public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var stuffWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух бойцов " + stuffWeight + " кг");
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе " + differenceWeight + " кг");

        // Задача 7
        System.out.println("Разница в весе " + differenceWeight + " кг");
        var differenceWeight2 = (boxer2Weight) % boxer1Weight;
        System.out.println("Разница в весе " + differenceWeight2 + " кг!");

        // Задача 8
        var allTimeWork = 640;
        var oneManTimeWork = 8;
        var allMan = allTimeWork / oneManTimeWork;
        System.out.println("Всего работников в компании - " + allMan + " человек");
        var newAllman = allMan + 94;
        var newAllTimeWork = newAllman * oneManTimeWork;
        System.out.println("Если в компании работает " + newAllman + " человек, то всего " + newAllTimeWork + " часов работы может быть поделено между сотрудниками");



    }
}
