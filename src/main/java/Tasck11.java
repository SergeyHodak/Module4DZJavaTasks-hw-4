/*
Программист, который писал код раньше, сделал класс Passenger, и сделал два метода:

String getType() - возвращает тип пассажира (обычный, VIP, или какой-то другой)
int getTicketPrice() - возвращает цену билета

Текущий дизайн программы позволяет создавать объекты типа Passenger. Это ошибка дизайна. Исправь ее, и сделай оба метода абстрактными.

Сделай методы getType() и getTicketPrice() абстрактными.
 */
abstract class Tasck11 {
    public abstract String getType();
    public abstract int getTicketPrice();
}