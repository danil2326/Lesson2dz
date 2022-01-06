package ru.gb.course1.lesson2dz;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModel {
    private List<InputSymbol> input = new ArrayList<>();

    public void onClickButton(InputSymbol inputSymbol) {
        if (inputSymbol == InputSymbol.OP_CLEAR) {
            input.clear();}
        if (hasDot() && inputSymbol == InputSymbol.OP_DOT) {
            return;
        }

        input.add(inputSymbol);

        return;
    }

    private boolean hasDot() {
        for (InputSymbol inputSymbol : input) {
            if (inputSymbol == InputSymbol.OP_DOT){
                return true;
            }
        }
        return false;
    }

    public List<InputSymbol> getInput () {
        return new ArrayList<>(input);
    }
}
