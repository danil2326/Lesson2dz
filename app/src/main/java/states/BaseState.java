package states;

import java.util.ArrayList;
import java.util.List;

import ru.gb.course1.lesson2dz.InputSymbol;

abstract public class BaseState {
    protected final List<InputSymbol> input = new ArrayList<>();

    public abstract BaseState onClickButton(InputSymbol inputSymbol);

    public List<InputSymbol> getInput() {
        return new ArrayList<>(input);
    }
}
