public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int replenishment = 2000;
        int result;

        if (replenishment >= 1000) {
            result = amount + replenishment + replenishment / 100;
        } else {
            result = amount + replenishment;
        }
        System.out.println(result);

    }
}
