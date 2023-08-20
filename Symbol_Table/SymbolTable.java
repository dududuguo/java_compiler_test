package Symbol_Table;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class  SymbolTable {
    private Map<String, Symbol> symbols = new HashMap<>();

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }

    public boolean containsSymbol(String name) {
        return symbols.containsKey(name);
    }

    public Map<String, Symbol> getAllSymbols() {
        return symbols;
    }

    public Set<String> keySet() {
        return symbols.keySet();
    }
}
