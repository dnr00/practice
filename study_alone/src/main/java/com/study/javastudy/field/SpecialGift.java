package main.part.com.selfstudy.javastudy.field;

// override 예제
public class SpecialGift extends GiftSet{
    int ham;
    int oil;

    SpecialGift(int normal, int ham, int oil){
        super(normal, 0, 0);
        this.ham = ham;
        this.oil = oil;
    }

    void print(String giftName) {
        super.print(giftName);
        System.out.println("ham:" + ham);
        System.out.println("oil:" + oil);
    }
}
