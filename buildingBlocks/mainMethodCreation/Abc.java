package buildingBlocks.mainMethodCreation;
/**
 * to run without compiling 
 * java Abc.java "something something2" something
 * ex: java Abc.java "jeanne boy" scott
 */
public class Abc {
    public static void main(String Options[]){
        System.out.println("Hello World " + Options[0]);
        System.out.println("Hello World " + Options[1]);
    }
}
