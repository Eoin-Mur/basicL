/* Generated By:JJTree: Do not edit this line. ASTMultOp.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package basicl.main;

public
class ASTMultOp extends SimpleNode {
  public ASTMultOp(int id) {
    super(id);
  }

  public ASTMultOp(BasicL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=43bf32140d4afc282acfd2b2c9106217 (do not edit this line) */
