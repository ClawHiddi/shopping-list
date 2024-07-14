import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                if (productCount > 7) {
                    System.out.println("Список полон! Пожалуйста, отложите покупку до следующего похода в магазин");
                } else {
                    System.out.println("Введите название товара:");
                    String productName = scanner.next();

                    for (int i = 0; i < shoppingList.length; i++) {
                        if (shoppingList[i] == null) {
                            shoppingList[i] = productName;
                            productCount++;
                            System.out.println("Товар " + productName + " добавлен в список");
                            break;
                        }
                    }
                }//код из первого блока
            } else if (actionNumber == 2) {
                if (productCount == 0) {
                    System.out.println("Список покупок пуст");
                } else {
                    for (int i = 0; i < shoppingList.length; i++) {
                        if (shoppingList[i] == null) {
                            break;
                        } else {
                            System.out.println("Под номером " + (i + 1) + " находится товар - " + shoppingList[i]);
                        }
                    }
                }//код из второго блока
            } else if (actionNumber == 3) {
                for (int i = 0; i < shoppingList.length; i++) {
                    shoppingList[i] = null;
                    productCount = 0;
                }
                System.out.println("Список покупок очищен");//код из третьего блока
            } else if (actionNumber == 4) {
                System.out.println("До новых встреч!");
                break;//код из четвёртого блока
            } else {
                System.out.println("Извините, такой команды нет. Введите значение от 1 до 4");//обработка неверной команды
            }
        }
    }
}