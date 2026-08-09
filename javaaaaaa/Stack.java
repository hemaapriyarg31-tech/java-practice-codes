public class Stack {

  int[] stack;
  int top;
  int size;

  // Constructor
  Stack(int size){
    this.size = size;
    stack = new int[size];
    top = -1;
  }

  // PUSH
  void push(int a){
    if(top == size - 1){
      System.out.println("Stack Overflow");
    } else {
      stack[++top] = a;
    }
  }

  // POP
  int pop(){
    if(top == -1){
      System.out.println("Stack Underflow");
      return -1;
    } else {
      return stack[top--];
    }
  }

  // DISPLAY
  void display(){
    for(int i = top; i >= 0; i--){
      System.out.print(stack[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Stack s = new Stack(5);

    s.push(10);
    s.push(20);
    s.push(30);

    s.display();   // 30 20 10

    System.out.println("Popped: " + s.pop());
    s.display();
  }
}