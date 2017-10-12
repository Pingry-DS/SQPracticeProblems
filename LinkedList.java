import java.util.List;
public class LinkedList<E> implements SimpleList<E>{
  private LinkedNode start;
  public LinkedList(){
    start = null;
  }
  public int size(){
    if (start == null)
      return 0;
    int units = 1;
    LinkedNode subList = start;
    while (subList.getNext() != null){
      units++;
      subList = subList.getNext();
    }
    return units;
  }

  public boolean isEmpty(){
    if (start.getData() == null && start.getNext() == null){
      return true;
    }
    return false;
  }

  public boolean contains(Object o){
    if (o == null){
      throw new NullPointerException();
    }
    LinkedNode subList = start;
    while (true){
      if (subList.getData().equals(0)){
        return true;
      }
      if (subList.getNext() == null){
        return false;
      }
      subList = subList.getNext();
    }

  }

  public boolean add(E e){
    if (e == null){
      throw new NullPointerException();
    }
    if (start == null){
      start = new LinkedNode(e);
      return true;
    }
    LinkedNode newNode = new LinkedNode(e);
    LinkedNode subList = start;
    boolean check = true;
    while (check){
      if (start.getNext() == null){
        start.setNext(newNode);
        start = subList;
        return true;

      }
      start = start.getNext();
    }
    return true;
  }

  public boolean remove(Object o){
    if (o == null){
      throw new NullPointerException();
    }
    LinkedNode subList = start;
    LinkedNode before;
    if (!this.contains(o)){
      return false;
    }
    while (subList.getNext() != null){
      before = subList;
      if (subList.getData().equals(o)){
        before.setNext(subList.getNext());
      }

      subList = subList.getNext();
    }
    start = subList;
    return true;
  }

  public void clear(){
    LinkedNode newStart = new LinkedNode();
    start = newStart;
  }

  public boolean equals(Object o){
    if (o instanceof List){
      List<E> p = (List<E>) o;
      if (p.size() == this.size()){
        for (int n = 0; n < p.size(); n++){
          if (!p.get(n).equals(this.get(n))){
            return false;
          }
        }
        return true;
      }
    }
    return true;
  }

  public E get(int index){
    if (index < 0 || index > this.size() || start == null){
      throw new IndexOutOfBoundsException();
    }
    LinkedNode subList = start;
    int n = 0;
    while (index != n){
      subList = subList.getNext();
      n++;
    }
    return (E) subList.getData();
  }


  public E set(int index, E element){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    if (element == null)
      throw new NullPointerException();
    LinkedNode subList = start;
    if (index == 0){
      LinkedNode newNode = new LinkedNode(element, start);
      Object old = start;
      start = newNode;
      return (E) old;
    }
    while (index >= 0){
      subList = subList.getNext();
      index--;
    }
    LinkedNode old = start;
    subList.setData(element);
    start = subList;
    return (E) old;


  }

  public void add(int index, E element){
    if (element == null)
      throw new NullPointerException();
    if (index < 0 || index > this.size()){
      throw new IndexOutOfBoundsException();
    }
    if (start == null){
      start = new LinkedNode(element);
    }
    LinkedNode subList = start;
    LinkedNode newNode = new LinkedNode(element);
    int n = 0;
    while (index != n){
      subList = subList.getNext();
      n++;
    }
    if (subList.getNext() != null){
      LinkedNode next = subList.getNext();
      newNode.setNext(next);
      subList.setNext(newNode);
      start = subList;
    }
    else{
      start.setNext(newNode);
    }
  }

  public E remove(int index){
    if (index < 0 || index >= this.size()){
      throw new IndexOutOfBoundsException();
    }
    LinkedNode subList = start;
    LinkedNode before = new LinkedNode();
    subList = (LinkedNode) get(index);
    before.setNext(subList.getNext());
    start = subList;
    return (E) subList;
  }

  public int indexOf(Object o){
    for (int n = 0; n < this.size(); n++){
      if (o.equals(this.get(n))){
        return n;
      }
    }
    return -1;
  }




}
