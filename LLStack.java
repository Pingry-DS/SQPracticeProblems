public class LLStack<E> extends LinkedList<E> implements Stack<E>{
  private LinkedList stack;
  public LLStack(){
    stack = new LinkedList();
  }

  public boolean push(E e){
    stack.add(stack.size(), e);
    return true;
  }

  public E pop(){
    if (stack.size() != 0){
      return (E) stack.remove(stack.size());
    }
    else{
      throw new IndexOutOfBoundsException();
    }

  }

  public boolean isEmpty(){
    return stack.isEmpty();
  }

  public int size(){
    return stack.size();
  }

  public E peek(){
    if (stack.size() != 0){
      return (E) stack.get(stack.size());
    }
    else{
      throw new IndexOutOfBoundsException();
    }
  }
}
