package lambdasAndFI.lambdaExample;

public class Main {

    public static void main(String[] args) {
        // 01 
        HelloWorld hello = new HelloWorld();
        hello.sayHello();

        //02
        Greetings greeting = new HelloWorld();
        greeting.sayHello();

        //03
        Greetings greeting02 = new Greetings() {
            @Override
            public void sayHello(){
                System.out.println("Hello World");
            }
        };

        //04
        Greetings greeting03 = ()-> {System.out.println("Hello World");};
        greeting03.sayHello();

        //05
        Greetings greeting04 = System.out::println;
        greeting04.sayHello();

    }
}
