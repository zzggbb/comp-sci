public class SortLib {

    private int[] a;

    public SortLib(int[] driverArray) {
        a = driverArray;
    }

    public void printItems(int[] array, String currentIter) {
        System.out.print(currentIter + "| ");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort() {
        printItems(a,"i");
        int itemToInsert,j;
        boolean looking;
        for (int k=1; k<a.length; k++) {
            itemToInsert = a[k];
            j = k-1;
            looking = true;
            while (j>=0 && looking) {
                if(itemToInsert < a[j]) {
                    a[j+1] = a[j];
                    j--;
                } else {
                    looking = false;
                }
            }
            a[j+1] = itemToInsert;
            printItems(a,k+"");
        }
    }

    public void bubbleSort() {
        printItems(a,"i");
        for (int outer=0; outer<a.length-1; outer++) {
            for (int inner=0; inner<a.length-outer-1; inner++) {
                if (a[inner] > a[inner+1]) {
                    int temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner+1] = temp;
                }
            }
            printItems(a,outer+"");
        }
    }

    public void selectionSort() {
        printItems(a,"i");
        for (int outer=0; outer<a.length-1; outer++) {
            int minIndex = outer;
            for (int i=outer+1; i<a.length; i++) {
                if (a[i] < a[minIndex]) {
                    minIndex = i;
                }
            }
            if(minIndex != outer) {
                int temp = a[outer];
                a[outer] = a[minIndex];
                a[minIndex] = temp;
            }
            printItems(a,outer+"");
        }
    }
}