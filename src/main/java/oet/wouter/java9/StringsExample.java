package oet.wouter.java9;

import java.lang.reflect.Field;

public class StringsExample {

    public static void main(String[] args) throws Exception {
        String a = "abcdefghijk"; // 11 characters
        String b = "这些字符需要每个16位"; // 11 characters

        printSizeOf(a); // This will save about 50 percent of my memory of String's
        printSizeOf(b);
    }

    private static void printSizeOf(String string) throws Exception {
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        byte[] bytes = (byte[]) value.get(string);
        System.out.println(bytes.length);
    }
}
