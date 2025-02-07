package aboutString;

public class Main {
    public static void main(String[] args) {

        String name = "Chester";
        String name2 = "Chester";
       // System.out.println("name & name2 : " + name == name2);

        String name3 = name;
       // System.out.println("name & name3 : " + name3 == name);

       // System.out.println("name & name3 : " + name3.equals(name));

        String name4 = "Chester ";
        System.out.println("name & name4 : " + (name == name4.trim()));
//        System.out.println("name & name4 : " + (name4.trim() == name));
        System.out.println("["+name4+"]");
//        System.out.println("name & name4 : " + (name4.trim() == name4.trim()));
//        System.out.println("name4 & name4 : " + (name4 == name4.trim()));
    }
}
