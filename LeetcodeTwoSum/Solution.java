package LeetcodeTwoSum;

import java.util.Arrays;

public class Solution {
     public int[] twoSum(int[] nums, int target) {
        // Clonamos el arreglo nums y lo ordenamos
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        // Inicializamos los índices de inicio y fin
        int start = 0;
        int end = sortedNums.length - 1;

        while (start < end) {
            int sum = sortedNums[start] + sortedNums[end];
            if (sum == target) {
                // Encontramos la pareja de números, ahora buscamos sus índices en el arreglo original nums
                int index1 = -1;
                int index2 = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == sortedNums[start] && index1 == -1) {
                        index1 = i;
                    } else if (nums[i] == sortedNums[end]) {
                        index2 = i;
                    }
                }
                return new int[] { index1, index2 };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        throw new IllegalArgumentException("No se encontró una solución");
    }
}
