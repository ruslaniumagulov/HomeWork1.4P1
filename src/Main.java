public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 8;
        if (age >= 18) {
            System.out.println("Поздравляем тебя с днём совершеннолетия!!!");
        }
        if (age < 18) {
            System.out.println("информационное сообщение: Ваш возраст совершеннолетия ещё не наступил! Подождите ещё немного.");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int carCapacity = 102;
        int seats = 60;
        int standingRoom = carCapacity - seats;
        int seatsUsed = 0;
        int otherUsed = 0;
        if (seatsUsed < seats) {
            System.out.println("В салоне " + (seats - seatsUsed) + " свободных сидячих мест");
        }
        if (seatsUsed == seats) {
            System.out.println("В салоне нет свободных сидячих мест");
        }
        if (otherUsed < standingRoom) {
            System.out.println("В салоне " + (standingRoom - otherUsed) + " свободных стоячих мест");
        }
        if (otherUsed == standingRoom) {
            System.out.println("В салоне нет свободных стоячих мест");
        }
        if (seatsUsed == seats && otherUsed == standingRoom) {
            System.out.println("В салоне все места заняты");
        }
        if (seatsUsed == 0 && otherUsed == 0) {
            System.out.println("В салоне все места свободны");
        }
    }
}