import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        // BigDecimal bigDecimal1 = new BigDecimal("0.3");
        // BigDecimal bigDecimal2 = new BigDecimal("0.2");

        // BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        // System.out.println(subtract);

        // BigDecimal one = BigDecimal.valueOf(0.5);
        // BigDecimal two = BigDecimal.valueOf(.2); //----> instead of double we can use valueof 

        List<CartItem> cartItems = new ArrayList<>();
        cartItems.add(new CartItem("Mouse", 5, new BigDecimal("500")));
        cartItems.add(new CartItem("KeyBoard", 2, new BigDecimal("900")));
        cartItems.add(new CartItem("Monitors", 3, new BigDecimal("6500")));

       String Line = "+"+"-".repeat(10)+"+"+"-".repeat(5)+"+"+"-".repeat(10)+"+"+"-".repeat(15)+"+";

       System.out.println(Line);
       System.out.printf("|%-10s|%-5s|%10s|%-15s|\n","Name","Qty:","Unit Price","Total");
       System.out.println(Line);
        BigDecimal netTotal = BigDecimal.ZERO;
       for(CartItem cartItem : cartItems){
        BigDecimal total= new BigDecimal(cartItem.qty).multiply(cartItem.unitPrice);
        System.out.printf("|%-10s|%-5s|%-10s|Rs-%-12s|\n",cartItem.name1,cartItem.qty,cartItem.unitPrice,total);

        netTotal = netTotal.add(total);
       }

       System.out.println(Line);

        


        
    }
}

class CartItem{
     String name1;
    int qty;
    BigDecimal unitPrice;

    public CartItem(String name1, int qty, BigDecimal unitPrice){
        this.name1 = name1;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}