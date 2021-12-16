/*
    Создай класс Planets. В этом классе создай следующие константы типа String и задай им следующие значения:

MERCURY со значением "Mercury"
VENUS со значением "Venus"
EARTH со значением "Earth"
MARS со значением "Mars"
JUPITER со значением "Jupiter"
SATURN со значением "Saturn"
URANUS со значением "Uranus"
NEPTUNE со значением "Neptune"
Поскольку это константы, каждая из них должна быть:

публичной
статической
финальной
*/

public class Tasck16 {
    public static final String MERCURY = "Mercury";
    public static final String VENUS = "Venus";
    public static final String EARTH = "Earth";
    public static final String MARS = "Mars";
    public static final String JUPITER = "Jupiter";
    public static final String SATURN = "Saturn";
    public static final String URANUS = "Uranus";
    public static final String NEPTUNE = "Neptune";

    public static void main(String[] args) {
        Tasck16 test = new Tasck16();
        System.out.println(test.MERCURY); //Mercury
        System.out.println(test.VENUS); //Venus
        System.out.println(test.EARTH); //Earth
        System.out.println(test.MARS); //Mars
        System.out.println(test.JUPITER); //Jupiter
        System.out.println(test.SATURN); //Saturn
        System.out.println(test.URANUS); //Uranus
        System.out.println(test.NEPTUNE); //Neptune
    }
}
