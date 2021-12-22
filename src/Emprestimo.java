public class Emprestimo {
    String dataEmprestimo;
    String horaEmprestimo;
    Usuarios leitor;
    Livros livro;

    public Emprestimo() {
    }

    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Usuarios leitor, Livros livro) {
        setDataEmprestimo(dataEmprestimo);
        setHoraEmprestimo(horaEmprestimo);
        setLeitor(leitor);
        setLivro(livro);
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Usuarios getLeitor() {
        return leitor;
    }

    public void setLeitor(Usuarios leitor) {
        this.leitor = leitor;

    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;

    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo='" + dataEmprestimo + '\'' +
                ", horaEmprestimo='" + horaEmprestimo + '\'' +
                ", leitor=" + leitor +
                ", livro=" + livro +
                '}';
    }

    void devolverLivro(){
        livro.setEmprestimo(true);
        System.out.println("Livro devolvido!");
    }
}
