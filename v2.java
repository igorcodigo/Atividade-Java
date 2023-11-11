class Livro {
   private String titulo;
   private String autor;

   public Livro(String titulo, String autor) {
       this.titulo = titulo;
       this.autor = autor;
   }

class Usuario {
   private String nome;

   public Usuario(String nome) {
       this.nome = nome;
   }

   public String getNome() {
       return nome;
   }

   // Novo método
   public void setNome(String nome) {
       this.nome = nome;
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

   // Novo método
   public Usuario getUsuario() {
       return usuario;
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

   // Novo método
   public Livro getLivro() {
       return livro;
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

   // Novo método
   public void consultarLivrosDisponiveis() {
       // Implementação do método
   }
}

public class Main {
  public static void main(String[] args) {
      // Implementação existente

      saudacao();
  }

  public static void saudacao() {
      System.out.println("Olá, bem-vindo ao sistema da biblioteca!");
  }

  // Novo método
  public static void exibirInformacoes() {
      // Implementação do método
  }
}
