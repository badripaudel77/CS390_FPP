package edu.miu.badripaudel.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);

        Board board1 = new Board(100.04444d, 200.2344444d, "White");

        Board board2 = new Board(100.04444d, 200.2344444d, "Black");
        Board board3 = new Board(100.04444d, 200.2344444d, "Yellow");
        Board board4 = new Board(100.04444d, 200.2344444d, "Blue");

        System.out.println(board1);

        double area = board1.area();
        double perimeter = board1.perimeter();

        //System.out.println("Area : " + area);
        //System.out.println("Perimeter : " + perimeter);

        System.out.printf("Area : %.3f\n", area);
        System.out.printf("Perimeter : %.2f", perimeter);

        //board1.setColor("Black");
        System.out.println("\nUpdate color: " + board1.getColor());

        board1.setHeight(200.34);
        board1.setWidth(300.56);
        System.out.println("\nUpdate Height: " + board1.getHeight() + " and update width : " + board1.getWidth());

        Board[] boards = new Board[5];
        boards[0] = board;
        boards[1] = board1;
        boards[2] = board2;
        boards[3] = board3;
        boards[4] = new Board();
        System.out.println(Arrays.toString(boards));

        for (Board b: boards) {
            if(b.getColor().equals("White")) {
                System.out.println("white board = " + b);
            }
        }

        getPerimeterGreaterThan(boards, 75.00);
    }

    public static double computeArea(Board[] boards) {
        double area = 0.0;
        if(boards == null || boards.length < 1) {
            return area;
        }
        for (Board board : boards) {
            area += board.area();
        }
        return area/boards.length;
    }

    // return the boards with collection has > 75 of Perimeter
    public static Board[] getPerimeterGreaterThan(Board[] boards, double greaterThan) {
        int count = 0;
        if(boards == null || boards.length < 1) {
            return null;
        }
        for(Board board: boards) {
            if(board.perimeter() >greaterThan) {
                count++;
            }
        }
        Board[] greaterThanLimit = new Board[count];
        int index = 0;
        for (Board board : boards) {
            if (board.perimeter() > greaterThan) {
                greaterThanLimit[index++] = board;
            }
        }
        System.out.println("\n\nGreater than 75" + Arrays.toString(greaterThanLimit));
        return greaterThanLimit;
    }
}
