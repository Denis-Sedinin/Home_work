package CarType.ForTruck;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class TractorForPassenger extends Tractor {

    private String UseTractor;
    @Override
    public String UseTruck() {
        UseTractor = "Перевозит только пассажирские авто";
        return UseTractor;
    }
}
