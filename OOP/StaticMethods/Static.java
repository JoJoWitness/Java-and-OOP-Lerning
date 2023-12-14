package OOP.StaticMethods;

public class Static {
    private static String pet = "Ryuk is the best.";

    public static int add(int n1, int n2){
        return (n1 + n2);
    }

    public static void main(String[] args) {
        System.out.println(Static.pet);
        System.out.println(Static.add(2, 4));
    }

}
