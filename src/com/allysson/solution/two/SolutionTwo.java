package com.allysson.solution.two;

public class SolutionTwo {

	public int solution(int[] A) {

		int aux = 0;
		int after = 0;
		int sum = 1;

		for (int i = 0; i < A.length; i++) {
			for (int x = 0; x < A.length; x++) {
				if (A[i] < A[x]) {
					aux = A[i];
					A[i] = A[x];
					A[x] = aux;
				}
			}
		}

		after = A[0];
		for (int i = 0; i < A.length; i++) {
			if (after == A[i]) {
				after = A[i];
			} else if (after != A[i]) {
				sum++;
				after = A[i];
			}
		}
		return sum;
	}

}
