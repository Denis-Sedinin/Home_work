package CarType.ForRacing;
import CarType.Racing;

/**
 * Created by Denis Sedinin on 09.11.2016.
 */
public class Track extends Racing {
    private  String s = "Авто используется для трэка";

    @Override
    public String getUse() {
        return s;
    }
}
