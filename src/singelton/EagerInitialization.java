package singelton;

public class EagerInitialization {

    public static EagerInitialization instance=new EagerInitialization();

    //create constructor
    private EagerInitialization(){
    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
