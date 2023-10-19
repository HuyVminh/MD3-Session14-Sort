package BaiTap;

import java.util.Arrays;

public class SapXepSoNguyen {
    public static void main(String[] args) {
        int[] arr = getArr();

        // Cách sắp xếp nổi bọt :
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // Cách sắp xếp chọn :
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int currentIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                arr[currentIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Cách sắp xếp chèn
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }
}
