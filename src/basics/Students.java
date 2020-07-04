package basics;

public class Students {
    int id;
    String name;
    //double height;
    Students(int i,String s){
        id=i;
        name=s;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Students s=new Students(1001, "Rahim");
        Students s1=new Students(1002,"Karim");
        Students s2=new Students(1003,"Habib");
        s.display();
        s1.display();
        s2.display();

    }
  /* public void assign(int i,String s,double f){
        id=i;
       name=s;
       height=f;
        }*/
    /*public void display(){
        System.out.println(id+" "+name+" "+height);

    }*/

}
