public class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("Data Type: byte    | Value: " + b + " | Size: " + Byte.SIZE + " bits");
        System.out.println("Data Type: short   | Value: " + s + " | Size: " + Short.SIZE + " bits");
        System.out.println("Data Type: int     | Value: " + i + " | Size: " + Integer.SIZE + " bits");
        System.out.println("Data Type: long    | Value: " + l + " | Size: " + Long.SIZE + " bits");
        System.out.println("Data Type: float   | Value: " + f + " | Size: " + Float.SIZE + " bits");
        System.out.println("Data Type: double  | Value: " + d + " | Size: " + Double.SIZE + " bits");
        System.out.println("Data Type: char    | Value: " + c + " | Size: " + Character.SIZE + " bits");
        System.out.println("Data Type: boolean | Value: " + bool + " | Size: JVM dependent");
    }
}
