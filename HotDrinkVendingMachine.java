package HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinkVendingMachine extends VendingMachine{
    private List<HotDrink> hotDrinks;


    public static HotDrink initDrinks(String name, double volume, int temperature, int price) {
        HotDrink product = new HotDrink(name, volume, temperature, price);
        return product;
    }

    public HotDrink getProduct (String name) {
        HotDrink productForSale = new HotDrink (name, 0, 0, 0);
        return productForSale;
    }


    public HotDrink getProduct (String name, double volume, int temperature, List<HotDrink> productList){
        HotDrink hotDrinksSale = new HotDrink(name, 0, 0, 0);
        for (HotDrink i : productList) {
            if (i.getName().equals(name) && i.getVolume()==volume && (i.getTemperature()-temperature <=10
                    && i.getTemperature()-temperature >=-10)) {
                //System.out.println(i);
                hotDrinksSale = i;
            }
        }
        return hotDrinksSale;
    }


//    @Override
//    void restore (String name) {
//        System.out.println("Оплатите " + name + "! (введите сумму)");
//    }
//
//    void resultPay (String name) {
//        System.out.println("Ваш " + name + " готов!");
//    }


}
