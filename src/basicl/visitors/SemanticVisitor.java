package basicl.visitors ;

import java.util.List;

import basicl.model.SymbolAttributes ;
import basicl.model.SymbolTable;
import basicl.jjt.*;
import basicl.model.DataType ;

public class SemanticVisitor implements BasicLVisitor 
{

	SymbolTable symbolTable ;
	SymbolTable prevScope = null ;
	int numErrors = 0 ;
	
	
	@Override
	public Object visit(SimpleNode node, Object data) {
		node.childrenAccept(this, data);
	    return null;
	}

	@Override
	public Object visit(ASTProgram node, Object data) {
		node.childrenAccept(this,data);
		return null;
	}

	//                Decl 
	//        /        |          \
	//     idList     Type  (idList   Type) *
	//     /
	//  id (id)*
	@Override
	public Object visit(ASTDecl node, Object data) {
		
		SymbolTable temp = new SymbolTable(prevScope) ;
		
		int numChildren = node.jjtGetNumChildren();
		
		for(int i=0; i < numChildren ; i=i+2)
		{
			List<Token> idList = (List<Token>)node.jjtGetChild(i).jjtAccept(this,null);
			Token type = (Token)node.jjtGetChild(i+1).jjtAccept(this,null);
			
			for(Token id : idList)
			{
				if(temp.inScope(id.image) == null)
				{
					temp.insert( id.image, 
								new SymbolAttributes(type, DataType.VAR));	
				}
				else
				{
					System.out.printf("Identifer: %s Already declared inscope", id.image) ;
					System.out.printf("Line: %s Column: %s", id.beginLine, id.beginColumn) ;
					
			        numErrors++;
				}
			}
		}
		return null;
	}

	//         _______ConstDecl_______
	//        /        |     |        \
	//       Id       Type  Exp   (Id Type Exp)*
	//                     /   \
	//                    /     \
	//                   /       \
	//                Add         (Add)* //same as other side
	//               /   \        
	//            Mult (Mult)*  only results in node if a multOpp is found.. same for Add with a addOp     
	//              \     /
	//   (Id | Bool | Num | Real | Exp)
	@Override
	public Object visit(ASTConstDecl node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTFunction_Decl node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTFunction_body node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTParams node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTType node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTMain node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTAssign node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTIf node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTWhile node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTAdd node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTMult node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTAddOp node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTMultOp node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTBoolOpp node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTCondition node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTIdent_list node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTArg_list node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTId node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTNum node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTBool node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTReal node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTFunctionCall node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}
}