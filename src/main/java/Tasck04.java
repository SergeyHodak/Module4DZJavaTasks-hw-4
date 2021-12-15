/*
    Создай приватное поле serialNumber строкового типа. Сделай геттер и сеттер для этого поля.
Учти, что структура серийного кода следующая - две буквы SN, и шесть любых символов после букв (всего 8 символов, например SNAX65G8).
Напиши сеттер так, чтобы если кто-то пытается установить неправильный серийный номер, то эта попытка игнорировалась бы.
 */

public class Tasck04 {
    private String name;
    private String serialNumber;

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
        if (serialNumber.length() == 8){
            if (serialNumber.substring(0, 2).equals("SN") & serialNumber.substring(2, 8).matches(  "[0-9]+")) {
                this.serialNumber = serialNumber;
            }
        }
    }

    //Test output
    public static void main(String[] args) {
        Tasck04 ship = new Tasck04();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }

}