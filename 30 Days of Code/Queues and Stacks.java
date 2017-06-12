public class Solution {
    // Write your code here.
    Stack c=new Stack();
//    Queue q=new Queue();
    
    void pushCharacter(char ch)
        {
        c.push(ch);
        }
  
    char popCharacter()
        {
        char a=(char)c.pop();
        return a;
        
    }
    
     private LinkedList list = new LinkedList();

  public void enqueueCharacter(char item) {
    list.addLast(item);
  }

  public char dequeueCharacter() {
    return (char)list.poll();
  }
