/*
Напиши класс Tanker, у которого есть:
    приватное поле serialNumber строкового типа, геттер и сеттер для этого поля;
    метод protected String getFuelType(), который возвращает строку "A500" - базовый вид топлива;
    метод public void refuel(int amount). Он принимает целое число - количество топлива, которое заправляем,
    и печатает строку вида - "Add <AMOUNT> of <FUEL TYPE>, tanker serial number is <SERIAL NUMBER>".
    Вместо <AMOUNT> подставь значение параметра amount, вместо <FUEL TYPE> - значение getFuelType(),
    вместо <SERIAL NUMBER> - значение поля serialNumber.

    Напиши класс XFuelTanker, у которого переопредели метод getFuelType(). Этот метод должен возвращать строку "XFuel".

    Напиши класс MX200Tanker, у которого переопредели метод getFuelType(). Этот метод должен возвращать строку "MX200".
 */

class Tasck10 {
    private String serialNumber;  // серийный номер

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getFuelType() {
        return "A500"; // базовый вид топлива = A500
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + serialNumber);
    }
}

class XFuelTanker extends Tasck10 {
    @Override
    public String getFuelType() {
        return "XFuel"; // вид топлива = XFuel
    }
}

class MX200Tanker extends Tasck10 {
    @Override
    public String getFuelType() {
        return "MX200"; // вид топлива = MX200
    }

    public static void main(String[] args) {
        Tasck10 tanker = new Tasck10();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300); // Add 300 of A500, tanker serial number is SN504030

        Tasck10 tanker1 = new XFuelTanker();
        tanker1.setSerialNumber("SN504030");
        tanker1.refuel(300); // Add 300 of XFuel, tanker serial number is SN504030

        Tasck10 tanker2 = new MX200Tanker();
        tanker2.setSerialNumber("SN504030");
        tanker2.refuel(300); // Add 300 of MX200, tanker serial number is SN504030
    }
}