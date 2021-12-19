/*
    Задание - FizzBuzz
Одна из наиболее популярных задач, которые просят написать на собеседовании Java-программистов - это задача FizzBuzz.
Одна из модификаций этой задачи - посчитать сумму чисел от 1 до n включительно, но суммировать лишь такие числа,
которые делятся либо на 3, либо на 5, но не на 3 и 5 одновременно.
Например, если взять число 20, то можно выделить такие подходящие числа:
3, 5, 6, 9, 10, 12, 18, 20
И если посчитать сумму эти чисел, то получим 83.
    Задание
Создай класс FirNumFizzBuzz, который наследуется от класса FirNum.
Переопредели у этого класса метод calc() так, чтобы он возвращал сумму чисел
от 1 до n включительно согласно алгоритма FizzBuzz.

Примеры тестов
вызов new FirNumFizzBuzz().calc(20) возвращает 83
 */

class Tasck30 {
    public int test(FirNum30 firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum30 firNum30 = new FirNumFizzBuzz30();
        Tasck30 firTest30 = new Tasck30();

        //Should be 83
        System.out.println(firTest30.test(firNum30, 20));
    }
}

class FirNum30 {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum30 extends FirNum30 {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial30 extends FirNum30 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd30 extends FirNum30 {
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

class FirNumFizzBuzz30 extends FirNum30 {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if (i%3 == 0 & i%5 == 0) {
            } else if (i%3 == 0) {
                result += i;
            } else if (i%5 == 0) {
                result += i;
            }
        }
        return result;
    }
}