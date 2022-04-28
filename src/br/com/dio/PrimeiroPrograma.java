package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
      Gato gato = new Gato();

      System.out.println(gato);

        var livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

       /*int a = 5;
       int b = 3;
        System.out.println("Hello World" + (a+b));*/
    }

    static class CLivro {
        private String nome;
        private String numPaginas;

        public void Livro(String nome, int numPaginas) {
            this.nome = nome;
            this.numPaginas = String.valueOf(numPaginas);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(String numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas='" + numPaginas + '\'' +
                    '}';
        }
    }

}


