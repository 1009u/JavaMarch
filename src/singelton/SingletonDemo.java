package singelton;

public class SingletonDemo {

    private static SingletonDemo instance=new SingletonDemo();

    private SingletonDemo(){} // default constructor


    public static SingletonDemo getInstance() {
        return instance;
    }

    public void ShowSingleton(){

            System.out.println("Today Tea Party Organizer Mr.RituRaj.");
    }
}

