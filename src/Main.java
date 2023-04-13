public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        int secondAge = 16;
        if (secondAge >= 18) {
            System.out.println("Если возраст человека равен " + secondAge + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + secondAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градуса,можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        int temperatureSecond = 15;
        if (temperatureSecond >= 5) {
            System.out.println("На улице " + temperatureSecond + " градусов,можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatureSecond + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int velocity = 80;
        if (velocity > 60) {
            System.out.println("Если скорость " + velocity + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + velocity + ", можно ездить спокойно");
        }
        int velocitySecond = 45;
        if (velocitySecond < 60) {
            System.out.println("Если скорость " + velocitySecond + ", можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + velocitySecond + ", то придётся заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int ageForChildrenGarden = 5;
        if (ageForChildrenGarden >= 2 && ageForChildrenGarden <= 6) {
            System.out.println("Если возраст человка равен " + ageForChildrenGarden + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человака равен " + ageForChildrenGarden + ", то он не подходит для детского сада");
        }
        int ageForSchool = 8;
        if (ageForSchool >= 7 && ageForSchool <= 18) {
            System.out.println("Если возраст человка равен " + ageForSchool + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человка равен " + ageForSchool + ", то не подходит для школы");
        }
        int ageForUniversity = 22;
        if (ageForUniversity >= 18 && ageForUniversity < 24) {
            System.out.println("Если возраст человка равен " + ageForUniversity + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человка равен " + ageForUniversity + ", то не подходит для университета");
        }
        int ageForJob = 26;
        if (ageForJob > 24) {
            System.out.println("Если возраст человка равен " + ageForJob + ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человка равен " + ageForJob + ", то ему ещё рано ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            boolean canGoOnlyWithPArent = age > 5 && age < 14;
            if (canGoOnlyWithPArent) {
                System.out.println("Если возраст ребёнка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else {
                boolean canGoSingle = age > 14;
                if (canGoSingle) {
                    System.out.println("Если возраст ребёнка равен " + age + ", то он может кататься без сопровождения взрослого");
                }
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 80;
        int allPlaces = 102;
        int seatPlaces = 60;
        int standPlaces = 42;
        if (passengers < allPlaces && passengers < seatPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (passengers < allPlaces && passengers > seatPlaces) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            if (passengers > allPlaces) {
                System.out.println("Вагон забит, мест нет");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 12;
        int three = 2;
        if (one < two) one = two;
        else two = one;
        if (two < three) one = three;
        System.out.println("Наибольшее число " + one);
    }
}


