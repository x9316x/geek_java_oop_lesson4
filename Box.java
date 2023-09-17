package geek_java_oop_lesson4;

import java.util.ArrayList;

/**
 * Представляет собой коробку, которая может содержать фрукты типа T.
 * @param <T> Тип фрукта, который эта коробка может содержать. Должен наследоваться от Fruct.
 */
public class Box<T extends Fruct> {

    // Список для хранения фруктов в коробке.
    private ArrayList<T> fructs;

    /**
     * Вычисляет и возвращает общий вес фруктов в коробке.
     * @return Общий вес фруктов.
     */
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruct : fructs) {
            totalWeight += fruct.getWeight();
        }
        return totalWeight;
    }

    /**
     * Сравнивает вес этой коробки с другой коробкой.
     * @param anotherBox Коробка для сравнения.
     * @return true, если веса приблизительно равны, иначе false.
     */
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    /**
     * Перемещает фрукты из этой коробки в другую коробку.
     * @param anotherBox Коробка для перемещения фруктов.
     */
    public void transferFruits(Box<T> anotherBox) {
        if (this.fructs != null && anotherBox.fructs != null) {
            anotherBox.fructs.addAll(this.fructs);
            this.fructs.clear();
        }
    }

    /**
     * Добавляет фрукт в коробку.
     * @param fruct Фрукт для добавления.
     */
    public void addFruit(T fruct) {
        if (this.fructs == null) {
            this.fructs = new ArrayList<>();
        }
        this.fructs.add(fruct);
    }
}

