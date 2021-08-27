 import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	  String NomeProd = leitor.nextString(); 
	  float PrecoProd = leitor.nextFloat();
	   int QuantProd = leitor.nextInt();
	    
	   if (QuantProd <= 10) {
	        System.out.println("O preço total do " + NomeProd + "é: " + PrecoProd);
	    }
	    
	   if (11 <= QuantProd <= 20) {
	   float Desconto10 = (PrecoProd * 10) / 100;
	 System.out.println("Você recebeu um desconto de 10%, o preço total do " + NomeProd + "é: " + Desconto10);
	    }
	    
	  if (21 <= QuantProd <= 50) {
	  float Desconto20 = (PrecoProd * 20) / 100;
	  System.out.println("Você recebeu um desconto de 20%, o preço total do " + NomeProd + "é: " + Desconto20);
	    }
	    
	    if (QuantProd > 50) {
	    float Desconto25 = (PrecoProd * 25) / 100;
	 System.out.println("Você  recebeu um desconto de 25%, o preço total do " + NomeProd  + "é: " + Desconto25);
	    }
	    
		
	}
}