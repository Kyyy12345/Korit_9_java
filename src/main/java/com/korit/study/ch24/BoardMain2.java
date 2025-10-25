package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class BoardMain2 {
    public static void main(String[] args) {
        List<Board> board1 = new ArrayList<>();
        board1.add(new Board());
        board1.get(0).setTitle("제목1");
        board1.get(0).setWriter(new Writer("김준일", 32));
        board1.get(0).setContent("게시판내용");
        board1.get(0).setComments(new ArrayList<>());


        /// //////////////////////////////////////////////////////////

        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment(new Writer("김준오", 35), "댓글 내용1"));
        comments2.add(new Comment(new Writer("김준육", 36), "댓글 내용2"));

        Board board2 = new Board("게시판 제목2",
                new Writer("김준사", 34),
                "게시판 내용2",
                comments2);

        boards.add(board2);

        System.out.println(boards);
        //변경
    }
}












