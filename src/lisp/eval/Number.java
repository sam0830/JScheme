package lisp.eval;

import lisp.exception.LispException;

/**
 * Number
 * @author sam0830
 *
 */
public interface Number extends SExpression{
	public Number add(Number number);
	public Number sub(Number number);
	public Number multiply(Number number);
	public Number divide(Number number) throws LispException;
	// TODO:Module
	public boolean lessThan(Number number);
	public boolean greaterThan(Number number);
	public boolean lessThanOrEqual(Number number);
	public boolean greaterThanOrEqual(Number number);
}
