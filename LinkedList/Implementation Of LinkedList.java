class Node{
    int data;
    Node next;
}
class Linked{
public Node createnewNode(int val){
    Node a=new Node();
    a.data=val;
    a.next=null;
    return a;
}
public Node insert(Node node,int val){
    if(node==null){
        return createnewNode(val);
    }else{
        node.next=insert(node.next,val);
    }
    return node;
}
public Node insertAtfront(Node node,int val){
    Node a=createnewNode(val);
    a.next=node;
    return a;
}
public void printlist(Node node){
    while(node!=null){
        System.out.println(node.data);
        node=node.next;
    }
}
public Node insertAtpos(Node node,int pos,int val){
    if(pos==1){
        Node a=createnewNode(val);
        a.next=node;
        return a;
    }
    node.next=insertAtpos(node.next,pos-1,val);
    return node;
}
public void delete(Node node){
    Node temp=node;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
}
public Node deletefront(Node node){
    return node.next;
}
public Node deleteAtpos(Node node,int pos){
    if(pos==1){
        return node.next;
    }
    node.next=deleteAtpos(node.next,pos-1);
    return node;
}
public int count(Node node){
    int count=0;
    while(node!=null){
        count++;
        node=node.next;
    }
    return count;
}
}
class Main {
    public static void main(String[] args) {
      Node root=null;
      Linked a=new Linked();
      root=a.insert(root,5);
      root=a.insert(root,10);
      root=a.insert(root,15);
      root=a.insert(root,20);
      root=a.insert(root,25);
      a.printlist(root);
      System.out.println("After inserting at front");
      root=a.insertAtfront(root,3);
      a.printlist(root);
      root=a.insertAtpos(root,4,18);
      System.out.println("After inserting at 3");
      a.printlist(root);
      a.delete(root);
      System.out.println("After deleting ");
      a.printlist(root);
      System.out.println("Size: "+a.count(root));
      root=a.deletefront(root);
      System.out.println("After deleting ");
      root=a.deleteAtpos(root,3);
      a.printlist(root);
      System.out.println("Size: "+a.count(root));
    }
}
