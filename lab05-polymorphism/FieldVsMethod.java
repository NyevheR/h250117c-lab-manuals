// Lab 5 - Intermediate 2: through a PARENT variable, methods follow the real object but fields do not
class Parent {
    String label = "parent field";

    String who() {
        return "parent method";
    }
}

class Child extends Parent {
    String label = "child field";       // hides the parent's field, does not replace it

    @Override
    String who() {
        return "child method";
    }
}

public class FieldVsMethod {
    public static void main(String[] args) {
        Parent p = new Child();         // parent variable, child object

        System.out.println(p.who());    // method: decided by the OBJECT (Child)
        System.out.println(p.label);    // field:  decided by the VARIABLE type (Parent)
    }
}
