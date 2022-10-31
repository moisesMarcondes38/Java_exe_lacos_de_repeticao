import java.util.Scanner;

public class exer_lacos_de_repeticao_02 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num, contPar=0, contImpar=0;

        for(int i=1; i <=10; i++) {
            System.out.println("\n Digite o " + i +"número");
            num = ent.nextInt();

            if(num %2 ==0) {
                contPar++;
            }
            if(num % 2 ==1) {
                contImpar++;
            }
        }
        System.out.println("\n Foram digitados "  + contPar  + " números pares ");

        System.out.println("\n Foram digitados "  + contImpar  + " números pares ");
    }
}
