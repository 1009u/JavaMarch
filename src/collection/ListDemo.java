package collection;


public class ListDemo {
    //String
    public void fruits(){
        String [] fruits_Name= {"Mango","Banana","Apple"};

        for (String names:fruits_Name){
            System.out.println(names);
        }


    }
    public static void main(String[] args) {
        ListDemo obj= new ListDemo();
        obj.fruits();
    }
}
