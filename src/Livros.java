public class Livros {
    String titulo;
    String autor;
    String area;
    String editora;
    String ano;
    String edicao;
    String numFolhas;
    boolean emprestimo;

    public Livros() {
    }

    public Livros(String titulo, String autor, String area, String editora, String ano, String edicao, String numFolhas) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(String numFolhas) {
        this.numFolhas = numFolhas;
    }


    public Livros(boolean emprestimo) {
        setEmprestimo(false);
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", area='" + area + '\'' +
                ", editora='" + editora + '\'' +
                ", ano='" + ano + '\'' +
                ", edicao='" + edicao + '\'' +
                ", numFolhas='" + numFolhas + '\'' +
                '}';
    }

    void abrirLivro(){
        System.out.println("O livro está aberto para leitura!");
    }
    void fecharLivro(){
        System.out.println("O livro está fechado para leitura!");
    }
}
