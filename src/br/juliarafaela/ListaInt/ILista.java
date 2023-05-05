package br.juliarafaela.ListaInt;

public interface ILista {
	public boolean isEmpty();
	public int size();
	public void addFirst(Object valor);
	public void addLast(Object valor) throws Exception;
	public void add(Object valor, int pos) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int pos) throws Exception;
	public Object get(int pos) throws Exception;
	
}
