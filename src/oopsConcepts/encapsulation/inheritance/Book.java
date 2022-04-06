package oopsConcepts.encapsulation.inheritance;

public class Book extends NewsPaper{

    String readIt(String review){
        return review;
    }

    public static void main(String[] args) {
        Book book=new Book();
      String bookVariable=book.readIt("This is a Nice book.");
        System.out.println(bookVariable);
        book.paper();
    }
}
