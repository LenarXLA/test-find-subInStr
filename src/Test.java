public class Test {
    public static void main(String args[]) {
        System.out.println(some(" i will go Gondor him logo go joker not", "go"));
    }

    public static int some(String str, String sub) {

        int result = 0;
        int index = -1;

        while ((index = str.indexOf(sub, ++index)) > -1)
                result++;

        return result;
    }
}
