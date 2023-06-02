package main.part.com.selfstudy.javastudy.field;

public class GiftMain {
    public static void main(String[] args) {
        GiftSet gift03 = new GiftSet(12, 3, 3);
        int total = gift03.sum();

        gift03.print("참치선물세트 03호");

        SpecialGift sgift01 = new SpecialGift(6, 3, 2);
        sgift01.print("특별선물세트 01호");

    }
}
