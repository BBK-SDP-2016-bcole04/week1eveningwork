/**
 * Created by digibrose on 07/01/2016.
 */
public class Test {

    public static void main (String[] args){

        Stack<Integer> test = new Stack<>();

        Integer n = 3;
        Object m = "to";

        test.push(n);
        test.push(2);
      //  test.push(m);
        //extra line
      //  test.push("to");

        System.out.println(test.pop());
        System.out.println(test.pop());

    //    Stack<String> T2 = new Stack<>();

     //   T2.push("Foo");
     //   T2.push("Bar");

     //   System.out.println(T2.pop());
     //   System.out.println(T2.pop());

    }

}
