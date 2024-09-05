public class Operadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean verifica = numero1 == numero2;
        System.out.println("São iguais?" + verifica);

        verifica = numero1 != numero2;
        System.out.println("São diferentes?" + verifica);

        String nome1 = "Lara";
        String nome2 = "Lara";
        System.out.println(nome1 == nome2); //compara o valor 

        String nomeUm = "Lara";
        String nomeDois = new String("Lara");
        System.out.println(nomeUm.equals(nomeDois)); //compara os objetos, mais recomendado

    } 
}
