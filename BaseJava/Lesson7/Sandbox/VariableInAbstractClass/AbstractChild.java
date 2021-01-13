package BaseJava.Lesson7.Sandbox.VariableInAbstractClass;

public class AbstractChild extends MyAbstract<String> {
    String storage;

    public static void main(String[] args) {
        AbstractChild abstractChild = new AbstractChild();
        abstractChild.setStorage("Hello");
        System.out.println(abstractChild.getStorage());
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String getStorage() {
        return storage;
    }
}
