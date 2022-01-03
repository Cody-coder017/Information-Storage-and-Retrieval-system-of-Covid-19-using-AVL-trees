public class AVLTree {

    private class Node{
        int data;
        Node left;
        Node right;
        int height;

        Node(int data){
            this.data=data;
        }
    }
    
    private Node root;

    public void insert(int item){
        this.root =insert(this.root,item);

    }

    private Node insert(AVLTree.Node node, int item) {
        if(node==null){
            Node nn=new Node(item);
            return nn;
        }
        if(item>node.data){
           node.right= insert(node.right,item);
        }
        elseif(item<node.data){
            node.left= insert(node.left,item);
         }
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(AVLTree.Node node) {
        // self work
        String str=" ";
        if(node.left==null){
            str+=".";
        }else{
            str+=node.left.data;
        }

        str+= " => "+node.data+" <= ";

        if(node.right==null){
            str+=".";
        }else{
            str+=node.right.data;
        }

        System.out.println(str);

        display(node.left);
        display(node.right);



    }

    


}
