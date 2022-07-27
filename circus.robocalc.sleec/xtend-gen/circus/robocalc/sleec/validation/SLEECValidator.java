/**
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.validation;

import circus.robocalc.sleec.sLEEC.BoolComp;
import circus.robocalc.sleec.sLEEC.MBoolExpr;
import circus.robocalc.sleec.sLEEC.Not;
import circus.robocalc.sleec.sLEEC.Numeric;
import circus.robocalc.sleec.sLEEC.RelComp;
import circus.robocalc.sleec.sLEEC.SLEECPackage;
import circus.robocalc.sleec.sLEEC.Scale;
import circus.robocalc.sleec.sLEEC.Value;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SLEECValidator extends AbstractSLEECValidator {
  @Check
  public void checkRelCompType(final RelComp e) {
    if (((e.getLeft().getMeasure().getType() instanceof Scale) && (e.getRight().getMeasure().getType() instanceof Scale))) {
      return;
    }
    if (((!this.isNumeric(e.getLeft())) || (!this.isNumeric(e.getRight())))) {
      this.error("relational operand must have numeric type.", SLEECPackage.Literals.REL_COMP__OP, "relationalOperands");
    }
  }
  
  @Check
  public void checkBoolCompType(final BoolComp e) {
    if (((!this.isBoolean(e.getLeft())) || (!this.isBoolean(e.getRight())))) {
      this.error("boolean operand must have boolean type", SLEECPackage.Literals.BOOL_COMP__OP, "booleanOperands");
    }
  }
  
  private boolean isNumeric(final MBoolExpr e) {
    return ((e instanceof Value) || 
      (e.getMeasure().getType() instanceof Numeric));
  }
  
  private boolean isBoolean(final MBoolExpr e) {
    return ((((e instanceof Not) || 
      (e instanceof BoolComp)) || 
      (e instanceof RelComp)) || 
      (e.getMeasure().getType() instanceof circus.robocalc.sleec.sLEEC.Boolean));
  }
}
