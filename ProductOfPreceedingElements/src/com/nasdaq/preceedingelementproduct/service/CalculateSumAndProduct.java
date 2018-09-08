package com.nasdaq.preceedingelementproduct.service;
import java.math.BigInteger;

public class CalculateSumAndProduct {
    
	public BigInteger sumOfProduct(int n,int C)
	{
		BigInteger sum=BigInteger.ZERO;
		if(n==1 || C==0)
		{
			return sum;
		}
		else
		{
			for(int eachNum=1;eachNum<=n;eachNum++)
			{
				BigInteger eachProduct=getProduct(eachNum,C);
				sum=sum.add(eachProduct);
			}
		}
		
		return sum;
	}

	private BigInteger getProduct(int eachNum, int C) {
		
		int maxIteration=C;
		BigInteger product=BigInteger.ONE;
		if(maxIteration>=eachNum)
		{
			maxIteration=eachNum;
		}
		for(int startVal=1;startVal<=maxIteration;startVal++)
		{
			int eachProd=eachNum-startVal;
			if(startVal==1 && eachProd==0)
			{
				return BigInteger.ZERO;
			}
			else if(eachProd==0)
			{
				return product;
			}
			else
			{
				product = product.multiply(BigInteger.valueOf(eachProd));
			}
		}
		return product;
	}
	
}
