
import java.util.Arrays;


public class ArrayLib {
    public static void main(String[] args) {
        double[] ds = {1.5 , 1110.5, 5.69};
        double[] idem = Arrays.copyOf(ds, 3);
        idem[0] = 123456789;
        System.out.println(Arrays.toString(idem));
        System.out.println(Arrays.toString(ds));
        String[] stringArray = {"index 0", "élément 1", "texte 2","a 3","  espace 4"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}
