
package tshirtstrategy.strategy;

import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;


public interface IPayment {
    float pay(float basePrice, Color color, Size size, Fabric fabric);
    default float calculatePrice(Color color, Size size, Fabric fabric) { 
        float result = 0;
        result += color.getColorPrice(color.ordinal());
        result += size.getSizePrice(size.ordinal());
        result += fabric.getFabricPrice(fabric.ordinal());
        return result;
    };
    
}
