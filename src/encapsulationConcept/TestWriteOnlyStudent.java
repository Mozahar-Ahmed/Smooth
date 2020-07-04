package encapsulationConcept;

public class TestWriteOnlyStudent {
    WriteOnlyStudent wor = new WriteOnlyStudent();
    // System.out.println(wor.getName());//Compile Time Error, because there is no such method
    //System.out.println(wor.name);//Compile Time Error, because the college data member is private.
    //So, it can't be accessed from outside the class
}
