package basicl.model ;

public class Quadruple
{
	private String op;
	private String arg1;
	private String arg2;
	private String result;

	public Quadruple(String _op, String _result, String _arg1, String _arg2)
	{
		op = _op;
		arg1 = _arg1;
		arg2 = _arg2;
		result = _result;
	}

	public Quadruple(String _op, String _result, String _arg1 )
	{
		op = _op;
		arg1 = _arg1;
		arg2 = "";
		result = _result;
	}

	public Quadruple(String _op, String _arg1 )
	{
		op = _op;
		arg1 = _arg1;
		arg2 = "";
		result = "";
	}

	public void printQuad()
	{
		System.out.println("[ "+op+" , "+arg1+" , "+arg2+" , "+result+" ]");
	}
}