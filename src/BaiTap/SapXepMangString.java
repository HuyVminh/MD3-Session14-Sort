package BaiTap;

import BaiTap.SapXepHocVienTheoDiem.Student;

import java.util.Arrays;

public class SapXepMangString {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

        // Cách sắp xếp nổi bọt :
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // Cách sắp xếp chọn :
        for (int i = 0; i < arr.length - 1; i++) {
            String currentMin = arr[i];
            int currentIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin.compareTo(arr[j]) > 0) {
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
            String currentElement = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k].compareTo(currentElement) > 0; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
