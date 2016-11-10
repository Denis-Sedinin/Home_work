package CarType.ForTruck;

import CarType.Truck;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Tractor extends Truck {

    private String UseTruck;

    public Tractor (){
        UseTruck = "Перевозит все авто";
    }
    public String UseTruck (){
        return UseTruck;
    }
}
