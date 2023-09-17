package geek_java_oop_lesson4;

/**
 * Main class для демонстрации функциональности класса Box и его взаимодействия с фруктами.
 */
public class Program {

    public static void main(String[] args) {
        // Создание двух коробок для яблок и одной коробки для апельсинов.
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        // Добавление 5 яблок в первую коробку.
        for (int i = 0; i < 5; i++) {
            appleBox1.addFruit(new Apple());
        }

        // Добавление 3 яблок во вторую коробку.
        for (int i = 0; i < 3; i++) {
            appleBox2.addFruit(new Apple());
        }

        // Добавление 4 апельсинов в коробку для апельсинов.
        for (int i = 0; i < 4; i++) {
            orangeBox1.addFruit(new Orange());
        }

        // Добавление 8 апельсинов в коробку для апельсинов.
        for (int i = 0; i < 8; i++) {
            orangeBox2.addFruit(new Orange());
        }

        // Вывод веса каждой коробки.
        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox1: " + orangeBox1.getWeight());
        System.out.println("Вес orangeBox2: " + orangeBox2.getWeight());

        // Сравнение веса коробки с appleBox1 и коробки с orangeBox1.
        System.out.println("Сравнение appleBox1 и orangeBox1: " + appleBox1.compare(orangeBox1));

        // Сравнение веса коробки с appleBox2 и коробки с orangeBox2.
        System.out.println("Сравнение appleBox2 и orangeBox2: " + appleBox2.compare(orangeBox2));

        // Перемещение яблок из первой коробки во вторую.
        appleBox1.transferFruits(appleBox2);

        // Перемещение апельсинов из первой коробки во вторую.
        orangeBox1.transferFruits(orangeBox2);

        // Вывод веса коробок после перемещения.
        System.out.println("После перемещения фруктов:");
        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox1: " + orangeBox1.getWeight());
        System.out.println("Вес orangeBox2: " + orangeBox2.getWeight());

        // Сравнение веса коробки с appleBox1 и коробки с orangeBox1.
        System.out.println("Сравнение appleBox1 и orangeBox1: " + appleBox1.compare(orangeBox1));

        // Сравнение веса коробки с appleBox2 и коробки с orangeBox2.
        System.out.println("Сравнение appleBox2 и orangeBox2: " + appleBox2.compare(orangeBox2));
    }
}
