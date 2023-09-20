package com.project.undowebapp;

import java.util.HashSet;

public class ProblemList {
	//p1
	public int maxProfit(int[] prices) {
        int p=0,buy=prices[0];
        for(int i : prices){
            if(i<buy){
                buy = i;
            }
            else if(i-buy > p){
                p = i-buy;
            }
        }
        return p;
	}
	
	//p2
	public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1; 
        int prev = 0;
        int fib=1;
        for(int i=1;i<n;i++){
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
	//p3
	 public int[] smallerNumbersThenCurrent(int[] nums) {
	        int i,j;
	        int n = nums.length;
	        if(nums.length < 2) return new int[] {0};
	        int ans[] = new int[nums.length];
	        int freq[] = new int[101];
	        for(i=0;i<n;i++){
	            freq[nums[i]]++;
	        }
	        for(i=0;i<n;i++){
	            int count=0;
	            int k = nums[i];
	                for(int x=0;x<k;x++){
	                    count += freq[x];
	                }
	                
	            
	            ans[i] = count;
	        }
	        
	        return ans;
	    }
	 
	 //p4
	 public int firstRepeated(int[] arr) {
		 HashSet<Integer> set = new HashSet<>();
			for(int i : arr){
			    if(!set.add(i)){
			        return i;
			    }
			}
		 return -1;
	    }
	 
	 
	 //p5
	 public int firstMissingPositive(int[] nums) {
	        int[] temp = new int[nums.length+1];
	        for(int i : nums) if(i>=1 && i<temp.length) temp[i]++;
	        for(int i=1;i<temp.length;i++){
	            if(temp[i]==0) return i;
	        }
	        return temp.length;
	    }
}
