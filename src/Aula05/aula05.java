package Aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco();
        cliente1.setNumConta(120603-1);
        cliente1.setDono("Fábio");
        cliente1.abrirConta("CC");


        ContaBanco cliente2 = new ContaBanco();
        cliente2.setNumConta(17452-2);
        cliente2.setDono("Vitória");
        cliente2.abrirConta("CP");

        cliente1.depositar(100);
        cliente2.depositar(500);



        cliente1.estadoAtual();
        cliente2.estadoAtual();


    }
}
