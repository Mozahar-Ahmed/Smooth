package misc;

public class Testable {
    public static void main(String[] args) {
        Playable.research();
        //Playable.main();
        //Playable.class
        Playable playable=new Playable();
        playable.playing();
        System.out.println(playable.i);
        System.out.println(playable.s);

    }
}
