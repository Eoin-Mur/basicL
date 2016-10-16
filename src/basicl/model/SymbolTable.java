package basicl.model;

import java.util.HashMap;

/**
 * Very Basic class for a symbol table
 * 
 * @author Eoin Murphy
 *
 */
public class SymbolTable {
	
	private HashMap<String, SymbolAttributes> symbolTable ;
	
	private SymbolTable parent ;
	
	public SymbolTable()
	{
		symbolTable = new HashMap<String, SymbolAttributes>();
	}
	
	public SymbolTable(SymbolTable _parent)
	{
		this.parent = _parent ;
		
		symbolTable = new HashMap<String, SymbolAttributes>();
	}
	
	/**
	 * Inserts a symbol and its attributes into the symbol table
	 * 
	 * @param symbol
	 * @param attrs
	 */
	public void insert(String symbol, SymbolAttributes attrs)
	{
		this.symbolTable.put(symbol, attrs) ;
	}
	
	/**
	 * Searches for a symbol in the symbol table
	 * @param symbol
	 * @return returns the symbols attributes if it is not found in the symbol table returns null
	 */
	public SymbolAttributes lookup(String symbol)
	{
		return this.symbolTable.get(symbol) ;
	}
	
	public SymbolAttributes inScope(String symbol)
	{
		SymbolAttributes result = this.symbolTable.get(symbol) ;
		if(result != null )
			return result ;
		
		else if(result == null && parent != null)
			return this.parent.inScope(symbol) ;
		
		else
			return null ;	
	}
}
