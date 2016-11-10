package CarType;

import Implements.FlyingCar;

/**
 * Created by Denis Sedinin on 10.11.2016.
 */
public class Paver extends Car implements FlyingCar {
    private String s = "Кто-то же должен укладывать асфальт? И это я!";

    @Override
    public String getUse() {
        return s;
    }

    @Override
    public void fly() {
        System.out.println("Ура! Я могу летать");

    }

    @Override
    public void racer() {
        System.out.println("Еще я гонщик");
    }
}
