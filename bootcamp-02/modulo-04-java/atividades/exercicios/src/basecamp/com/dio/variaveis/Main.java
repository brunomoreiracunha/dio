package basecamp.com.dio.variaveis;

public class Main {

    public static void main(String[] args) {

        int int1 = 1;
        int int2 = 2;
        
        short short1 = 23;
        short short2 = 12;
        
        long long1 = 2122L;
        long long2 = 5122L;
        
        float float1 = 1.5f;
        float float2 = 2.5f;
        
        double double1 = 4.5d;
        double double2 = 2.6d;
        
        boolean boolean1 = true;
        boolean boolean2 = false;
        
        byte byte1 = 11;
        byte byte2 = 22;

        char char1 = 'a';
        char char2 = 'b';

        String str1 = "Bruno";
        String str2 = "Cunha";

        System.out.println("Int1 == Int2 - " + (int1 == int2));
        System.out.println("Int1 != Int2 - " + (int1 != int2));
        System.out.println("Int1 <= Int2 - " + (int1 <= int2));
        System.out.println("Int1 >= Int2 - " + (int1 >= int2));
        
        System.out.println("Short1 == Short2 - " + (short1 == short2));
        System.out.println("Short1 != Short2 - " + (short1 != short2));
        System.out.println("Short1 <= Short2 - " + (short1 <= short2));
        System.out.println("Short1 >= Short2 - " + (short1 >= short2));
        
        System.out.println("Long1 == Long2 - " + (long1 == long2));
        System.out.println("Long1 != Long2 - " + (long1 != long2));
        System.out.println("Long1 >= Long2 - " + (long1 >= long2));
        System.out.println("Long1 <= Long2 - " + (long1 <= long2));
        
        System.out.println("Float1 == Float2 - " + (float1 == float2));
        System.out.println("Float1 != Float2 - " + (float1 != float2));
        System.out.println("Float1 >= Float2 - " + (float1 >= float2));
        System.out.println("Float1 <= Float2 - " + (float1 <= float2));
        
        
        System.out.println("Double1 == Double2 - " + (double1 == double2));
        System.out.println("Double1 != Double2 - " + (double1 != double2));
        System.out.println("Double1 >= Double2 - " + (double1 >= double2));
        System.out.println("Double1 <= Double2 - " + (double1 <= double2));
        
        System.out.println("Byte1 == Byte2 - " + (byte1 == byte2));
        System.out.println("Byte1 != Byte2 - " + (byte1 != byte2));
        System.out.println("Byte1 >= Byte2 - " + (byte1 >= byte2));
        System.out.println("Byte1 <= Byte2 - " + (byte1 <= byte2));

        System.out.println("Boolean1 == Boolean2 - " + (boolean1 == boolean2));
        System.out.println("Boolean1 != Boolean2 - " + (boolean1 != boolean2));
        System.out.println("Boolean não utiliza marcadores de >, <, <=, >=");
        
        System.out.println("Char1 == Char2 - " + (char1 == char2));
        System.out.println("Char1 != Char2 - " + (char1 != char2));
        System.out.println("Char1 >= Char2 - " + (char1 >= char2));
        System.out.println("Char1 <= Char2 - " + (char1 <= char2));
        
        System.out.println("String1 == String2 - " + (str1 == str2));
        System.out.println("String1 != String2 - " + (str1 != str2));
        System.out.println("String não utiliza marcadores de >, <, <=, >=");
        
        System.out.println("Int1 == Char1 - " + (int1 == char1));
        System.out.println("Int1 != Char1 - " + (int1 != char1));
        System.out.println("Int1 <= Char1 - " + (int1 <= char1));
        System.out.println("Int1 >= Char1 - " + (int1 >= char1));

        System.out.println("Double1 == Char1 - " + (double1 == char1));
        System.out.println("Double1 != Char1 - " + (double1 != char1));
        System.out.println("Double1 <= Char1 - " + (double1 <= char1));
        System.out.println("Double1 >= Char1 - " + (double1 >= char1));
        
        System.out.println("Float1 == Char1 - " + (float1 == char1));
        System.out.println("Float1 !== Char1 - " + (float1 != char1));
        System.out.println("Float1 <= Char1 - " + (float1 <= char1));
        System.out.println("Float1 >= Char1 - " + (float1 >= char1));

    }
}
