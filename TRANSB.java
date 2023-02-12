/* TRANSB.java */
/* Generated By:JavaCC: Do not edit this line. TRANSB.java */
import java.io.*;
import java.text.*;
import java.util.Queue;
import java.util.LinkedList;







public class TRANSB implements TRANSBConstants {

  public static void main(String[] args) throws ParseException, IOException {
    File inputFile = new File("doc2.txt");
    FileReader reader = new FileReader(inputFile);

    TRANSB parser = new TRANSB(reader);













    try {
    parser.TextDoc2();

      System.out.println("Valide");
    } catch (ParseException e) {
      System.err.println("PAS VALIDE");
    }
  }

  final public void TextDoc2() throws ParseException {
    trace_call("TextDoc2");
    try {

      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case 5:{
        EnsembleLignes();
        break;
        }
      default:
        jj_la1[0] = jj_gen;

      }
    } finally {
      trace_return("TextDoc2");
    }
}

  final public void EnsembleLignes() throws ParseException {
    trace_call("EnsembleLignes");
    try {

      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 5:{
        MultilignesValides();
        SuitEnsble();
        break;
        }
      case COMMENT:{
        jj_consume_token(COMMENT);
        SuitEnsble();
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("EnsembleLignes");
    }
}

  final public void SuitEnsble() throws ParseException {
    trace_call("SuitEnsble");
    try {

      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMENT:
      case 5:{
        EnsembleLignes();
        break;
        }
      default:
        jj_la1[2] = jj_gen;

      }
    } finally {
      trace_return("SuitEnsble");
    }
}

  final public void MultilignesValides() throws ParseException {
    trace_call("MultilignesValides");
    try {

      LigneValide();
      SuitMultiligne();
    } finally {
      trace_return("MultilignesValides");
    }
}

  final public void SuitMultiligne() throws ParseException {
    trace_call("SuitMultiligne");
    try {

      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 5:{
        MultilignesValides();
        break;
        }
      default:
        jj_la1[3] = jj_gen;

      }
    } finally {
      trace_return("SuitMultiligne");
    }
}

  final public void LigneValide() throws ParseException {
    trace_call("LigneValide");
    try {

      jj_consume_token(5);
      Contenuligne();
      jj_consume_token(6);
    } finally {
      trace_return("LigneValide");
    }
}

  final public void Contenuligne() throws ParseException {
    trace_call("Contenuligne");
    try {

      Mots();
      SerieMots();
    } finally {
      trace_return("Contenuligne");
    }
}

  final public void SerieMots() throws ParseException {
    trace_call("SerieMots");
    try {

      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case REEL:
      case ENTIER:{
        Contenuligne();
        break;
        }
      default:
        jj_la1[4] = jj_gen;

      }
    } finally {
      trace_return("SerieMots");
    }
}

  final public void Mots() throws ParseException {
    trace_call("Mots");
    try {

      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ENTIER:{
        jj_consume_token(ENTIER);
        break;
        }
      case REEL:{
        jj_consume_token(REEL);
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("Mots");
    }
}

  /** Generated Token Manager. */
  public TRANSBTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x28,0x28,0x28,0x20,0x6,0x6,};
	}

  {
      enable_tracing();
  }
  /** Constructor with InputStream. */
  public TRANSB(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public TRANSB(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new TRANSBTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public TRANSB(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new TRANSBTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new TRANSBTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public TRANSB(TRANSBTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TRANSBTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   trace_token(token, "");
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	   trace_token(token, " (in getNextToken)");
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[7];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 6; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 7; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  private int trace_indent = 0;
/** Enable tracing. */
  final public void enable_tracing() {
	 trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
	 trace_enabled = false;
  }

  protected void trace_call(String s) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.println("Call:	" + s);
	 }
	 trace_indent = trace_indent + 2;
  }

  protected void trace_return(String s) {
	 trace_indent = trace_indent - 2;
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.println("Return: " + s);
	 }
  }

  protected void trace_token(Token t, String where) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.print("Consumed token: <" + tokenImage[t.kind]);
	   if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
		 System.out.print(": \"" + TokenMgrError.addEscapes(t.image) + "\"");
	   }
	   System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
	 }
  }

  protected void trace_scan(Token t1, int t2) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.print("Visited token: <" + tokenImage[t1.kind]);
	   if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
		 System.out.print(": \"" + TokenMgrError.addEscapes(t1.image) + "\"");
	   }
	   System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
	 }
  }

}
