package basics;

public class ByteOverflow {

    public static void main(String[] args) {

        final byte b1 = 10;
        final byte b2 = 30;

        byte b3 = (byte)(b1 + b2);

        System.out.println(b3);

        byte c1 = -128;

        c1--;

        System.out.println(c1);

        // After -128 it loops back to 127
    }
}
