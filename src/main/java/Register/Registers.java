package Register;

import java.util.*;

public class Registers {
    private Stack<String> availableRegisters = new Stack<>();
    private Map<String, String> variableToRegisterMap = new HashMap<>();
    private List<String> usedRegisters = new ArrayList<>();

    public Registers() {
        initializeAvailableRegisters();
    }

    private void initializeAvailableRegisters() {
        Collections.addAll(availableRegisters,
                "%rax", "%rbx", "%rcx", "%rdx",
                "%rsi", "%rdi", "%r8", "%r9",
                "%r10", "%r11", "%r12", "%r13", "%r14", "%r15");
    }

    public String allocateRegisterForVariable(String variableName) {
        if (variableToRegisterMap.containsKey(variableName)) {
            return variableToRegisterMap.get(variableName);
        }
        if (availableRegisters.isEmpty()) {
            throw new RuntimeException("Out of registers!");
        }
        String register = availableRegisters.pop();
        variableToRegisterMap.put(variableName, register);
        usedRegisters.add(register);
        return register;
    }

    public void freeRegisterOfVariable(String variableName) {
        String register = variableToRegisterMap.remove(variableName);
        if (register != null) {
            usedRegisters.remove(register);
            availableRegisters.push(register);
        }
    }

    public String getLastUsedRegister() {
        return usedRegisters.isEmpty() ? null : usedRegisters.get(usedRegisters.size() - 1);
    }

    public String getPreviousUsedRegister() {
        int size = usedRegisters.size();
        return size < 2 ? null : usedRegisters.get(size - 2);
    }

    public void freeRegister(String register) {
        availableRegisters.push(register);
        usedRegisters.remove(register);
    }
}
