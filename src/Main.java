public class Main {
    public static void main(String[] args) {
        task14();
    }

    public static void task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        }

    }

    public static void task2() {
        {
            int age = 17;
            if (age >= 18)
                System.out.println("Ты можешь водить");
            if (age < 18) {
                System.out.println("Ты не можешь водить");
            }
        }
    }

    public static void task3() {
        int score = 70;
        if (score <= 60) {
            System.out.println("Ты не прошел тест");
        } else
            System.out.println("Ты прошел тест");
    }

    public static void task4() {
        int weight = 75;
        if (weight >= 55 && weight <= 85) {
            System.out.println("Твой вес в пределах нормы");
        }
    }

    public static void task5() {
        int temperature = 35;
        if (temperature < 0 || temperature > 40) {
            System.out.println("Сейчас экстремальные условия");
        }
    }

    public static void task6() {
        boolean teacherIsHappy = true;
        if (teacherIsHappy) {
            System.out.println("Учитель доволен");
        }
    }

    public static void task7() {
        int peopleInRoom = 55;
        boolean roomIsNotSuitable = peopleInRoom < 20 || peopleInRoom > 60;
        if (roomIsNotSuitable) {
            System.out.println("В аудитории недостаточно или слишком много людей");
        }
    }

    public static void task8() {
        int age = 15;
        if (age >= 18) {
            System.out.println("совершеннолетие");
        } else
            System.out.println("не совершеннолетие");
    }


    public static void task9() {
        int temp = 4;
        if (temp < 5 || temp > 5) {
            System.out.println("шапка нужна");
        } else
            System.out.println("шапка не нужна");
    }

    public static void task10() {
        int speed = 60;
        if (speed <= 60 || speed >= 60) {
            System.out.println("скорость ниже , штрвфом не облагается");
        } else
            System.out.println("скорость выше, штрафом облагается");
    }

    public static void task11() {
        int ageHum = 77;
        if (ageHum >= 2 && ageHum <= 6) {
            System.out.println("садик");
        }
        if (ageHum >= 7 && ageHum <= 17) {
            System.out.println("школа");
        }
        if (ageHum >= 18 && ageHum <= 24) {
            System.out.println("универ");
        }
        if (ageHum > 24) {
            System.out.println("работа");


        }
    }

    public static void task12() {
        int ageChild = 32;
        if (ageChild < 5) {
            System.out.println("кататься на атракционе нельзя");
        }
        if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("можно только со взрослым.Если взрослого нет кататься нельзя");
        }
        if (ageChild > 14) {
            System.out.println("кататься можно без сопровождения");
        }
    }

    public static void task13() {
        int MaxPeopleInVan = 102;
        System.out.println("вместимость одного поезда=" + MaxPeopleInVan);
        int SeetPeopleInVan = 60;
        System.out.println("сидячих мест в одном поезде=" + SeetPeopleInVan);
        int DownPeopleInVan = MaxPeopleInVan - SeetPeopleInVan;
        System.out.println("стоячих мест в одном поезде=" + DownPeopleInVan);
        int peopleInVan = 110;
        if (peopleInVan >= 0 && peopleInVan <= 60) {
            System.out.println("есть сидячие места");
        }
        if (peopleInVan >= 61 && peopleInVan <= 102 || peopleInVan >= 102) {
            System.out.println("есть только стоячие места");
        }
        if (peopleInVan >= 102) {
            System.out.println("мест нет");
        }
    }


    public static void task14() {
        int one = 35;
        int two = 12;
        int three = 5;
        if (one >= two && one <= three) {
            System.out.println("макс число в переменной one" + one);
        } else if (two >= three) {
            System.out.println("максимальное число в переменной two" + two);

        }
    }
}































