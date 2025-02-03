package generics.genericInterfaces;

public class Elepahant {

  public static void main(String[] args) {

    Elepahant elepahant = new Elepahant(); // Elephant object 
    Crate<Elepahant> crateForElephant = new Crate<>(); 
 
    crateForElephant.packCrate(elepahant);
 
    Elepahant inNewHome = crateForElephant.lookInCrate();


    Elepahant elepahant2 = new Elepahant();
    Integer numPound = 15_000; 

    SizeLimitedCrate<Elepahant, Integer> c1 
    = new SizeLimitedCrate<Elepahant,Integer>(elepahant2, numPound);
  }
}
