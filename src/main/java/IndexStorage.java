public class IndexStorage {
    protected int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    protected void checkVal(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Некорректный индекс. Возможные значения 0.." + (size - 1));
        }
    }

    public int get(int index) {
        checkVal(index);
        return index * ((index % 2 == 0) ? 1 : -1);
    }

    public int[] reverse() {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - i - 1] = get(i);
        }
        return arr;
    }
}
