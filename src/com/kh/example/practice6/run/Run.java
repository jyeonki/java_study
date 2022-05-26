package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

    public static void main(String[] args) {

        Book whitePrincess = new Book(); // new Book() ctrl + p 누르면 필드가 뜬다
        Book theLittleMermaid = new Book("인어공주", "문학동네", "안데르센");
        Book cinderella = new Book("신데렐라", "문학꿈", "샤를 페로", 8000, 20);

        whitePrincess.inform();
        theLittleMermaid.inform();
        cinderella.inform();

        Book b1 = new Book();
        Book b2 = new Book("재밌는책", "좋은출판사", "김작가");
        Book b3 = new Book("노잼책", "나쁜출판사", "박작가", 50000, 0.2);

        b1.inform();
        b2.inform();
        b3.inform();

    }
}
