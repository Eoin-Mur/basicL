/* Generated By:JJTree: Do not edit this line. ASTConstDecl.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package basicl.main;

public
class ASTConstDecl extends SimpleNode {
  public ASTConstDecl(int id) {
    super(id);
  }

  public ASTConstDecl(BasicL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=21c3b075c0f21456c0e9bdd463a37cc1 (do not edit this line) */
