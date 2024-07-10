package com.kodnest.programming;

public class Question17 {
	public void calculatePlotArea(int intSideLength)
	{
		int intLength = intSideLength * intSideLength;
		System.out.println("calculatePlotArea = "+intLength);
	}
	public void calculatePlotArea(double doubleSideLength)
	{
		double intLength = Math.pow(doubleSideLength,2);//doubleSideLength * doubleSideLength;
		System.out.println("calculatePlotArea = "+intLength);
	}
}
