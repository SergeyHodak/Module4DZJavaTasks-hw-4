/*
    Напиши метод printInfo(). Он выводит в консоль название и серийный номер корабля в формате
    "Name is <NAME>, serial number is <SERIAL NUMBER>".
    Например, если имя корабля "Voyager" и серийный номер "SN504030", то метод printInfo() должен
    вывести в консоль строку "Name is Voyager, serial number is SN504030".
 */

public class Tasck05 {
    private String name;
    private String serialNumber;

    public void printInfo() {
        String result = "Name is " + this.name + ", serial number is " + this.serialNumber;
        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
    }

    //Test output
    public static void main(String[] args) {
        Tasck05 ship = new Tasck05();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}