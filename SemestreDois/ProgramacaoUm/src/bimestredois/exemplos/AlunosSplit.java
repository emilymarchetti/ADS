package bimestredois.exemplos;

public class AlunosSplit {
    public static void main(String[] args) {

        String alunos = "Aluno:Agata:Aluno:Magali;Analista;Programador;Tester";
        String[] alunosSeparado;

        alunosSeparado = alunos.split(";")[0].split(":");
        for (String word: alunosSeparado) {
                System.out.println(word);
        }


    }
}
