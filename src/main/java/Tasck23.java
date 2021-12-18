/*
    Задание - дописать toString() для ракетной установки
    Уже есть написанный класс RocketLauncher - ракетная установка. В этом классе есть поле size
(размер ракет в этой установке), и поле rocketCount - количество ракет.
    Но если мы попытаемся сейчас вывести объект этого класса в консоль, используя System.out.println(),
то получим непонятную строку. Дело в том, что по умолчанию выводится хеш объекта, а это обычно не то что нам нужно.

    Переопредели метод toString(), чтобы при выводе объекта класса RocketLauncher в консоль выводилась строка вида
"Size is <size>, rocket count is <rocketCount>". Вместо <size> подставь значение поля size, вместо
<rocketCount> - значение поля rocketCount.
 */

class Tasck23 {
    private String size;
    private int rocketCount;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public static void main(String[] args) {
        Tasck23 launcher = new Tasck23();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        //Should be - Size is big, rocket count is 50
        System.out.println(launcher);
    }

    @Override
    public String toString() {}
}