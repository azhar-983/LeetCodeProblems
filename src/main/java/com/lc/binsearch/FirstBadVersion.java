package com.lc.binsearch;

public class FirstBadVersion {

	public static void main(String[] args) {

	}
	public int firstBadVersion(int n) {
        int lo=1,hi=n;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(isBadVersion(mid))
                hi = mid;
            else{
                lo = mid+1;
            }
        }
    return lo;
}
	private boolean isBadVersion(int mid) {
		if(mid %3 ==0)
			return true;
		return false;
	}
}
