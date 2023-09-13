import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("0.3");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);

        BigDecimal one = BigDecimal.valueOf(0.5);
        BigDecimal two = BigDecimal.valueOf(.2); //----> instead of double we can use valueof 


       


        
    }
}