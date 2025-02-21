package practisePapers.week01_paper02;

public class Wash <T> {

    T item;
    public void clean(T item){
        System.out.println("clean"+ item);
    }

    public static void main(String[] args) {


        Wash<String> wash01 = new Wash<String>();
        Wash<String> wash02 = new Wash<>();
        var wash03 = new Wash<String>();
    }


}
