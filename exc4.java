package entities;

import java.util.Date;

public class exc4 {
    public static void main(String[] args) {

        LivroBilhioteca livro = new LivroBilhioteca();
        livro.nome = "Game of thrones";
        livro.anoLancamento = 1995;
        livro.autor = "George r.r Martin";
        livro.paginas = 800;
        livro.isbn = 23213;
        livro.emprestado=true;
        livro.dataEntrega=new Date();
        livro.emprestadoA="Marcos";

        System.out.println(livro.nome);
        System.out.println(livro.anoLancamento);
        System.out.println(livro.autor);
        System.out.println(livro.isbn);
        System.out.println(livro.paginas);
        System.out.println(livro.emprestadoA);
        System.out.println(livro.dataEntrega);
    }
}
