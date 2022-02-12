public class ArrayIndexStorage extends IndexStorage {
    protected int[] arr;

    ArrayIndexStorage(int[] array) {
        super(array.length);
        this.arr = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.arr[i] = array[i];
        }
    }

    @Override
    public int get(int index) {
        checkVal(index);
        return arr[index];
    }
}