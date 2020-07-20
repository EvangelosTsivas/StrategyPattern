
package tshirtstrategy.models;


/*
          2.5    4.5      5         7.5   8.2      9.3     22
Fabric, {WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK}

*/
public enum Fabric {
    WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK;
    
    public float getFabricPrice(int ordinal) {
        float result = 0;
        switch(ordinal) {
            case 0:
                result = 2.5f;
                break;
            case 1:
                result = 4.5f;
                break;
            case 2:
                result = 5.0f;
                break;
            case 3:
                result = 7.5f;
                break;
            case 4:
                result = 8.2f;
                break;
            case 5:
                result = 9.3f;
                break;
            case 6:
                result = 22.0f;
                break;
        }
                
        return result;
    }
}
