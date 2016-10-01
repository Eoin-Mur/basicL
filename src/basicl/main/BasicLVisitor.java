/* Generated By:JavaCC: Do not edit this line. BasicLVisitor.java Version 5.0 */
package basicl.main;

public interface BasicLVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTDecl node, Object data);
  public Object visit(ASTConstDecl node, Object data);
  public Object visit(ASTFunction_Decl node, Object data);
  public Object visit(ASTFunction_body node, Object data);
  public Object visit(ASTParams node, Object data);
  public Object visit(ASTType node, Object data);
  public Object visit(ASTMain node, Object data);
  public Object visit(ASTAssign node, Object data);
  public Object visit(ASTAdd node, Object data);
  public Object visit(ASTMult node, Object data);
  public Object visit(ASTAddOp node, Object data);
  public Object visit(ASTMultOp node, Object data);
  public Object visit(ASTBoolOpp node, Object data);
  public Object visit(ASTCondition node, Object data);
  public Object visit(ASTIdent_list node, Object data);
  public Object visit(ASTArg_list node, Object data);
  public Object visit(ASTId node, Object data);
  public Object visit(ASTNum node, Object data);
  public Object visit(ASTBool node, Object data);
  public Object visit(ASTReal node, Object data);
  public Object visit(ASTFunctionCall node, Object data);
}
/* JavaCC - OriginalChecksum=87955483d28d6b7bcd9570ecb6492612 (do not edit this line) */