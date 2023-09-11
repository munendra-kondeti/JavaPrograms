package com.kn.arraymerginginreverseorder;

public class MartixMergeInREverse {

	// Method
	void mergeArray(int[] a, int[] b) {
		int crr[] = new int[a.length + b.length];

		for (int k = 0, i = a.length - 1, j = 0; k < crr.length - 1; k += 2, i--, j++) {
			crr[k] = a[i];
			crr[k + 1] = b[j];
		}

		for (int e : crr)
			System.out.println(e);
	}
}
