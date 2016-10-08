package series.serie1;

/**
 * Created by Pedro on 05/10/2016.
 */
public class Arrays {

	//exemplo eng.
	public	static	int	countEquals(int[]	v1,	int	l1,	int	r1,	int[]	v2,	int	l2,	int	r2){
		int	count=0;
		while(l1<=r1	&&	l2<=r2){
			if(v1[l1]>v2[l2])	l2++;
			else
			if(v1[l1]<v2[l2])	l1++;
			else	{	count++;	l1++;	l2++;}
		}
		return	count;
	}

	//EX1
	public static int greatestAfterRotate(int[] v, int l, int r){
		if(l > r) return -1;
		//int bigger;
		while (l<r){
			if(v[l]>v[r]) --r;
			if(v[l]<v[r]) ++l;
		}
		return v[r];
	}

	//EX2
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
