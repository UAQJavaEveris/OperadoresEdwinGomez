/**
 * @author Edwin
 */

package mx.com.everis.tallerjava.operadores;

public class Operadores {
	static float valor1 = 4;
	static float valor2 = 4;
	
	public static void main(String [] args){
			System.out.println("Relational Operators: \n");

				System.out.println("Valor 1 ("+valor1+") < Valor 2("+valor2+") result: " + (valor1 < valor2) );
				System.out.println("Valor 1 ("+valor1+") <= Valor 2("+valor2+") result: " + (valor1 <= valor2) );
				System.out.println("Valor 1 ("+valor1+") > Valor 2("+valor2+") result: " + (valor1 > valor2) );
				System.out.println("Valor 1 ("+valor1+") >= Valor 2("+valor2+") result: " + (valor1 >= valor2) );
				System.out.println("Valor 1 ("+valor1+") == Valor 2("+valor2+") result: " + (valor1 == valor2) );
				System.out.println("Valor 1 ("+valor1+") != Valor 2("+valor2+") result: " + (valor1 != valor2) + "\n");
			
			System.out.println("Assignment Operators: \n");
			
				System.out.println("Valor 1 ("+valor1+") += Valor 2("+valor2+") result: " + (valor1 += valor2) );
				System.out.println("Valor 1 ("+valor1+") -= Valor 2("+valor2+") result: " + (valor1 -= valor2) );
				System.out.println("Valor 1 ("+valor1+") *= Valor 2("+valor2+") result: " + (valor1 *= valor2) );
				System.out.println("Valor 1 ("+valor1+") /= Valor 2("+valor2+") result: " + (valor1 /= valor2) + "\n");	
			
			System.out.println("Arithmetic Operators: \n");
			
				System.out.println("Valor 1 ("+valor1+") + Valor 2("+valor2+") result: " + (valor1 + valor2) );
				System.out.println("Valor 1 ("+valor1+") - Valor 2("+valor2+") result: " + (valor1 - valor2) );
				System.out.println("Valor 1 ("+valor1+") * Valor 2("+valor2+") result: " + (valor1 * valor2) );
				System.out.println("Valor 1 ("+valor1+") / Valor 2("+valor2+") result: " + (valor1 / valor2) );
				System.out.println("Valor 1 ("+valor1+") % Valor 2("+valor2+") result: " + (valor1 % valor2) );
				
				System.out.print("Valor 1 ("+valor1+") ++ result: ");
				valor1++;
				System.out.println(valor1);
				System.out.print("Valor 2 ("+valor2+") -- result: ");
				valor2--;
				System.out.println(valor2 + "\n");
			
			System.out.println("Logical Operators: \n");
				System.out.println("Valor 1 = " + valor1);
				System.out.println("Valor 2 = " + valor2);
				System.out.println("(Valor 1 == Valor 2 && Valor 1 > Valor 2 && Valor 1 < Valor 2) result: "
						+ (valor1 == valor2 && valor1 > valor2 && valor1 < valor2));
				System.out.println("(Valor 1 == Valor 2 || Valor 1 > Valor 2 || Valor 1 < Valor 2) result: "
						+ (valor1 == valor2 || valor1 > valor2 || valor1 < valor2));
				System.out.println("!(Valor 1 == Valor 2 && Valor 1 > Valor 2 && Valor 1 < Valor 2) result: "
						+ !(valor1 == valor2 && valor1 > valor2 && valor1 < valor2));
		
		
	}

}
