
/**
 * Created by Denis Sedinin on 23.11.2016.
 */
public class Base<I extends Integer> {

    private I size;

    public void setSize(I size) {
        this.size = size;
    }
    public I getSize() {
        return size;
    }
    public void lenght() {
        for (int i = 0; i < (int) size; i++) {
            System.out.print(i + " ");
        }
    }
    public void max() {
        int j = 0;
        for (int i = 0; i < (int) size; i++) {
            if (j < i) {
                j = i;
            }
        }
        System.out.println(j);
    }
    public void min() {
        int j = 0;
        for (int i = 0; i < (int) size; i++) {
            if (j > i) {
                j = i;
            }
        }
        System.out.println(j);
    }
    public void avg() {
        float j = 0;
        for (int i = 0; i < (int) size; i++) {
            j+=i;
        }
        System.out.println(j/(int) size);
    }
    public void lenghtExt() {
        int j = 0;
        for (int i = 0; i < (int) size + 1; i++) {
            System.out.print(i + " ");
        }
    }
    public void lenghtNar() {
        int j = 0;
        for (int i = 0; i < (int) size - 1; i++) {
            System.out.print(i + " ");
        }
    }
}
