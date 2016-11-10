package CarType;

import CarType.ForRacing.Rally;
import CarType.ForRacing.Track;
import CarType.ForRacing.Trophy;
import CarType.ForTruck.Tractor;
import CarType.ForTruck.TractorForPassenger;
import CarType.ForTruck.TractorForRacing;
import CarType.ForTruck.TractorForTruck;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.getUse());
        System.out.println("------------------------");

        Tractor tr = new Tractor();
        System.out.println(tr.getUse() + ", " + tr.UseTruck());

        TractorForPassenger tfp = new TractorForPassenger();
        System.out.println(tfp.UseTruck());

        TractorForRacing tfr = new TractorForRacing();
        System.out.println(tfr.UseTruck());

        TractorForTruck tft = new TractorForTruck();
        System.out.println(tft.UseTruck());
        System.out.println("------------------------");

        Racing rc = new Racing();
        System.out.println(rc.getUse());

        Rally rl = new Rally();
        System.out.println(rl.getUse());

        Track tra = new Track();
        System.out.println(tra.getUse());

        Trophy tro = new Trophy();
        System.out.println(tro.getUse());
        System.out.println("------------------------");

        Passenger ps = new Passenger();
        System.out.println(ps.getUse());
        System.out.println("------------------------");

        Paver pv = new Paver();
        System.out.println(pv.getUse());
        pv.fly();
        pv.racer();
        System.out.println("------------------------");



    }
}
