import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Valor de a: ");
    int VA = entrada.nextInt();
    while(VA == 0) {
        System.out.println("O valor de 'a' não pode ser 0");
        System.out.println("Por favor, digite um valor diferente de 0");
        VA = entrada.nextInt();
    }
    System.out.println("Valor de b: ");
    int VB = entrada.nextInt();
    System.out.println("Valor de c: ");
    int VC = entrada.nextInt();
    
    double DELTA;
    DELTA = Math.pow(VB, 2) - (4 * VA * VC);
    
    if (DELTA < 0) {
        System.out.println("Não tem raízes reais");
    }else {
        double X1 = (-VB + Math.sqrt(DELTA))/(2 * VA);
        double X2 = (-VB - Math.sqrt(DELTA))/(2 * VA);
        
        System.out.println("O valor de primeira raíz é: " + X1);
        System.out.println("O valor da segunda raíz é: " + X2);
    }
    
    
	}
}
