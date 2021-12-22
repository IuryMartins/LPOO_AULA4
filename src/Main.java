public class Main {
    public static void main(String[] args) {
        Livros l = new Livros("JAVA FOR DUMMIES","Pedro","Programação","Abril","01/01/01","45","230");
        Usuarios u = new Usuarios("João",30,"MASCULINO","0800642822");
        Emprestimo e = new Emprestimo();
            e.setLeitor(u);
            e.setLivro(l);
            e.setDataEmprestimo("19/10/2021");
            e.setHoraEmprestimo("10:00");

        System.out.println("-----EMPRESTIMO-----");
        System.out.println("LIVRO: " + e.getLivro().getTitulo() );
        System.out.println("USUARIO: " + e.getLeitor().getNome() );
        System.out.println("DATA: " + e.getDataEmprestimo() );
        l.abrirLivro();
        u.lerLivro();
        l.fecharLivro();
        e.devolverLivro();


    }
}
