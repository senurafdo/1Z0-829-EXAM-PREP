package lambdasAndFI.lambdaExample;

public interface Climb {

    boolean isTooHigh(StringBuilder name, String lname);

    public class Main{
        
        public static void main(String []args){

            check((h,m)-> h.append(m).isEmpty(), new StringBuilder("test"));

            String abc = "abc";
            abc.a
        }

        public static void check(Climb climb, StringBuilder height){
            if(climb.isTooHigh(height, "test")){
                System.out.println("hello");
            }
        }
    }
}

