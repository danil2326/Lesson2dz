package states;

import java.util.List;

import ru.gb.course1.lesson2dz.InputSymbol;

public class ZeroState extends BaseState {
    public ZeroState(List<InputSymbol> input) {
        this.input.addAll(input);
    }

    @Override
    public BaseState onClickButton(InputSymbol inputSymbol) {
        switch (inputSymbol) {
            case OP_DOT:
                input.add(InputSymbol.OP_DOT);
                return new FloatState(input);
            case OP_CLEAR:
                return new SingState();
            default:
                return this;
        }
    }
}

