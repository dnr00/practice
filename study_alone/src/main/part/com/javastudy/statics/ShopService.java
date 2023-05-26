package main.part.com.javastudy.statics;

public class ShopService { // 6-5 예제

    private static ShopService shopService = new ShopService();

    private ShopService() {
    }

    static ShopService getInstance() {
        return shopService;
    }
}
