package generics.genericInterfaces;

public record CrateRecords <T>(T contents) {

    @Override
    public T contents() {
       if (contents == null)
          throw new IllegalStateException("missing contents");
       return contents; 
    }
}
