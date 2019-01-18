/**
 * ByteShortInt
 */
public class ByteShortInt {

    public static void main(String[] args) {
        
        // int has a width of 32
        int myMinValue= -2147483648;
        int myMaxValue= 2147483647;
        int myTotal = (myMinValue/2);

        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue =(byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 100L;

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println("longTotal = " + longTotal);
    }
    
}