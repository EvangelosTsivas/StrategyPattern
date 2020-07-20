package tshirtstrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;
import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.BankPaymentImpl;
import tshirtstrategy.strategy.CardPaymentImpl;
import tshirtstrategy.strategy.CashPaymentImpl;
import tshirtstrategy.strategy.IPayment;

public class Catalog {

    public Catalog() {
        printList();
    }

    
    
    public static List<TShirt> allTshirts() {
        List<TShirt> tShirts = new ArrayList();
        // Color
        for (int i = 0; i < 7; i++) {
            Color color = Color.values()[i];
            // Size
            for (int j = 0; j < 7; j++) {
                Size size = Size.values()[j];
                // Fabric
                for (int k = 0; k < 7; k++) {
                    Fabric fabric = Fabric.values()[k];
                    tShirts.add(new TShirt(getRandomName(), color, size, fabric, getRandomNumberInRange(0, 20)));
                }
            }
        }
        return tShirts;
    }

    public static HashMap<String, Float> generateTShirtsAndStategies(TShirt tshirt) {
        List<IPayment> payments = Arrays.asList(new IPayment[]{new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()});
        HashMap<String, Float> allPayments = new HashMap<>();
        Context contextAll = new Context(payments);
        allPayments = contextAll.executePayments(tshirt.getPrice(),
                tshirt.getColor(), tshirt.getSize(), tshirt.getFabric());
        return (allPayments);
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String getRandomName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (generatedString);
    }
    
    public static void printList(){
        allTshirts().forEach(action -> {
            System.out.println(action.toString());
            generateTShirtsAndStategies(action).entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " Price: " + entry.getValue());
            });
        });
    }

}
