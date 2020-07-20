
package tshirtstrategy.strategy;

import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;


public class BankPaymentImpl implements IPayment {
    @Override
    public float pay(float basePrice, Color color, Size size, Fabric fabric) {
        return((basePrice + calculatePrice(color, size, fabric)) * 1.05f); 
    }
}
