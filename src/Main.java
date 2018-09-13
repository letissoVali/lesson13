import goodBoy.GoodBoy;
import goodBoy.OnionSoup;
import goodBoy.Pizza;
import goodBoy.RiseWithChiken;

public class Main {

    public static void main(String[] args) {
        try {
            GoodBoy goodBoy = new GoodBoy();
            goodBoy.eat();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Спаааасииибооо Мама!!!");
        }
    }
}
