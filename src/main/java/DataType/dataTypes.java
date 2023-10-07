package DataType;

import java.util.HashMap;

public class dataTypes {
    HashMap<String, Integer> dataTypes = new HashMap<>();
    private int totalOffset=0;

    public dataTypes() {
        dataTypes.put("int", 4);
        dataTypes.put("char", 1);
        dataTypes.put("bool", 1);
        dataTypes.put("void", 0);
        dataTypes.put("float", 4);
        dataTypes.put("long", 8);
        dataTypes.put("double", 8);
        dataTypes.put("string",0);
        dataTypes.put("int[]", 0);
        dataTypes.put("char[]", 0);
        dataTypes.put("AList", 0);
    }

    public int getDataTypeSize(String dataType) {
        return dataTypes.get(dataType);
    }

    public boolean checkType(String dataType, String type) {
        return dataTypes.containsKey(dataType);
    }

    public int getTotalOffset(){
        return totalOffset;
    }

    public void setTotalOffset(int offset){
        totalOffset += offset;
    }

    public void setOffset(String type, int offset){
        dataTypes.put(type, offset);
    }
}
