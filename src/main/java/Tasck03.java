public class Tasck03 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Допиши метод setName() так, чтобы:
        // если передать пустую строку (включая строку из одних пробелов и нечитаемых символов),
        // то полю name не будет присвоено эта пустая строка;
        // если передать строку длиной больше 100 символов, то полю name аналогично не будет
        // присвоена эта слишком длинная строка.
        String a = name.trim();
        if (!(a.length() > 100)) {
            if (a.length() > 0) {
                this.name = name;
            }
        }

    }


    //Test output
    public static void main(String[] args) {
        Tasck03 ship = new Tasck03();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored
    }
}