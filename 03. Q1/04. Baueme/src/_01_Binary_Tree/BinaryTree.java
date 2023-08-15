package _01_Binary_Tree;

//offizielle Abiturklasse (im 1. Teil - weiter unten ergänzt durch nützliche Methoden!)
public class BinaryTree <ContentType> {
  //innere Klasse (Wurzelknoten)
  private class BTNode {
    private ContentType content;
    private BinaryTree <ContentType> left, right;

    public BTNode(ContentType pContent) {
      content = pContent;
      left = new BinaryTree <ContentType> ();
      right = new BinaryTree <ContentType>();
    }
  }
  //Ende innere Klasse
  
  private BTNode node; //ein Baum besteht aus einer Wurzel (mit Teilbäumen - s.o.)
  
  public BinaryTree() { //Konstruktor 1
    node = null;
  }

  public BinaryTree(ContentType pContent) { //Konstruktor 2
    if (pContent != null) node = new BTNode(pContent); else node = null;
  }

  public BinaryTree(ContentType pContent, BinaryTree <ContentType> pLeftTree, BinaryTree <ContentType> pRightTree) { //Konstruktor 3
    if (pContent != null) {
      node = new BTNode(pContent);
      if (pLeftTree != null) node.left = pLeftTree; else node.left = new BinaryTree <ContentType>();
      if (pRightTree != null) node.right = pRightTree; else node.right = new BinaryTree <ContentType>();
    } else node = null;
  }

  public boolean isEmpty() {
    return node == null;
  }

  public void setContent(ContentType pContent) {
    if (pContent != null){
      node = new BTNode(pContent);
      if (isEmpty()){
        node.left = new BinaryTree <ContentType>();
        node.right = new BinaryTree <ContentType>();
      }
    }

  }

  public ContentType getContent() {
    if (!isEmpty()) return node.content;
    return null;
  }

  public void setLeftTree(BinaryTree <ContentType> pTree) {
    if (!isEmpty() && pTree != null) node.left = pTree;
  }

  public void setRightTree(BinaryTree <ContentType> pTree) {
    if (!isEmpty() && pTree != null) node.right = pTree;
  }

  public BinaryTree <ContentType> getLeftTree() {
    if (!isEmpty()){
      return node.left;
    }
    return null;
  }

  public BinaryTree<ContentType> getRightTree() {
    if (!isEmpty()){
      return node.right;
    }
    return null;
  }
  //Ende offizielle Abiturklasse
  
  //sinnvolle Erweiterungen (für jeden Binärbaum!)



  public String inorder(String inorder_werte) {
    if (node != null){
      return getLeftTree().inorder(inorder_werte) + ;
      //BTNode x = new BTNode((ContentType) node.left);
      //node = node.left;
    }
    /*
    Programmablauf:
    0. Laufe ganz nach unten im linken Teilbaum
    1. Aktuelle Node -> Füge dem inOrder-String hinzu
    2. Gehe hoch zum darüberliegenden Knoten -> Füge dem inOrder-String hinzu
    3. Gehe in den rechten Teilbaum -> Füge dem inOrder-String hinzu
    4. Gehe zur Node über dem Knoten von 3
    5. Wiederhole bei 1.

    Benötigte Befehle: nextNode, previousNode
     */
    //aktuelle node -> Knoten -> rechter Teilbaum -> Node über Knoten => aktuelle node
    //if node != null: leftTree ; inorder_werte.concat(node); node.rightTree
    return inorder_werte;
  }

  public String preorder() {
    return "";
  }
  
  public String postorder() {
    return "";
  }

  /*public String levelorder() {
  //mit Queue - unten eine Version ohne Queue (rekursiv mit 2 Methoden)
    String s;
    Queue q = new Queue();
    s = "";
    q.enqueue(this);
    while (!q.isEmpty()) {
      BinaryTree tree = ((BinaryTree)q.front());
      s = s + tree.getContent() + " ";
      if (!tree.getLeftTree().isEmpty()) {
        q.enqueue(tree.getLeftTree());
      }
      if (!tree.getRightTree().isEmpty()) {
        q.enqueue(tree.getRightTree());
      }
      q.dequeue();
    }
    return s;
  } */

  public String levelorder(){
    String s = "";
    for (int i=1; i<=height(); i++) {
      s = s + giveLevel(this.node, i);
    }
    return s;
  }
  
  public String giveLevel(BTNode root, int level){
    if(isEmpty()){
      return "";
    } else if(level == 1 && root != null) {
      return root.content + " ";
    } else if(level > 1){
      return giveLevel(root.left.node, level-1) + giveLevel(root.right.node, level-1);    
    }
    return "";
  }
  
  public int number() {
    return 0;
  }
  
  public int height() {
    return 0;
  }
}