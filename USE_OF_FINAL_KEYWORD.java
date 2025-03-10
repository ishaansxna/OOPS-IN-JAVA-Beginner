final class FinalClass {
    final int finalDataMember = 10;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

public class USE_OF_FINAL_KEYWORD {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final Data Member: " + obj.finalDataMember);
        obj.finalMethod();
    }
}