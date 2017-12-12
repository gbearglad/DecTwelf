
public class Reverse {

    public static int[] reverse(int[] source) {
        int[] destination = new int[source.length];
        int len = source.length;
        int temp = source[0];
        for (int i = 1; i < len ; i++){
            destination[len-1-i] = source[i];
        }
        destination[len-1] = temp;
        return destination;
    }

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4,56,98,54};
        int[] inverse = reverse(source);
        for (int i : inverse) {
            System.out.println(i);
        }
    }
}
