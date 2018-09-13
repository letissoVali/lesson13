package goodBoy;

public class GoodBoy {
    //todo Написать программу "воспитанный ребенок". Создать один или несколько классов "еда". Создать класс "ребенок" с методом "кушать".
    // Если еда и ребенок не совместимы (совместимость проверяется ребенком), то выбрасывается эксепшн (обрабатывается в методе main мамой).
    // Однако в любом случае ребенок должен сказать «спасибо» и поцеловать маму. В данном случае "спасибо" можно вывести в консоль.

    private boolean compatibility;

    public void setCompatibility(boolean compatibility) {
        this.compatibility = compatibility;
    }

    public void eat() throws RuntimeException{
        Pizza pizza = new Pizza();
        OnionSoup soup = new OnionSoup();
        RiseWithChiken riseWithChiken = new RiseWithChiken();
        pizza.setLooksAppetizing(true);
        soup.setLooksAppetizing(false);
        riseWithChiken.setLooksAppetizing(false);

        compatibility = soup.isLooksAppetizing();

            if(compatibility) {
                System.out.print("Ммм какая вкуснятина!!! ");
            } else {
                System.out.print("Я не буду это кушать!!!  ");
                throw new RuntimeException();
            }
    }
}
