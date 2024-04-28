package colletions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int choice;
		String novo;    // = "sim";

		

		do {
			
			
			System.out.println("""

					*****************************

					1- Adicionar cliente na fila
					2- Listar todos os clientes
					3- Retirar cliente da fila
					0- Sair

					*****************************
					                          """); 
			System.out.print("Digite uma opção: ");

			choice = leia.nextInt();
			leia.nextLine();

			switch (choice) {

			case 1:
				//if (choice == 1)
				
				do {
					
				System.out.print("\nPor favor, digite o nome do cliente: ");
				
				fila.add(leia.nextLine());
				System.out.println("\nCliente adicionado!");
				
				System.out.println("\nDeseja adicionar mais um nome? \n(\"s\") para sim e (\"n\") para não \n");
				novo = leia.nextLine();
				
				
				} while (novo.equalsIgnoreCase("s"));
				
				if (novo.equalsIgnoreCase("n")) {
				System.out.println("\nLista atualizada:\n");	
				
				for (String lista : fila)
						System.out.println(lista);
				break;
				}	
				break;
				

			case 2:
				if (fila.peek() != null) 
				{
					System.out.println("Lista atual de clientes:\n");
					for (String lista : fila)
						System.out.println(lista);
			    }
				else 
				{
					System.out.println("\nA fila está vazia!");
				}
				break;

			case 3:

				if (fila.peek() != null) {
				System.out.println();
				System.out.println(fila.poll());
				System.out.println("\nCliente foi chamado!");
				}
				else {
					System.out.println("\nA fila está vazia!");
				}
				break;

			case 0:
				System.out.println("\nSistema finalizado!");
				break;

			default:
				System.out.println("\nPor favor, digite uma opção válida!");
				break;

			};
			

		} while (choice > 0);
		
		leia.close();

	}

}
