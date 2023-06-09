public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        taxiService.addCar(new Car("Toyota", 100, new Driver("Василь", 20, 2), 5000, 2002));
        taxiService.addCar(new Car("Honda", 120, new Driver("Дядя Боря", 21, 7), 6000, 2004));
        taxiService.addCar(new Car("BMW", 150, new Driver("Антон", 22, 5), 8000, 2007));
        taxiService.addCar(new Car("BMW", 160, new Driver("Влад", 23, 6), 6500, 2012));
        taxiService.addCar(new Car("Divo-Lanos", 170, new Driver("Міша", 24, 7), 7200, 2010));
        taxiService.addCar(new Car("VW", 180, new Driver("Арсенчік", 25, 9), 12000, 2013));
        taxiService.addCar(new Car("Mercedes", 190, new Driver("Микола", 26, 8), 9000, 2014));
        taxiService.addCar(new Car("Mazda", 185, new Driver("Андрій", 19, 2), 12500, 2013));
        taxiService.addCar(new Car("Fiat", 175, new Driver("Олег", 27, 7), 4000, 2012));
        taxiService.addCar(new Car("Ford", 165, new Driver("Ярослав", 35, 15), 7850, 2011));
        taxiService.performMaintenance(); // Виконання ремонту та зміна потужності автомобілів
        taxiService.increasePowerAndPrice(); // Збільшення потужності та ціни для кожної другої машини
        taxiService.checkDriverExperience(); // Перевірка та збільшення досвіду водіїв
        Car randomCar = taxiService.getRandomCar();
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " +
                randomCar.getDriver().getName() + " виїхав за вами.");
        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }
}