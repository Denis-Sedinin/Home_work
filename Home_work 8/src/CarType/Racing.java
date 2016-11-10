package CarType;

import Implements.FlyingCar;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Racing extends Car {
    private String s = "Авто используеться для всех видов гонок" ;

    @Override
    public String getUse() {
        return s;
    }

}
