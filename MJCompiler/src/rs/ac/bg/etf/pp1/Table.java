package rs.ac.bg.etf.pp1;

import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Scope;
import rs.etf.pp1.symboltable.concepts.Struct;

public class Table extends Tab {
	public static final Struct boolType	= new Struct(Struct.Bool);;
	public static void init() {
		Tab.init();
		Tab.currentScope().addToLocals(new Obj(Obj.Type, "bool", boolType));
	}
	
	public static boolean isDefinedInCurrentScope(String name) {
		return findInCurrentScope(name) != noObj;
	}

	public static Obj findInCurrentScope(String name) {
		Obj ret = currentScope.findSymbol(name);		
		return ret != null ? ret : noObj;
	}
	
	public static boolean isDefinedInOpenedScopes(String name) {
		return findInOpenedScopes(name) != noObj;
	}
	
	public static Obj findInOpenedScopes(String name) {
		Obj ret = null;
		for(Scope currentScope = Tab.currentScope; currentScope != null; currentScope = currentScope.getOuter()) {
			ret = currentScope.findSymbol(name);
			if(ret != null) return ret;
		}
		return noObj;
	}

}
