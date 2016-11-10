package CarType;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Truck extends Car {
    private String s = "Авто используеться для перевозки грузов или авто" ;

    @Override
    public String getUse() {
        return s;
    }
}
