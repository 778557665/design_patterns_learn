package com.db.design.stencil;

public class StencilDemo {

    public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
    // 预设数据数组
    public static void main(String[] args){
        AbstractSort s = new ConcreteSort();
        s.showSortResult(a);
    }
}

abstract class AbstractSort{
    protected abstract void sort(int[] array);

    public void showSortResult(int[] array){
        this.sort(array);
        System.out.println("排序结果：");
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
            System.out.printf("%3s", array[i]);
        }
    }
}

class ConcreteSort extends AbstractSort{

    protected void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            selectSort(array,i);
        }
    }

    private void selectSort(int[] array, int i) {
        int MinValue = 32767; // 最小值变量
        int indexMin = 0; // 最小值索引变量
        int Temp; // 暂存变量
        for (int j = i; j < array.length; j++) {
            if (array[j] < MinValue){ // 找到最小值
                MinValue = array[j]; // 储存最小值
                indexMin = j;
            }
        }
        Temp = array[i]; // 交换两数值
        array[i] = array[indexMin];
        array[indexMin] = Temp;
    }

}
