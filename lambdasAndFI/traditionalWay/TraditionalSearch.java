package lambdasAndFI.traditionalWay;

import java.util.*; 

public class TraditionalSearch {

    public static void main (String []args){
        // list of animals 
        //can use var here as its a local variable 
        // since its inside a method
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo",true, false));

        //pass class that does check 
       // print(animals, new CheckIfHopper());
        print(animals, a -> !a.canSwim());

    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal: animals){
            //gerneral check 
            if(checker.test(animal)){
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }   
}
