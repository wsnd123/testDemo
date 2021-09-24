package com.ly.arithmetic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RepeatedNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,2,2,2,2,5,6,9,8,10,2,2,2,3,3};
        int repeatedNumber = findRepeatedNumber(arr);
        System.out.println(repeatedNumber);
    }

    /**
     * 数组中出现次数超过一半的数字
     *
     * 给一个长度为 的数组，数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
     *
     * 数据范围：n<=50000，数组中元素的值0<=val<=10000
     * 要求：空间复杂度：O(1)，时间复杂度O(n)
     * @param arr
     * @return
     */
    public static int findRepeatedNumber(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                Integer value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }
        }

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(map.get(next) > arr.length/2){
                return next;
            }
        }

        return 0;
    }
}
