package com.iteriam.calculator.model;

public enum SymbolOperation {
	SUM("+"),SUBSTRACT("-"),MULTIPLY("*"),DIVIDE("/");

	private static final SymbolOperation[] signes = new SymbolOperation[] {SUM,SUBSTRACT,MULTIPLY,DIVIDE};
	
	private String symbol;
	
	
	
	SymbolOperation(String symbol) {
		this.symbol = symbol;
	}



	private String getSymbol() {
		return this.symbol;
	}



	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}




	public static SymbolOperation getOperatorSymbol(String symbol) {
		
		
		for(int i=0;i<signes.length;i++) {
			SymbolOperation so = signes[i];
			if(symbol.equalsIgnoreCase(so.name()) || symbol.equalsIgnoreCase(so.getSymbol())) {
				return so;
			}
			
		}
		
		throw new RuntimeException("Symbol not found : " + symbol );
		
		
	}
	
}
