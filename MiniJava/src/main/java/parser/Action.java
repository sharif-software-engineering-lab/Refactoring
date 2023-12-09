package parser;

public class Action {
    private act action;
    //if action = shift : number is state
    //if action = reduce : number is number of rule
    private int number;

    public Action(act action, int number) {
        this.action = action;
        this.number = number;
    }

    public String toString() {
        return getAction().toString() + number;
    }

    public act getAction() {
        return action;
    }

    public int getNumber() {
        return number;
    }
}

enum act {
    shift {
        public String toString(int number) {
            return "acc";
        }
    }, reduce {
        public String toString(int number) {
            return "r" + number;
        }

    }, accept {
        public String toString(int number) {
            return "s" + number;
        }
    }
}
