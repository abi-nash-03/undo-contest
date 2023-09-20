package com.project.undowebapp.controllers;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.undowebapp.Problem;
import com.project.undowebapp.ProblemList;

@RestController
@RequestMapping("problem")
public class ProblemController {

	ProblemList prblmList = new ProblemList();
	@PostMapping("q1")
	public int question1(@RequestBody Problem prblm) {
		String[] s_arr = prblm.getArr().split(" ");
		int[] arr = new int[s_arr.length];
		for(int i=0;i<s_arr.length;i++) {
			arr[i] = Integer.valueOf(s_arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		return prblmList.maxProfit(arr);
	}
	@PostMapping("q2")
	public int question2(@RequestBody Problem prblm) {
		int n = prblm.getN();
		return prblmList.fib(n); 
	}
	
	@PostMapping("q3")
	public int[] question3(@RequestBody Problem prblm) {
		String[] s_arr = prblm.getArr().split(" ");
		int[] arr = new int[s_arr.length];
		for(int i=0;i<s_arr.length;i++) {
			arr[i] = Integer.valueOf(s_arr[i]);
		}
		return prblmList.smallerNumbersThenCurrent(arr);
	}
	
	@PostMapping("q4")
	public int question4(@RequestBody Problem prblm) {
		String[] s_arr = prblm.getArr().split(" ");
		int[] arr = new int[s_arr.length];
		for(int i=0;i<s_arr.length;i++) {
			arr[i] = Integer.valueOf(s_arr[i]);
		}
		return prblmList.firstRepeated(arr);
	}
	
	@PostMapping("q5")
	public int question5(@RequestBody Problem prblm) {
		String[] s_arr = prblm.getArr().split(" ");
		int[] arr = new int[s_arr.length];
		for(int i=0;i<s_arr.length;i++) {
			arr[i] = Integer.valueOf(s_arr[i]);
		}
		return prblmList.firstMissingPositive(arr);
	}
}
