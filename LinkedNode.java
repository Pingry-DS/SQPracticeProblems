public class LinkedNode<T> {
  private Object data;
  private LinkedNode frontPointer;
  public LinkedNode(Object data, LinkedNode frontPointer){
    this.data = data;
    this.frontPointer = frontPointer;
  }
  public LinkedNode(Object data){
    this.data = data;
    frontPointer = null;
  }
  public LinkedNode(){
    data = null;
    frontPointer = null;
  }
  public Object getData(){
    return data;
  }
  public void setData(Object data){
    this.data = data;
  }
  public LinkedNode getNext(){
    return frontPointer;
  }
  public void setNext(LinkedNode newNode){
    frontPointer = newNode;
  }
}
