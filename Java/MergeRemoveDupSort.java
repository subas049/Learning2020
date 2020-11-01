import java.util.Arrays;

class MergeRemoveDupSort {

public static int[] mergeArrays(int[] a, int[] b) {
    int[] c = new int[a.length + b.length];
    for (int i = 0; i < a.length; i++) {
        c[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
        c[a.length + i] = b[i];
    }
    return c;
}

public static void sortArray(int[] a) {
    for (int lastPos = a.length - 1; lastPos >= 0; lastPos--) {
        for (int index = 0; index <= lastPos - 1; index++) {
            if (a[index] > a[index + 1]) {
                int temp = a[index];
                a[index] = a[index + 1];
                a[index + 1] = temp;
            }
        }
    }
}

public static int countUniqueValues(int[] c) {
    int unique = c.length;
    for (int i = 0; i < c.length; i++) {
        while (i + 1 < c.length && c[i] == c[i + 1]) {
            i++;
            unique--;
        }
    }
    return unique;
}

public static int[] mergeDedupSort(int[] a, int[] b) {
    int[] c = mergeArrays(a, b);
    sortArray(c);
    int unique = countUniqueValues(c);
    int[] d = new int[unique];
    int p = 0;
    for (int i = 0; i < c.length; i++) {
        d[p++] = c[i];
        while (i + 1 < c.length && c[i] == c[i + 1]) {
            i++;
        }
    }
    return d;
}

public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 8, 5, 7, 9, 6, 0 };
    int[] b = { 0, 2, 11, 12, 5, 6, 8 };
    int[] c = mergeDedupSort(a, b);
    System.out.println(Arrays.toString(c));
}

}