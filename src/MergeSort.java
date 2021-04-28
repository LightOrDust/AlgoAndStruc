import static jdk.nashorn.internal.objects.Global.print;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 3, 6, 8};//首先讨论两组已经排好序的情况
        int mid = arr.length >> 1 + 1;

        int i = 0;
        int j = mid;//2进制左移一位，相当于除以2的效果
        int k = 0;

        int[] temp = new int[arr.length];//对数组进行初始化

        while (i <= mid && j < arr.length) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j < arr.length) {
            temp[k++] = arr[j++];
        }


        print(temp);


    }

}
