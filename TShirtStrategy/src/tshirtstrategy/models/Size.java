
package tshirtstrategy.models;

/*

       .22 .23 .25 .30 .35 .45   .60  
Size, {XS, S,   M, L,  XL, XXL, XXXL}


*/

public enum Size {
    XS, S, M, L, XL, XXL, XXXL;
    
    public float getSizePrice(int ordinal) {
        float result = 0;
        switch(ordinal) {
            case 0:
                result = 0.22f;
                break;
            case 1:
                result = 0.23f;
                break;
            case 2:
                result = 0.25f;
                break;
            case 3:
                result = 0.30f;
                break;
            case 4:
                result = 0.35f;
                break;
            case 5:
                result = 0.40f;
                break;
            case 6:
                result = 0.60f;
                break;
        }
                
        return result;
    }
}
