//package com.ephemeral;
//
///**
// * Created by MDCCLXXVI on 10/6/14.
// */
//public class Combin {
//
//    public static void cprobRoutine(int[] probability, int[] A, int[] B){
//
//    	double find_probability_of_intersection = 0;
//    	List<Integer> intersect = new ArrayList<Integer>();
//    	for (int i = 0; i < A.length ; i++) { // use len of p(a)
//    		for(int j = 0; i < B.length; j++){
//
////    			A[i] = B[j] ? intersect.add( B[j] ): return;
//
//    		}
//
//    	} // end outer for
//
//
//    	// Calculate probability of intersection
//    	for(int common_i : intersection) {
//    		find_probability_of_intersection += probability[ (common_i - 1)];
//    	}
//
//    	// finding P(B)
//    	// sum each P(B_i) at all relevant i
//    	double pfxb = 0; // probability of B summation var
//    	for(int common_i : B) {
//    		pfxb += B[ (common_i - 1)];
//    	}
//
//    	// P(A| B) = P(A intersect B ) / P (B)
//    	// = P(A)*P(B) / P(B)
//    	find_probability_of_intersection / pfxb;
//
//
//    }
//
//}
