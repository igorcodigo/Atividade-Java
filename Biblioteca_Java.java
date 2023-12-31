class Livro {
   private String titulo;
   private String autor;

   public Livro(String titulo, String autor) {
       this.titulo = titulo;
       this.autor = autor;
   }

   public String getTitulo() {
       return titulo;
   }

   public String getAutor() {
       return autor;
   }
}

class Usuario {
   private String nome;

   public Usuario(String nome) {
       this.nome = nome;
   }

   public String getNome() {
       return nome;
   }
}

class Emprestimo {
   private Usuario usuario;
   private Livro livro;

   public Emprestimo(Usuario usuario, Livro livro) {
       this.usuario = usuario;
       this.livro = livro;
   }

   public void emprestar() {
       System.out.println(usuario.getNome() + " emprestou o livro " + livro.getTitulo());
   }
}

class Devolucao {
   private Usuario usuario;
   private Livro livro;

   public Devolucao(Usuario usuario, Livro livro) {
       this.usuario = usuario;
       this.livro = livro;
   }

   public void devolver() {
       System.out.println(usuario.getNome() + " devolveu o livro " + livro.getTitulo());
   }
}

class Biblioteca {
   public void emprestarLivro(Usuario usuario, Livro livro) {
       Emprestimo emprestimo = new Emprestimo(usuario, livro);
       emprestimo.emprestar();
   }

   public void devolverLivro(Usuario usuario, Livro livro) {
       Devolucao devolucao = new Devolucao(usuario, livro);
       devolucao.devolver();
   }
}

public class Main {
  public static void main(String[] args) {
      Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
      Usuario usuario1 = new Usuario("João");

      Biblioteca biblioteca = new Biblioteca();
      biblioteca.emprestarLivro(usuario1, livro1);
      biblioteca.devolverLivro(usuario1, livro1);

      saudacao();
  }

  public static void saudacao() {
      System.out.println("Olá, bem-vindo ao sistema da biblioteca!");
  }
}
