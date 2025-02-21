package constructorReference;

public class MyTestClass implements EmptyStringCreater{

    @Override
    public String create() {
        return new String();
    }




}
