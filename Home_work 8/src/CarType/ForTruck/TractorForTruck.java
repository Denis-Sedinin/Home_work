package CarType.ForTruck;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class TractorForTruck extends Tractor {

    private String UseTractor;
    @Override

    public String UseTruck() {
        UseTractor = "Перевозит только грузовики";
        return UseTractor;
    }
}
