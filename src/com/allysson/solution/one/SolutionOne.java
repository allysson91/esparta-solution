package com.allysson.solution.one;

public class SolutionOne {
	public int solution(int[] A) {

		boolean verificaArray = true;
		
		for(int i=0; i< A.length; i++) {
			verificaArray = true;
			for(int x = 0; x < A.length; x++) {
				if(A[i] == A[x] && !(i == x)) {
					verificaArray = false;
				}
			}
			
			if (verificaArray) {
				return A[i];
			}
		}
		return 0;
	}
}