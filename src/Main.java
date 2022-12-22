public class Main {
    public static void main(String[] args) {
        //Задание 1
        Car newtaxi = new Car("Лада", "Ларгус", 2015, "РФ", "Белый", 180, 1.8, "Робот", "Универсал", "А412АА23", 5, true, 12);
        System.out.println(newtaxi.toString());
        System.out.println("Решение по шиномонтажу, надо ли переходить на зимнюю резину: " + newtaxi.setWinterTires(12));
        System.out.println("Регистрационный номер соответствует законодательству: " + newtaxi.checkLicensePlate());
        Car.Key firstCar = new Car.Key(true,true);
        Car.Insurance taxiIns = new Car.Insurance(76,3456,"выа") ;

        // Задание 2
        Bus newbus1 = new Bus("ЛИАЗ", "Ястреб", 1974, "СССР", "Белый", 80);
        Bus newbus2 = new Bus("ПАЗ", "Ворон", 2011, "Россия", "Синий", 95);
        Bus newbus3 = new Bus("MAN", "Freundlichkeit", 2017, "Германия", "Белый", 120);
        System.out.println(newbus1.toString());
        System.out.println(newbus2.toString());
        System.out.println(newbus3.toString());

    }
}