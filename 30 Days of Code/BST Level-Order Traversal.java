static void levelOrder(Node root){
      //Write your code here
    
    printLevelOrder(root);
    
    
      
    }
static void printLevelOrder(Node root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

static int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
           
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
static void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }


















