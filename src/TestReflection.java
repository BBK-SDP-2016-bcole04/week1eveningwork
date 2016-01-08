/**
 * Created by digibrose on 07/01/2016.
 */
public class TestReflection {

    public static void main(String[] args) {
        MyClass T = new MyClass();
        System.out.println(T);

    }

}

class MyClass{
    @Override
    public String toString(){
        return "I am a " + this.getClass().getName();
    }

}
