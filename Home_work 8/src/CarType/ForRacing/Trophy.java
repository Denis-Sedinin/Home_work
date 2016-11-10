package CarType.ForRacing;
import CarType.Racing;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Trophy extends Racing {
    private  String s = "Авто используется для трофи";

    @Override
    public String getUse() {
        return s;
    }
}
