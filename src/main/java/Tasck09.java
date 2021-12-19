class Tasck09 {
    private int power; // мощность двигателя

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine09 engine = new AdvancedXFuelEngine09();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

/*
Тебе нужно:
    добавить в класс XFuelEngine строковое поле serialNumber с модификатором доступа protected,
    и сделать для него публичный сеттер. Геттер делать не нужно
    создать новый класс AdvancedXFuelEngine, который унаследуется от класса XFuelEngine.
    В этом классе создать метод printInfo(), который будет выводить в консоль серийный номер и
    мощность двигателя в формате "Serial number is <SERIAL NUMBER>, power is <POWER>".
 */

class XFuelEngine09 extends Tasck09 {
    protected String serialNumber; //Серийный номер

    @Override
    public String getFuelType() {
        return "XFuel";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}

class AdvancedXFuelEngine09 extends XFuelEngine09 {
    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + getPower());
    }
}