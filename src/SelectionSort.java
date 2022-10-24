public class SelectionSort {
//    public static void selectionSort(double[] list) {
//        for (int i = 0; i < list.length - 1; i++) {
//            /* Find the minimum in the list[i..list.length-1] */
//            double currentMin = list[i];
//            int currentMinIndex = i;
//
//            for (int j = i + 1; j < list.length; j++) {
//                if (currentMin > list[j]) {
//                    currentMin = list[j];
//                    currentMinIndex = j;
//                }
//            }
//
//            /* Swap list[i] with list[currentMinIndex] if necessary */
//            if (currentMinIndex != i) {
//                list[currentMinIndex] = list[i];
//                list[i] = currentMin;
//            }
//        }
//    }

    public static void selectionSort(double[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;

                }
            }
            if (minIndex != i) {
                double t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            System.out.print("\n" + i + ": ");
            for (double k : a) {
                System.out.print(k + "\t");
            }
        }
    }
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
//        for (int i = 0; i < list.length; i++)
//            System.out.print(list[i] + " ");
    }
}
