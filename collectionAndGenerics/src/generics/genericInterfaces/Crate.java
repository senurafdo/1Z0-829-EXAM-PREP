package generics.genericInterfaces;

public class Crate <Thing> {

    private Thing contents;
    public Thing lookInCrate(){
        return contents;
    }

    public void packCrate(Thing content){
        this.contents = contents;
    }
}
