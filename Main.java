package HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Чипсы", 89));
        productList.add(new Drink("Пепси", 500, 100));
        Product water = new Drink("Вода", 500, 60);
        VendingMachine.initProducts(water, productList);
        productList.add(new HotDrink("Чай", 300, 90, 100));
        productList.add(new HotDrink("Кофе", 200, 90, 120));
        productList.add(new HotDrink("Капучино", 350, 80, 180));
        HotDrink latte = new HotDrink("Латте", 450, 80, 180);
        productList.add(latte);
        productList.add(HotDrinkVendingMachine.initDrinks("Эспрессо", 150, 100, 90));


        for (Product prod : productList) {
            System.out.println(prod);
        }
    }}


