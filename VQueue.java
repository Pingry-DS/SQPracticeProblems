public class VQueue<E> extends MyList<E> implements Queue<E>{
  private MyList queue;
  public VQueue(){
    queue = new MyList();
  }

  public boolean push(E e){
    queue.add(e);
    return true;
  }

  public E pop(){
    if (queue.size() != 0){
      return (E) queue.remove(0);
    }
    else{
      throw new IndexOutOfBoundsException();
    }

  }

  public boolean isEmpty(){
    return queue.isEmpty();
  }

  public int size(){
    return queue.size();
  }

  public E peek(){
    if (queue.size() != 0){
      return (E) queue.get(0);
    }
    else{
      throw new IndexOutOfBoundsException();
    }
  }
}
