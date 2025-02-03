import java.util.ArrayList;
import java.util.List;

import generics.genericInterfaces.CrateRecords;
import generics.genericInterfaces.Robot;

public class Main {
    public static void main(String[] args) {
    
        Robot  robot = new Robot();
        CrateRecords<Robot> record = new CrateRecords<>(robot);

    }
}