package exceptions;

public class UncheckedAirthmaticExcep {

    int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        UncheckedAirthmaticExcep obj=new UncheckedAirthmaticExcep();
        obj.divide(8,0);  //it will show AirthmeticException
    }
}
