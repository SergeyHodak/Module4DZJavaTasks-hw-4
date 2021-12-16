/*
    Создай класс с именем SpaceUtils.
В этом классе создай следующие константы и сразу проинициализируй их значениями:

    PLANET_COUNT типа int со значением 8;
    HOME_PLANET_NAME типа String со значением "Earth";
    HOME_STAR_NAME типа String со значением "Sun"

Также создай в этом классе публичные статические методы:

    String pluralPlanets(int planetCount). Параметр planetCount может быть от 1 и больше.
        Если параметр planetCount равен 1, то возвращается строка "1 planet".
        Если же параметр planetCount больше 1, то возвращаем строку "X planets",
        где вместо X - значение planetCount.
    String generateStartMessage(String shipName, String time). Возвращает строку вида
        "Ship <shipName> start at <time>". Вместо <ship> и <time> подставляются значения переменных shipName и time.
 */
class Tasck18 {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount) {
        if (planetCount >= 1) {
            if (planetCount == 1) {return "1 planet";}
            return planetCount + " planets";
        }
        return "передан не верный параметр, он должен быть равным 1 или больше";
    }

    public static String generateStartMessage(String shipName, String time) {
        return "Ship " + shipName + " start at " + time;
    }

    public static void main(String[] args) {
        System.out.println(new Tasck18().PLANET_COUNT); //8
        System.out.println(new Tasck18().pluralPlanets(1)); //1 planet;
        System.out.println(new Tasck18().pluralPlanets(5)); //5 planets;
        System.out.println(new Tasck18().generateStartMessage("Earthkeeper", "20:40")); //Ship Earthkeeper start at 20:40.
    }
}