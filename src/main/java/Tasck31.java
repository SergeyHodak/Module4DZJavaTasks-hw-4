/*
    Задание - Половина суммы четных чисел
Половина суммы четных чисел от 1 до n включительно на планете Фир называется фирским базисом.
    Задание
    Создай класс FirNumBasis, который наследуется от класса FirNum.
    Переопредели у этого класса метод calc() так, чтобы он возвращал фирский базис числа n включительно
согласно алгоритму, описанному в теории.

Примеры тестов
вызов new FirNumBasis().calc(9) возвращает 10
 */

class Tasck31 {
    public int test(FirNum31 firNum31, int number) {
        return firNum31.calc(number);
    }

    public static void main(String[] args) {
        FirNum31 firNum31 = new FirNumBasis31();
        Tasck31 firTest = new Tasck31();

        //Should be 20
        System.out.println(firTest.test(firNum31, 9));
    }
}

class FirNum31 {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum31 extends FirNum31 {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial31 extends FirNum31 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd31 extends FirNum31 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

class FirNumFizzBuzz31 extends FirNum31 {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            }
        }
        return result;
    }
}

class FirNumBasis31 extends FirNum31 {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 2 == 0) {result += i;}
        }
        return result/2;
    }
}