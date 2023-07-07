package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramPost {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Faça uma boa viagem!");
        Comment c2 = new Comment("Que boa notícia!");
        Post p1 = new Post(sdf.parse("07/07/2023 10:30:17"), "Viajando para a Itália",
            "Visitarei esse lindo país!", 17);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Boa noite!");
        Comment c4 = new Comment("Qual a boa?");
        Post p2 = new Post(sdf.parse("04/07/2023 20:17:10"), "Boa noite, galera!",
                "Sem nada pra fazer. Alguém indica algo?", 25);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }
}
