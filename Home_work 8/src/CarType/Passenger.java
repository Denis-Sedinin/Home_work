package CarType;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Passenger extends Car {
    private String s = "Перевозит пассажиров" ;

    @Override
    public String getUse() {
        return s;
    }

}
