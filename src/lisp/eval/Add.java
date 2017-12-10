package lisp.eval;

/**
 * Add (加法)
 * @author sam0830
 *
 */
public class Add implements Subroutine {
	private static final Add add = new Add();
	
	public SExpression apply(SExpression sexp, Environment environment) {
		Integer num = 0;
		SExpression s = sexp;
		while(true) {
			if(((ConsCell)s).getCdr() instanceof EmptyList) {
				num += ((Int)((ConsCell)s).getCar()).getValue();
				break;
			}
			num += ((Int)((ConsCell)s).getCar()).getValue();
			s = ((ConsCell)s).getCdr(); 
		}
		return Int.valueOf(num);
	}
	
	public static Add getInstance() {
		return add;
	}
}
