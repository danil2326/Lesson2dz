package states;

import ru.gb.course1.lesson2dz.InputSymbol;

public class SingState extends BaseState{
    @Override
    public BaseState onClickButton(InputSymbol inputSymbol) {
        switch (inputSymbol) {
            case OP_MINUS:
                input.add(InputSymbol.OP_MINUS);
                return new FirstIntState(input);
            case OP_PLUS:
                return this;
            case OP_DOT:
                input.add(InputSymbol.NUM_0);
                input.add(InputSymbol.OP_DOT);
                return new FloatState(input);
            case NUM_0:
                input.add(InputSymbol.NUM_0);
                return new ZeroState(input);
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
                return new IntState(input);
            case OP_CLEAR:
                return new SingState();
            default:
                return this;
        }
    }
    }

