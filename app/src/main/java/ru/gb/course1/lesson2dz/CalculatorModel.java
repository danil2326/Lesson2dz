package ru.gb.course1.lesson2dz;

import java.util.ArrayList;
import java.util.List;

import states.BaseState;
import states.SingState;

public class CalculatorModel {
    private BaseState currentState = new SingState();

    public void onClickButton(InputSymbol inputSymbol) {
        BaseState newState = currentState.onClickButton(inputSymbol);
        currentState = newState;
    }

    public List<InputSymbol> getInput () {
        return new ArrayList<>(currentState.getInput());
    }
}
