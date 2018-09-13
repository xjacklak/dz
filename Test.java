import java.util.Stack;
public class Test{
        public static void main(String[] args)
        {

            String word =("Geekbrains");
            Stack s = new Stack();

            int count=0;
            char array[] = word.toCharArray();

            for(int i=0;i<array.length;i++){
                char val = array[i];
                s.push(val);
            }

            String res ="";
            while (!s.empty())
                res +=s.pop();
            System.out.println("Reverse string: " + res);

        }
    }