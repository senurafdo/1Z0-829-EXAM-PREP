package generics.genericInterfaces;

public class Robot {

    private String name;


    public static void main(String[] args) {
        
        Robot joeBot = new Robot();
        Crate<Robot> roboCrate = new Crate<>();
        roboCrate.packCrate(joeBot);

        

    }
}
