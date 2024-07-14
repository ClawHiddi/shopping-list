import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {

    System.out.println("Вас приветствует список покупок!");

    ArrayList<String> shoppingList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {

        System.out.println("Выберите одну из команд:");
        System.out.println("1. Добавить товар в список");
        System.out.println("2. Показать список");
        System.out.println("3. Очистить список");
        System.out.println("4. Завершить работу");

        int actionNumber = scanner.nextInt();

        if (actionNumber == 1) {

            System.out.println("Введите название товара:");
            String productName = scanner.next();
            boolean isDuplicateProduct = false;

            for (int i = 0; i < shoppingList.size(); i++) {
                if (productName.equals(shoppingList.get(i))) {
                    System.out.println("Данный товар уже присутствует в списке.");
                    isDuplicateProduct = true;
                    break;
                }
            }

            if (!isDuplicateProduct) {
                shoppingList.add(productName);
                System.out.println("Товар добавлен в список.");
            }

        } else if (actionNumber == 2) {

            if (shoppingList.isEmpty()) {
                System.out.println("Список покупок пуст. Пожалуйста, добавьте покупки.");
            } else {
                for (int i = 0; i < shoppingList.size(); i++) {
                    System.out.println("Под номером " + (i + 1) + " находится товар - " + shoppingList.get(i));
                }
            }

        } else if (actionNumber == 3) {

            if (shoppingList.isEmpty()) {
                System.out.println("Список покупок пуст. Очистка не требуется.");
            } else {
                shoppingList.clear();
                System.out.println("Список покупок очищен.");
            }

        } else if (actionNumber == 4) {

            System.out.println("До новых встреч!");
            break;

        } else {
            System.out.println("Извините, такой команды нет. Выберите значение от 1 до 4.");
        }
    }
}