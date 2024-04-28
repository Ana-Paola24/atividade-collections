package colletions;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Stack <String> livro = new Stack<String>();
		String novo;
		int choice;
		
		do {
		
		System.out.println("""
				\n***************************
				
				1 - Adicionar Livro na pilha
				2 - Listar todos os livros
				3 - Retirar livro da pilha
				4 - Verificar se o livro existe na pilha
				0 - O programa deve ser finalizado
				
				***************************
				
				""");
		System.out.print("Digite uma opção: ");
		choice = leia.nextInt();
		leia.nextLine();
	
		switch (choice) {
		  
		case 1:
			
			do {
			System.out.println("\nDigite o nome do livro:\n");
			livro.add(leia.nextLine());
			System.out.println("\nLivro adicionado!\n");
			
			System.out.println("\nDeseja adicionar mais um livro? \n"
					+ "\"s\" para sim e \"n\" para não");
			novo = leia.nextLine();
		    
			} while (novo.equalsIgnoreCase("s"));
			
			System.out.println("\nPilha:\n");
			for (String books : livro)
				System.out.println(books);
			
			break;
			
		case 2:
			if (livro.isEmpty())
			System.out.println("\nA pilha está vazia!");
			
			if (!livro.isEmpty()) {
			System.out.println("\nPilha de livros:\n");
			for (String books : livro) {
				System.out.println(books);
			}
			}
			break;
			
		case 3:
			if (livro.isEmpty())
				System.out.println("\nA pilha está vazia!");
			
			if (!livro.isEmpty()) 
			{
			System.out.println(livro.pop());
			System.out.println("\nUm livro foi retirado da pilha!");
			
			System.out.println("\nPilha:\n");
			for (String books : livro) {
				System.out.println(books);
			}
			}
			
			break;
			
		case 4:
			System.out.print("\nDigite o nome do livro que procura:  ");
		
			if (livro.contains((leia.nextLine())) == true)
			 System.out.println("\nO Livro existe na pilha!\n" );
			else
				System.out.println("\nO Livro não foi encontrado!\n" );
			break;
			
		case 0:
			System.out.println("\nO programa foi finalizado! =)");
		    break;
		    
		default:
			System.out.println("\nDigite uma opção válida! *-* ");
			break;
		
		};
		} while (choice > 0);
		
		leia.close();
	}

}
