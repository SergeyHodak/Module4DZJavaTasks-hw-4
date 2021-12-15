public class Tasck02 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //Test output
    public static void main(String[] args) {
        Tasck02 ship = new Tasck02();
        System.out.println(ship.getName()); //Should be null
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
    }
}
// Сделай поле name приватным. Напиши геттер и сеттер для этого поля в соответствии с Java Code Conventions.
// Убери инициализацию поля name значением "Voyager".