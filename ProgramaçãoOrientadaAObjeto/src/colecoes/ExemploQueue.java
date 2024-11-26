package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
	public static void main(String[] args) {
		Queue<String> pedidos = new LinkedList<>();
		pedidos.add("Novo");
		pedidos.offer("Pedido 2");
		System.out.println(pedidos.peek());
		System.out.println(pedidos.poll());
		
	}

}
