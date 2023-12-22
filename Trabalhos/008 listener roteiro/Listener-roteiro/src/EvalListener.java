import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class EvalListener extends SimpleBaseListener {
	private Stack<Double> stack;
	private Map<String, Double> map;
	
	public EvalListener() {
		stack = new Stack<Double>();
		map = new HashMap<String, Double>();
	}
	
	public void exitReal(SimpleParser.RealContext ctx) {
			stack.push(Double.parseDouble(ctx.REAL_NUMBER().getText()));
	}
	
	public void exitOneTerm(SimpleParser.OneTermContext ctx) {
		if (ctx.op != null) {
			stack.push(-stack.pop());
		}
	}
	
	public void exitAddSub(SimpleParser.AddSubContext ctx) {
		Double d2 = stack.pop();
		Double d1 = stack.pop();
		if (ctx.op.getType() == SimpleParser.ADD) {
			stack.push(d1 + d2);
		} else {
			stack.push(d1 - d2);
		}
	}
	
	public void exitPrint(SimpleParser.PrintContext ctx) {
		System.out.println(stack.pop());
	}
	
	/*------------------------------------------------------------------------*/
	
	public void exitOneFactor(SimpleParser.OneFactorContext ctx) {}
	
	public void exitMulDiv(SimpleParser.MulDivContext ctx) {
		Double d1 = stack.pop();
		Double d2 = stack.pop();
		
		if(ctx.op.getType() == SimpleParser.MUL) {
			stack.push(d1 * d2);
		}
		else {
			stack.push(d1 / d2);
		}
	}
	
	public void exitId(SimpleParser.IdContext ctx) {
		String s = ctx.IDENT().getText();
		
		if(map.get(s)!= null) {
			stack.push(map.get(s));
		}
		else {
			map.put(s, 0.0);
			stack.push(0.0);
		}		
	}
	
	public void exitAssign(SimpleParser.AssignContext ctx) {
		map.put(ctx.IDENT().getText(), stack.pop());
	}
}