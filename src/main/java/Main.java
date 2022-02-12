import java.util.Arrays;

public class Main {

    public static void ShowResults(IndexStorage obj){
        System.out.println("size=" + obj.size());
        System.out.println("value of 5-th indx=" + obj.get(5));
        System.out.println("reverse array=" + Arrays.toString(obj.reverse()));
    }

    public static void main(String[] args) {
        IndexStorage indxs = new IndexStorage(10);
        IndexStorage array = new ArrayIndexStorage(new int[] {10,11,12,13,14,15,16,17,18});
        ShowResults(indxs);
        ShowResults(array);
    }
}