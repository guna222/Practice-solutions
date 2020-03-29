public class BinaryTreeTraverse
{
    public static class Tree
    {
        int data;
        Tree left;
        Tree right;

        public Tree(int data)
        {
            this.data = data;
        }

    }

    static void preorder(Tree rootnode)
    {
        if (rootnode != null)
        {
        System.out.printf("%d ", rootnode.data);
        preorder(rootnode.left);
        preorder(rootnode.right);
        }
    }

    public static void main(String[] args)
    {
        Tree rootnode = new Tree(40);
        Tree node20 = new Tree(20);
        Tree node10 = new Tree(10);
        Tree node30 = new Tree(30);
        Tree node60 = new Tree(60);
        Tree node50 = new Tree(50);
        Tree node70 = new Tree(70);

        rootnode.left = node20;
        rootnode.right = node60;

        node20.left = node10;
        node20.right = node30;
        node60.left = node50;
        node60.right = node70;

        preorder(rootnode);
    }

}
