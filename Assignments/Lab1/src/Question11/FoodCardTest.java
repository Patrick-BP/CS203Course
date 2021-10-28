package Question11;

import Question10.myutil.MealCard;

public class FoodCardTest {
    public static void main(String[] args) {
        MealCard card1 = new MealCard();
        System.out.println(card1);

        MealCard card2 = new MealCard("chadia",200);
        System.out.println(card2);
        card2.foodPuchase(20);
        System.out.println(card2);

        MealCard card3 = new MealCard("Ronald",60);
        System.out.println(card3);
        card3.foodPuchase(5);
        System.out.println(card3);

    }
}
