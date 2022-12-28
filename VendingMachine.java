package HW1;
import java.util.List;

public class VendingMachine {


    public static List<Product> initProducts(Product item, List<Product> listProd) {
        listProd.add(item);
        return listProd;
    }
}


//    void restore(String name) {
//        System.out.println("Произведите оплату продукта " + name + "! (введите сумму)");
//    }
//}
