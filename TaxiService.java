import java.util.ArrayList;
import java.util.Random;
class TaxiService {
    private ArrayList<Car> cars;

    public TaxiService() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void performMaintenance() {
        // Зміна потужності автомобілів на 10%
        for (int i = 0; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            int newEnginePower = (int) (car.getEnginePower() * 1.1);
            car.setEnginePower(newEnginePower);
        }
    }
    public void increasePowerAndPrice() {
        // Зміна потужності двигуна та ціни для кожної другої машини
        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            int newEnginePower = (int) (car.getEnginePower() * 1.1);
            double newPrice = car.getPrice() * 1.05;
            car.setEnginePower(newEnginePower);
            car.setPrice(newPrice);
        }
    }
    public void checkDriverExperience() {
        // Перевірка досвіду водіїв та збільшення досвіду на 1 рік, якщо необхідно
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.increaseDrivingExperience();
            }
        }
    }
    public Car getRandomCar() {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }
}