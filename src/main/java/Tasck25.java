/*
    Задача - моделируем космос
Тебе нужно написать иерархию классов, которой можно будет представить небесные тела. И написать класс,
который сможет определить - является ли переданное небесное тело планетой.
    Задание
    Создай абстрактный класс SpaceObject.
    Создай абстрактный класс Planet, который унаследуется от SpaceObject.
    Создай класс Mars, который унаследуется от Planet.
    Создай класс Moon, который унаследуется от SpaceObject.
    Создай класс PlanetTester. У этого класса должен быть метод String test(SpaceObject object),
который принимает небесное тело, и возвращает "planet", если переданное тело является планетой
(в иерархии классов объекта есть класс Planet). В противном случае метод возвращает "not planet".

Примеры тестов
Выполнение кода

PlanetTester tester = new PlanetTester();
System.out.println(tester.test(new Mars())); //Should be true
System.out.println(tester.test(new Moon())); //Should be false
выводит в консоль

true
false
 */
abstract class Tasck25 { //абстрактный класс SpaceObject

}

abstract class Planet25 extends Tasck25 {

}

class Mars25 extends Planet25 {

}

class Moon25 extends Tasck25 {

}

class PlanetTester25 {
    String test(Tasck25 object) {
        return (object instanceof Planet25) ? "planet" : "not planet";
    }

    public static void main(String[] args) {
        PlanetTester25 tester25 = new PlanetTester25();
        System.out.println(tester25.test(new Mars25())); //Should be true
        System.out.println(tester25.test(new Moon25())); //Should be false
    }
}