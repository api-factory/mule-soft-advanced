package com.way2learnonline;

public class StockQuoteServiceWithTwoMethods {

	
	
	public String getStockPriceUSD(String stockSymbol){
	
		if(stockSymbol.equals("mule")){
			return "100";
		}else if(stockSymbol.equals("ibm")){
			return "200";
		}else{
			return "Stock doesn't exist";
		}
	}
	
	
	public String getStockPriceINR(String stockSymbol){
		
		if(stockSymbol.equals("mule")){
			return "6000";
		}else if(stockSymbol.equals("ibm")){
			return "12000";
		}else{
			return "Stock doesn't exist";
		}
	}
}
