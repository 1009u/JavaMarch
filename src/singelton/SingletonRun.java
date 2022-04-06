package singelton;

public class SingletonRun {

    public static void main(String[] args) {
      SingletonDemo object= SingletonDemo.getInstance();
      object.ShowSingleton();
    }
}
