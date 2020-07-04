package misc;

public class Playable {

  public Playable(){

    }
    //Playable playable=new Playable();
   int i;
   String s;

    public void playing(){// method name may or may not be same as class name.
        System.out.println(i+" "+s);//Static and non-static variables both can be accessed in instance methods.
    }
    public static void research(){
        //System.out.println(i+" "+s);//Non-static (instance) members cannot be accessed in the static context
    }
    public static void main(String[] args) {
        Playable pl=new Playable();
        pl.playing();
        //pl.Playable();


    }



}
