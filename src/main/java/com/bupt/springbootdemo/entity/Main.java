package com.bupt.springbootdemo.entity;

import java.util.*;

/**
 * @Author: 金培源
 * @Date: 2022/3/27 19:40
 * @Version: 1.0
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 插入排序
        // [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        List<int[]> list = new ArrayList<>();
        int index = 0;
        HashMap<Integer,Integer> hahs = new HashMap<>();
        while (index < chars.length) {
            int[] tmp = new int[2];
            int count = 0;
            while (count < 2) {
                if (Character.isDigit(chars[index])) {
                    tmp[count] = (int)(chars[index] - '0');
                    count ++;
                }
                index ++;
                if (index >= chars.length) {
                    break;
                }
            }
            list.add(tmp);
        }
        int[][] matrix = list.toArray(new int[list.size()][2]);
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person2[0] - person1[0];
                } else {
                    return person1[1] - person2[1];
                }
            }
        });
        List<int[]> ans = new ArrayList<int[]>();
        for (int[] person : matrix) {
            ans.add(person[1], person);
        }
        System.out.print("[");
        for (int i = 0;i < ans.size();i ++) {
            System.out.print("[" + ans.get(i)[0] + "," + ans.get(i)[1] + "]");
        }
        System.out.print("]");
    }
}
