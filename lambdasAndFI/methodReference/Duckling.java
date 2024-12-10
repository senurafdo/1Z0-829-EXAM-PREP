public class Duckling {
    
    public static void makeSound(String sound){
       
        LearnToSpeak learner02 = new LearnToSpeak() {
            @Override
            public void speak(String sound) {
                System.out.println(sound);
            }
             };

        LearnToSpeak leaner01 = (String s) -> {System.out.println(s);};

        LearnToSpeak learner = s -> System.out.println(s);

        LearnToSpeak learner0 = System.out::println;

        DuckHelper.teacher(sound, learner02);


    }
}
