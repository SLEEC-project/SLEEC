/**
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.generator;

import circus.robocalc.sleec.sLEEC.Atom;
import circus.robocalc.sleec.sLEEC.BoolComp;
import circus.robocalc.sleec.sLEEC.BoolOp;
import circus.robocalc.sleec.sLEEC.Constant;
import circus.robocalc.sleec.sLEEC.Defeater;
import circus.robocalc.sleec.sLEEC.Definition;
import circus.robocalc.sleec.sLEEC.Event;
import circus.robocalc.sleec.sLEEC.MBoolExpr;
import circus.robocalc.sleec.sLEEC.Measure;
import circus.robocalc.sleec.sLEEC.Not;
import circus.robocalc.sleec.sLEEC.Numeric;
import circus.robocalc.sleec.sLEEC.RelComp;
import circus.robocalc.sleec.sLEEC.RelOp;
import circus.robocalc.sleec.sLEEC.Response;
import circus.robocalc.sleec.sLEEC.Rule;
import circus.robocalc.sleec.sLEEC.Scale;
import circus.robocalc.sleec.sLEEC.Trigger;
import circus.robocalc.sleec.sLEEC.Type;
import circus.robocalc.sleec.sLEEC.Value;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SLEECGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _lastSegment = resource.getURI().trimFileExtension().lastSegment();
    String _plus = (_lastSegment + ".csp");
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Definition, CharSequence> _function = (Definition it) -> {
      return this.D(it);
    };
    String _join = IterableExtensions.join(IterableExtensions.<Definition, CharSequence>map(IteratorExtensions.<Definition>toIterable(Iterators.<Definition>filter(resource.getAllContents(), Definition.class)), _function), "");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    final Function1<Rule, CharSequence> _function_1 = (Rule it) -> {
      return this.R(it);
    };
    String _join_1 = IterableExtensions.join(IterableExtensions.<Rule, CharSequence>map(IteratorExtensions.<Rule>toIterable(Iterators.<Rule>filter(resource.getAllContents(), Rule.class)), _function_1), "");
    _builder.append(_join_1);
    _builder.newLineIfNotEmpty();
    fsa.generateFile(_plus, _builder);
  }
  
  private CharSequence D(final Definition d) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (d instanceof Event) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("channel ");
      String _name = ((Event)d).getName();
      _builder.append(_name);
      _builder.newLineIfNotEmpty();
      _switchResult = _builder;
    }
    if (!_matched) {
      if (d instanceof Measure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("channel ");
        String _name = ((Measure)d).getName();
        _builder.append(_name);
        _builder.append(" : ");
        CharSequence _T = this.T(((Measure)d).getType(), ((Measure)d).getName());
        _builder.append(_T);
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (d instanceof Constant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((Constant)d).getName();
        _builder.append(_name);
        _builder.append(" = ");
        CharSequence _norm = this.norm(((Constant)d).getValue());
        _builder.append(_norm);
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  private CharSequence T(final Type t, final String mID) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (t instanceof circus.robocalc.sleec.sLEEC.Boolean) {
      _matched=true;
      _switchResult = "Bool";
    }
    if (!_matched) {
      if (t instanceof Numeric) {
        _matched=true;
        _switchResult = "Int";
      }
    }
    if (!_matched) {
      if (t instanceof Scale) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("ST");
        _builder.append(mID);
        _builder.newLineIfNotEmpty();
        _builder.append("datatype ST");
        _builder.append(mID);
        _builder.append(" = ");
        String _join = IterableExtensions.join(((Scale)t).getScaleParams(), " | ");
        _builder.append(_join);
        _builder.newLineIfNotEmpty();
        _builder.append("STle");
        _builder.append(mID);
        _builder.append("(v1");
        _builder.append(mID);
        _builder.append(", v2");
        _builder.append(mID);
        _builder.append(") =");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if v1");
        _builder.append(mID, "\t");
        _builder.append(" == sp1 then true");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        int _size = ((Scale)t).getScaleParams().size();
        int _minus = (_size - 1);
        final Function1<Integer, String> _function = (Integer it) -> {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("else if v1");
          _builder_1.append(mID);
          _builder_1.append(" == ");
          String _get = ((Scale)t).getScaleParams().get((it).intValue());
          _builder_1.append(_get);
          _builder_1.append(" then not v2");
          _builder_1.append(mID);
          _builder_1.append(" == {");
          String _join_1 = IterableExtensions.join(IterableExtensions.<String>take(((Scale)t).getScaleParams(), (it).intValue()), ", ");
          _builder_1.append(_join_1);
          _builder_1.append("}");
          return _builder_1.toString();
        };
        String _join_1 = IterableExtensions.join(IterableExtensions.<Integer, String>map(new ExclusiveRange(1, _minus, true), _function), "\n");
        _builder.append(_join_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("else v2");
        _builder.append(mID, "\t");
        _builder.append(" == ");
        String _last = IterableExtensions.<String>last(((Scale)t).getScaleParams());
        _builder.append(_last, "\t");
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  private CharSequence R(final Rule r) {
    CharSequence _xblockexpression = null;
    {
      final String rID = r.getName();
      final Trigger trig = r.getTrigger();
      final Response resp = r.getResponse();
      final EList<Defeater> dfts = r.getDefeaters();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(rID);
      _builder.append(" = Trigger");
      _builder.append(rID);
      _builder.append("; Monitoring");
      _builder.append(rID);
      _builder.append("; ");
      _builder.append(rID);
      _builder.newLineIfNotEmpty();
      _builder.append("Trigger");
      _builder.append(rID);
      _builder.append(" = ");
      CharSequence _TG = this.TG(trig, "SKIP", ("Trigger" + rID));
      _builder.append(_TG);
      _builder.newLineIfNotEmpty();
      _builder.append("Monitoring");
      _builder.append(rID);
      _builder.append(" = ");
      Iterable<String> _alpha = this.<Response>alpha(resp);
      final Function1<Defeater, Iterable<String>> _function = (Defeater it) -> {
        return this.<Defeater>alpha(it);
      };
      Iterable<String> _flatMap = IterableExtensions.<Defeater, String>flatMap(dfts, _function);
      Iterable<String> _plus = Iterables.<String>concat(_alpha, _flatMap);
      CharSequence _RDS = this.RDS(resp, dfts, trig, _plus, ("Monitoring" + rID));
      _builder.append(_RDS);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence TG(final Trigger trig, final String sp, final String fp) {
    CharSequence _xblockexpression = null;
    {
      final String eID = trig.getEvent().getName();
      final MBoolExpr mBE = trig.getExpr();
      CharSequence _xifexpression = null;
      if ((mBE == null)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(eID);
        _builder.append(" -> ");
        _builder.append(sp);
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("let");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("MTrigger = ");
        CharSequence _ME = this.ME(this.<MBoolExpr>alpha(mBE), mBE, sp, fp);
        _builder_1.append(_ME, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("in ");
        _builder_1.append(eID);
        _builder_1.append(" -> MTrigger");
        _builder_1.newLineIfNotEmpty();
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private CharSequence ME(final Iterable<String> mIDs, final MBoolExpr mBE, final String sp, final String fp) {
    CharSequence _xblockexpression = null;
    {
      final String mID = IterableExtensions.<String>head(mIDs);
      CharSequence _xifexpression = null;
      if ((mID == null)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("if ");
        CharSequence _norm = this.norm(mBE);
        _builder.append(_norm);
        _builder.append(" then ");
        _builder.append(sp);
        _builder.append(" else ");
        _builder.append(fp);
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("StartBy(");
        _builder_1.append(mID);
        _builder_1.append("?v");
        _builder_1.append(mID);
        _builder_1.append(" ->");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        CharSequence _ME = this.ME(IterableExtensions.<String>tail(mIDs), this.<MBoolExpr>replace(mBE, ("v" + mID), mID), sp, fp);
        _builder_1.append(_ME, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append(",0)");
        _builder_1.newLine();
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private CharSequence RDS(final Response resp, final Iterable<Defeater> dfts, final Trigger t, final Iterable<String> ARDS, final String mp) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = IterableExtensions.isEmpty(dfts);
    if (_isEmpty) {
      _xifexpression = this.RP(resp);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("let");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _LRDS = this.LRDS(resp, dfts, t, ARDS, mp, Integer.valueOf(1));
      _builder.append(_LRDS, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("within ");
      final Function1<Defeater, Iterable<String>> _function = (Defeater it) -> {
        return this.<Defeater>alpha(it);
      };
      int _size = IterableExtensions.size(dfts);
      int _plus = (_size + 1);
      CharSequence _CDS = this.CDS(IterableExtensions.<Defeater, String>flatMap(dfts, _function), dfts, Integer.valueOf(_plus));
      _builder.append(_CDS);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  private CharSequence RP(final Response r) {
    CharSequence _xblockexpression = null;
    {
      final String eID = r.getEvent().getName();
      final Value v = r.getTime();
      final Response resp = r.getResponse();
      CharSequence _xifexpression = null;
      boolean _isNot = r.isNot();
      if (_isNot) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Wait(");
        CharSequence _norm = this.norm(v);
        _builder.append(_norm);
        _builder.append(")");
        _xifexpression = _builder;
      } else {
        CharSequence _xifexpression_1 = null;
        if ((v == null)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(eID);
          _builder_1.append(" -> SKIP");
          _xifexpression_1 = _builder_1;
        } else {
          CharSequence _xifexpression_2 = null;
          if ((resp == null)) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("StartBy(");
            _builder_2.append(eID);
            _builder_2.append(" -> SKIP,");
            CharSequence _norm_1 = this.norm(v);
            _builder_2.append(_norm_1);
            _builder_2.append(")");
            _xifexpression_2 = _builder_2;
          } else {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("TimedInterrupt(");
            _builder_3.append(eID);
            _builder_3.append(" -> SKIP,");
            CharSequence _norm_2 = this.norm(v);
            _builder_3.append(_norm_2);
            _builder_3.append(",");
            CharSequence _RP = this.RP(resp);
            _builder_3.append(_RP);
            _builder_3.append(")");
            _xifexpression_2 = _builder_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private CharSequence LRDS(final Response resp, final Trigger trig, final Iterable<String> AR, final String mp, final Integer n) {
    CharSequence _xifexpression = null;
    if ((resp != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Monitoring");
      _builder.append(n);
      _builder.append(" = ");
      CharSequence _RP = this.RP(resp);
      _builder.append(_RP);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Monitoring");
      _builder_1.append(n);
      _builder_1.append(" = ");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Monitoring");
      _builder_2.append(n);
      CharSequence _TG = this.TG(trig, mp, _builder_2.toString());
      _builder_1.append(_TG);
      _builder_1.newLineIfNotEmpty();
      final Function1<String, String> _function = (String it) -> {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("\t");
        _builder_3.append("[] ");
        _builder_3.append(it, "\t");
        _builder_3.append(" -> Monitoring");
        _builder_3.append(n, "\t");
        return _builder_3.toString();
      };
      String _join = IterableExtensions.join(IterableExtensions.<String, String>map(AR, _function), "\n");
      _builder_1.append(_join);
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence LRDS(final Response resp, final Iterable<Defeater> dfts, final Trigger trig, final Iterable<String> AR, final String mp, final Integer n) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _LRDS = this.LRDS(resp, trig, AR, mp, n);
    _builder.append(_LRDS);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression = null;
    boolean _isEmpty = IterableExtensions.isEmpty(dfts);
    boolean _not = (!_isEmpty);
    if (_not) {
      _xifexpression = this.LRDS(IterableExtensions.<Defeater>head(dfts).getResponse(), IterableExtensions.<Defeater>tail(dfts), trig, AR, mp, Integer.valueOf(((n).intValue() + 1)));
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence CDS(final Iterable<String> mIDs, final Iterable<Defeater> dfts, final Integer n) {
    CharSequence _xblockexpression = null;
    {
      boolean _isEmpty = IterableExtensions.isEmpty(mIDs);
      if (_isEmpty) {
        return this.EDS(dfts, "Monitoring1", n);
      }
      final String mID = IterableExtensions.<String>head(mIDs);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("StartBy(");
      _builder.append(mID);
      _builder.append("?v");
      _builder.append(mID);
      _builder.append(" ->");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      final Function1<Defeater, Defeater> _function = (Defeater it) -> {
        return this.<Defeater>replace(it, ("v" + mID), mID);
      };
      CharSequence _CDS = this.CDS(IterableExtensions.<String>tail(mIDs), IterableExtensions.<Defeater, Defeater>map(dfts, _function), n);
      _builder.append(_CDS, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append(",0)");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence EDS(final Defeater dft, final CharSequence fp, final Integer n) {
    CharSequence _xblockexpression = null;
    {
      final MBoolExpr mBE = dft.getExpr();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if ");
      CharSequence _norm = this.norm(mBE);
      _builder.append(_norm);
      _builder.append(" then Monitoring");
      _builder.append(n);
      _builder.append(" else ");
      _builder.append(fp);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence EDS(final Iterable<Defeater> dfts, final CharSequence fp, final Integer n) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = IterableExtensions.isEmpty(dfts);
    if (_isEmpty) {
      _xifexpression = fp;
    } else {
      _xifexpression = this.EDS(IterableExtensions.<Defeater>head(dfts), this.EDS(IterableExtensions.<Defeater>tail(dfts), fp, Integer.valueOf(((n).intValue() - 1))), n);
    }
    return _xifexpression;
  }
  
  private <T extends EObject> Iterable<String> alpha(final T AST) {
    final Function1<Atom, String> _function = (Atom it) -> {
      return it.getName();
    };
    final Function1<String, Boolean> _function_1 = (String it) -> {
      return Boolean.valueOf((!Objects.equal(it, "")));
    };
    return IteratorExtensions.<String>toIterable(IteratorExtensions.<String>filter(IteratorExtensions.<Atom, String>map(Iterators.<Atom>filter(AST.eAllContents(), Atom.class), _function), _function_1));
  }
  
  private CharSequence norm(final MBoolExpr mBE) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (mBE instanceof BoolComp) {
      _matched=true;
      _switchResult = this.norm(((BoolComp) mBE));
    }
    if (!_matched) {
      if (mBE instanceof Not) {
        _matched=true;
        _switchResult = this.norm(((Not) mBE));
      }
    }
    if (!_matched) {
      if (mBE instanceof RelComp) {
        _matched=true;
        _switchResult = this.norm(((RelComp) mBE));
      }
    }
    if (!_matched) {
      if (mBE instanceof Atom) {
        _matched=true;
        _switchResult = this.norm(((Atom) mBE));
      }
    }
    String _plus = ("(" + _switchResult);
    return (_plus + ")");
  }
  
  private String norm(final BoolComp b) {
    CharSequence _norm = this.norm(b.getLeft());
    String _switchResult = null;
    BoolOp _op = b.getOp();
    if (_op != null) {
      switch (_op) {
        case AND:
          _switchResult = " and ";
          break;
        case OR:
          _switchResult = " or ";
          break;
        default:
          break;
      }
    }
    String _plus = (_norm + _switchResult);
    CharSequence _norm_1 = this.norm(b.getRight());
    return (_plus + _norm_1);
  }
  
  private String norm(final Not n) {
    CharSequence _norm = this.norm(n.getExpr());
    return ("not " + _norm);
  }
  
  private String norm(final RelComp r) {
    CharSequence _norm = this.norm(r.getLeft());
    String _switchResult = null;
    RelOp _op = r.getOp();
    if (_op != null) {
      switch (_op) {
        case LESS_THAN:
          _switchResult = "<";
          break;
        case GREATER_THAN:
          _switchResult = ">";
          break;
        case NOT_EQUAL:
          _switchResult = "!=";
          break;
        case LESS_EQUAL:
          _switchResult = "<=";
          break;
        case GREATER_EQUAL:
          _switchResult = ">=";
          break;
        case EQUAL:
          _switchResult = "==";
          break;
        default:
          break;
      }
    }
    String _plus = (_norm + _switchResult);
    CharSequence _norm_1 = this.norm(r.getRight());
    return (_plus + _norm_1);
  }
  
  private CharSequence norm(final Atom a) {
    CharSequence _xifexpression = null;
    String _name = a.getName();
    boolean _tripleEquals = (_name == null);
    if (_tripleEquals) {
      _xifexpression = this.norm(a.getValue());
    } else {
      _xifexpression = a.getName();
    }
    return _xifexpression;
  }
  
  private CharSequence norm(final Value v) {
    CharSequence _xifexpression = null;
    Constant _constant = v.getConstant();
    boolean _tripleEquals = (_constant == null);
    if (_tripleEquals) {
      String _xifexpression_1 = null;
      float _float = v.getFloat();
      boolean _equals = (_float == 0);
      if (_equals) {
        _xifexpression_1 = Integer.valueOf(v.getInt()).toString();
      } else {
        _xifexpression_1 = Float.valueOf(v.getFloat()).toString();
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = this.norm(v.getConstant().getValue());
    }
    return _xifexpression;
  }
  
  private <T extends EObject> T replace(final T AST, final String vmID, final String mID) {
    final T res = AST;
    final Function1<Atom, Boolean> _function = (Atom it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, mID));
    };
    final Procedure1<Atom> _function_1 = (Atom it) -> {
      it.setName(vmID);
    };
    IteratorExtensions.<Atom>forEach(IteratorExtensions.<Atom>filter(Iterators.<Atom>filter(res.eAllContents(), Atom.class), _function), _function_1);
    return res;
  }
}
