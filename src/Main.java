
public class Main {
    public static void main(String[] args) {
        /**
         * Rectangle деген класс түзүнүз.
         * Поляларын түзүнүз.
         * Объектисин түзүнүз.
         * Поялларына маанини геттер жана сеттер менен бериңиз.
         * Маанини бергенден кийин ошол тик бурчтуктун аянтын табыныз.
         * Aянтын табуу үчүн атайын метод түзүнүз, ал метод ошол тик бурчтуктун аянтын
         * кайтарышы керек.
         */


        Rectangle rectangle= new Rectangle();

        rectangle.setA(3);
        rectangle.setB(7);

        System.out.println(rectangle.getA());
        System.out.println(rectangle.getB());

        rectangle.getArea(rectangle.getA(),rectangle.getB());



    }
}