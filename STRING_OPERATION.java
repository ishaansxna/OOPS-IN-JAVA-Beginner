public class STRING_OPERATION {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Are strings equal? " + str1.equals(str2));
        System.out.println("Reversed string: " + new StringBuilder(str1).reverse());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
    }
}