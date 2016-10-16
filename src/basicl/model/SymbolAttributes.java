package basicl.model ;

import java.util.HashMap;

import basicl.jjt.*;
/**
	container describing a symbol table entry
	Eoin Murphy
*/
public class SymbolAttributes extends Object
{
	private Token type;
	private DataType datatype; 
	
	private HashMap<String,Object> values;

	public SymbolAttributes(Token _type, DataType _dataType)
	{
		type = _type;
		datatype = _dataType;
		values = new HashMap<String,Object>();
	}

	public void addValue(String name, Object value)
	{
		values.put(name,value);
	}

	public Object getValue(String name)
	{
		return values.get(name);
	}

	public Token getType()
	{
		return type ;
	}

	public DataType getDataType()
	{
		return datatype ;
	}

	public HashMap getValues()
	{
		return values ;
	}
}