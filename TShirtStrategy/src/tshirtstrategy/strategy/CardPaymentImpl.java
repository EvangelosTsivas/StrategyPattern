
package tshirtstrategy.strategy;

import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;


public class CardPaymentImpl implements IPayment {
    @Override
    public float pay(float basePrice, Color color, Size size, Fabric fabric) {
        return((basePrice + calculatePrice(color, size, fabric)) * 1.1f); 
    }
}
