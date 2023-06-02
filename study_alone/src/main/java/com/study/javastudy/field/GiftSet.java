package main.part.com.selfstudy.javastudy.field;

public class GiftSet {
    int normal;
    int vegetable;
    int pepper;

    GiftSet(int normal, int vegetable, int pepper) {
        this.normal = normal;
        this.vegetable = vegetable;
        this.pepper = pepper;
    }

    int sum() {
        int totalCount;
        totalCount = this.normal + this.vegetable + this.pepper;
        return totalCount;
    }

    void print(String giftName) {
        System.out.println("** " + giftName + " 내용물 **");
        System.out.println("normal:" + this.normal);
        System.out.println("vegetable:" + this.vegetable);
        System.out.println("pepper:" + this.pepper);
    }
}
