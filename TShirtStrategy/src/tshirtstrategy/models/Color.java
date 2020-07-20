
package tshirtstrategy.models;


/*       .5     .10      .15     .20   .25    .30     .35
Color, {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
*/
public enum Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;
    
    public float getColorPrice(int ordinal) {
        float result = 0;
        switch(ordinal) {
            case 0:
                result = 0.5f;
                break;
            case 1:
                result = 0.10f;
                break;
            case 2:
                result = 0.15f;
                break;
            case 3:
                result = 0.20f;
                break;
            case 4:
                result = 0.25f;
                break;
            case 5:
                result = 0.30f;
                break;
            case 6:
                result = 0.35f;
                break;
        }
                
        return result;
    }
}
