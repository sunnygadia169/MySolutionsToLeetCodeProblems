package com.leet.problem.solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	public int[] twoSum(int[] nums, int target) {

		int numsCount = nums != null ? nums.length : 0;
		if (numsCount < 2) {
			throw new IllegalArgumentException("Invalid Input");
		}

		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < numsCount; i++) {
			int currentNum = nums[i];
			int difference = target - currentNum;

			if (numsMap.containsKey(difference)) {
				return new int[] { numsMap.get(difference), i };
			}

			numsMap.put(currentNum, i);
		}

		throw new IllegalArgumentException("Invalid Input");

	}
}
