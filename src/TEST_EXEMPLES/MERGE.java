package TEST_EXEMPLES;

/**
 * Created by Pedro on 08/10/2016.
 */
public class MERGE {
	public static void main(String[] args){
		int[] array1 = {7, 22, 35, 42, 22, 35, 47, 55};
		int[] array2 = {22, 42, 47, 42, 22, 35, 35, 35};

		System.out.println(isPermutation(array1, 2, 5, array2, 3, 6));
	}
	public static int greatestAfterRotate(int[] v, int l, int r){
		if(l == r) return -1;
		while (l<r){
			if(v[l]>v[r]) --r;
			if(v[l]<v[r]) ++l;
		}
		return v[r];
	}

	public static boolean isPermutation(int[] a1, int l1, int r1, int[] a2, int l2, int r2){
		if(l1-r1 != l2-r2) return false;
		int count = 0;
		for(int i = l1; i<=r1; i++) {
			int s = i;
			int a = a1[i];
			int idx = l2;
			while (idx <= r2) {
				a = a2[idx];
				if(a1[i] == a2[idx]){
					++count;
					a2[idx] = -1;
					idx = r2;
				}
				++idx;
			}
		}
		return (count == (r1-l1)+1) ? true : false;
	}
}
