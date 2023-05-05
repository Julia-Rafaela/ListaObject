package view;

import br.juliarafaela.ListaInt.Lista;

public class main {
	public static void main(String[] args) {
	Lista lista = new Lista();
	try {
		lista.addFirst(1);
		lista.addLast(2);
		lista.add(10, 1);
		lista.add(50, 3);
		lista.addFirst(500);
		Object valor = (int) lista.get(2);
		System.out.println(valor);
		lista.removeFirst();
		lista.removeLast();
		lista.remove(1);
		valor = lista.get(0);
		System.out.println(valor);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}


