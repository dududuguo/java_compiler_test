package Symbol_Table;

import DataType.dataTypes;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Symbol> symbols = new HashMap<>();
    private long totalOffset = 0;
    private dataTypes types = new dataTypes();

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
        totalOffset += types.getDataTypeSize(symbol.getType());
    }

    public long getTotalOffset() {
        return symbols.size() * 8L;
    }

    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }

    public boolean containsSymbol(String name) {
        return symbols.containsKey(name);
    }
}
