package Chapter_4;

public class Mani {
    public static void main(String[] args) {
        Student vasily = new Student("Vasily", 19, 56.5);
        Student katya =  new Student("Katya", 21, 67.3);

        vasily.increaseGrade(13);
        katya.increaseGrade(7);

        System.out.println(vasily.toString());
        System.out.println(katya.toString());
    }
}
