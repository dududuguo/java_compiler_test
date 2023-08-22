package Symbol_Table;

public class Symbol {
    private String name;
    private String type;
    private String scope;

    private int offset;

    public Symbol(String name, String type, String scope) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}


