package states;

import java.util.List;

import ru.gb.course1.lesson2dz.InputSymbol;

public class IntState extends BaseState {
    public IntState(List<InputSymbol> input) {
        this.input.addAll(input);
    }


    @Override
    public BaseState onClickButton(InputSymbol inputSymbol) {
        switch (inputSymbol) {
            case NUM_0:
            case NUM_1:
            case NUM_2:
            case NUM_3:
            case NUM_4:
            case NUM_5:
            case NUM_6:
            case NUM_7:
            case NUM_8:
            case NUM_9:
                input.add(inputSymbol);
                return this;
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

