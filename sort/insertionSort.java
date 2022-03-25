package sort;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 7, 9};
        int[] result;
        result = insertionSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * 插入排序
     *
     * @param arrays
     * @return
     */
    public static int[] insertionSort(int[] arrays) {
//        判断是否为空
        if (arrays.length == 0)
            return arrays;
//
        for (int i = 0; i < arrays.length; i++) {
//            把当前的i和所有元素一一比对，不同的就交换，j的一遍for循环后，可以确保当前的i是最小值。
            for (int j = i; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {//前一个数字与后一个数字比较小的在前大的在后
                    //交换位置
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }
}
