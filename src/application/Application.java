package application;

import java.util.Locale;
import java.util.Scanner;

import controller.ClienteController;
import controller.PedidoController;
import controller.PratoController;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClienteController clienteController = new ClienteController();
		PratoController pratoController = new PratoController();
		PedidoController pedidoController = new PedidoController();
		
		int opcao = 0;
		
		do 
		{
			System.out.println("\n**************  RESTAURANTE DOS GURI  **************\n\n"
					+ "1 - CADASTRAR PRATO" + "\n2 - CADASTRAR CLIENTE" + "\n3 - CADASTRAR PEDIDO" +"\n4 - LISTAR PRATOS" 
					+ "\n5 - LISTAR CLIENETS" + "\n6 - LISTAR PEDIDOS" + "\n7 - ENVIAPEDIDO" + "\n8 - PR?XIMO PEDIDO" + "\n9 - PESQUSAER PEDIDO" + "\n0 - SAIR");
			System.out.print("Informe a op??o desejada: ");
			opcao = sc.nextInt();
			
			
			if(opcao == 1) {
				System.out.println("Informe os dados do novo prato");
				sc.nextLine();
				System.out.print("Nome: ");
				String nome  = sc.nextLine();
				System.out.print("Preco: ");
				Double preco  = sc.nextDouble();
				sc.nextLine();
				System.out.print("Descricao: ");
				String desc  = sc.nextLine();
				pratoController.cadastraPrato(nome, preco, desc);
			}
			
			if (opcao == 2) {
				System.out.println("Informe os dados do novo cliente");
				System.out.print("Nome: ");
				sc.nextLine();
				String nome  = sc.nextLine();
				System.out.print("cpf: ");
				Integer cpf  = sc.nextInt();
				System.out.print("Fone: ");
				Integer fone  = sc.nextInt();
				clienteController.cadastraCliente(nome, cpf, fone);
			}
			
			if (opcao == 3) {
				System.out.println("Informe os dados para um novo pedido\n");
				System.out.println("Num pedido: ");
				Integer num = sc.nextInt();
				sc.nextLine();
				System.out.println("Nome cliente: ");
				String nomeCliente = sc.nextLine();
				System.out.println("Nome prato: ");
				String nomeprato = sc.nextLine();
				pedidoController.cadastraPedido(num, nomeprato, nomeCliente);
			}
			
			if (opcao == 4) {
				System.out.println(pratoController.mostrarListaPratos());
			}
			
			if (opcao == 5) {
				System.out.println(clienteController.mostraListaClientes());
			}
			
			if (opcao == 6) {
				System.out.println(pedidoController.listarPedidos());
			}
			
			if (opcao == 7) {
				
				System.out.println("\nPedido " + pedidoController.enviaPedido() + "<  enviado com sucesso!\n");
			}
			
			if (opcao == 8) {
				
				System.out.println("\nProximo pedido\n" + pedidoController.mostrarProximoPedido()+ "\n");
			}
			
			if (opcao == 9) {
				System.out.println("Informe dados: ");
				System.out.print("numero do pedido a ser pesquisado: ");
				int valor = sc.nextInt();
				pedidoController.buscarPedido(valor);
			}
			
		} while (opcao != 0);
		
		sc.close();
	}
}