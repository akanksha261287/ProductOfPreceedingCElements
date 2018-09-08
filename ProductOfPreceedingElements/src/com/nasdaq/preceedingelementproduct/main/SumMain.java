package com.nasdaq.preceedingelementproduct.main;
import java.math.BigInteger;

import com.nasdaq.preceedingelementproduct.service.CalculateSumAndProduct;

public class SumMain {
    
	public static void main(String[] args) {
		
		CalculateSumAndProduct calculateSumAndProduct=new CalculateSumAndProduct();
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(10000000 ,200 );
		
		System.out.println(sumAndProductResult);
		
	}
}
