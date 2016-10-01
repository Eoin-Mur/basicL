package basicl.model ;

import java.util.HashMap;
import basicl.main.* ;
/**
	container describing a symbol table entry
	Eoin Murphy
*/
public class STC extends Object
{
	private Token name;
	private Token type;
	private DataType datatype; 
	private String scope;
	private HashMap<String,Object> values;

	public STC(Token _name, Token _type, String _scope,DataType _dataType)
	{
		name = _name;
		type = _type;
		scope = _scope;
		datatype = _dataType;
		values = new HashMap<String,Object>();
	}

	public STC(Token _name, Token _type,DataType _dataType)
	{
		name = _name;
		type = _type;
		datatype = _dataType;
		values = new HashMap<String,Object>();
	}

	public void setScope(String _scope)
	{
		scope = _scope; 
	}

	public void addValue(String name, Object value)
	{
		values.put(name,value);
	}

	public Object getValue(String name)
	{
		return values.get(name);
	}

	public Token getName()
	{
		return name ;
	}

	public Token getType()
	{
		return type ;
	}

	public DataType getDataType()
	{
		return datatype ;
	}

	public String getScope()
	{
		return scope ;
	}

	public HashMap getValues()
	{
		return values ;
	}
}