/* Generated By:JJTree: Do not edit this line. ASTType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package basicl.main;

public
class ASTType extends SimpleNode {
  public ASTType(int id) {
    super(id);
  }

  public ASTType(BasicL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(BasicLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a6746327a16a230e974f145b2fafbc58 (do not edit this line) */
