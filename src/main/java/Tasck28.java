/*
    Задание - посчитать факториал числа
Напомним, что факториал числа N - это произведение всех чисел от 1 до N включительно. Например, факториал числа 5 - 120.
Факториал числа 0 - 1.
    Задание
Создай класс FirNumFactorial, который наследуется от класса FirNum.
Переопредели у этого класса метод calc() так, чтобы он возвращал факториал n.

Примеры тестов
вызов new FirNumFactorial().calc(4) возвращает 24
вызов new FirNumFactorial().calc(0) возвращает 1
 */

class Tasck28 {
    public int test(FirNum28 firNum28, int number) {
        return firNum28.calc(number);
    }

    public static void main(String[] args) {
        FirNum28 firNum28 = new FirNumFactorial28();
        Tasck28 firTest28 = new Tasck28();

        //Should be 120
        System.out.println(firTest28.test(firNum28, 5));
    }
}

class FirNum28 {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum28 extends FirNum28 {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial28 extends FirNum28 {
    @Override
    public int calc(int n) {
        int result = 1;
        int shag = 1;
        if (n == 0) {return 1;}
        for(;;) {
            if (shag <= n) {
                result *= shag;
                shag++;
            } else {
                return result;
            }
        }
    }
}