/* Generated By:JJTree: Do not edit this line. ASTWhile.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package basicl.main;

public
class ASTWhile extends SimpleNode {
  public ASTWhile(int id) {
    super(id);
  }

  public ASTWhile(BasicL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=446d4bde63b92528fafb80cd1247cc76 (do not edit this line) */
