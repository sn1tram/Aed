package TEST_EXEMPLES;

/**
 * Created by Pedro on 08/10/2016.
 */
public class MERGE {
	public static void main(String[] args){
		int[] array = new int[]{35, 42, 5, 15, 27, 29};

		System.out.println(greatestAfterRotate(array, 0, array.length-1));
	}

	public static int greatestAfterRotate(int[] v, int l, int r){
		if(l == r) return -1;
		//int bigger;
		while (l<r){
			if(v[l]>v[r]) --r;
			if(v[l]<v[r]) ++l;
		}
		return v[r];
	}
}
