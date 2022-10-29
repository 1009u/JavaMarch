package collection;


import model.Board;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Board> boards=new ArrayList<>();
        Board board1=new Board("Garish",2300);
        Board board2=new Board("Thompson",1200);
        // we will add boards
        boards.add(board1);
        boards.add(board2);

        //get by for loop
        for (Board list: boards){
            System.out.println("Brand of Board :"+list.getBrand());
            System.out.println("Price of Board :"+list.getPrice());
        }


    }
}
