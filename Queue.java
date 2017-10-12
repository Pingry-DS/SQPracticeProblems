public interface Queue<E>{
  public boolean push(E e);

  public E pop();

  public boolean isEmpty();

  public int size();

  public E peek();
}
