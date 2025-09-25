package Recursion;

import java.util.ArrayList;

public class mazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathRetDiagonal("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r,c-1);
        return left + right;
    }


    // now print the path and a person can also go diagonally
    // subseq type algo is used in it
    static void path(String p, int r, int c){
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if( r > 1) {
            path(p+'D',r-1, c);
        }
        if( c > 1) {
            path(p+'R',r, c-1);
        }
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if (r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p+'D',r-1,c-1));
        }

        if(r>1){
            list.addAll(pathRetDiagonal(p+'D',r-1, c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(p+'R',r, c-1));
        }

        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c] /*or maze[r][c] == false*/ ){
            return;
        }

        if(r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if(c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }


    // when moving in 4 direction is allowed with obstacle which is represented as 0.
}
