class Tasck08 {
    private int power;

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
        Tasck08 basicEngine = new Tasck08();
        System.out.println(basicEngine.getFuelType()); //A500

        //Tasck08 xFuelEngine = new XFuelEngine();
        //System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}

/*
    Напиши класс XFuelEngine, который унаследуется от класса Engine. Переопредели в классе XFuelEngine
    метод getFuelType(), чтобы тот возвращал строку "XFuel".
 */


//lass XFuelEngine extends Tasck08 {
//    @Override
//    public String getFuelType() {
//        return "XFuel";
//    }
//}