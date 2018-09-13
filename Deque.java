public class Deque {
    final int maxSize ;
    int size;
    public int head, end;
    int[] data;

    public Deque()
    {
        data = new int[maxSize];
        head = 0;
        end = 0;
        size = 0;
    }

    public void push_front(int e)//Добавить (положить) в начало дека новый элемент.Программа должна вывести ok.
    {
        if (size == maxSize)
        {
            System.out.println("Deque is full.");
            return;
        }
        else if (size==0)
        {
            end = head;
            data[head] = e;
            size++;
        }
        else
        {
            head++;
            if (head>=maxSize)
                head = 0;
            data[head] = e;
            size++;
        }
        System.out.println("ok");
    }

    public void push_back(int e)//Добавить (положить) в конец дека новый элемент. Программа должна вывести ok.
    {
        if (size == maxSize)
        {
            System.out.println("Deque is full.");
            return;
        }
        else if (size==0)
        {
            head = end;
            data[end] = e;
            size++;
        }
        else
        {
            end--;
            if (end<0)
                end = maxSize-1;
            data[end] = e;
            size++;
        }
        System.out.println("ok");
    }

    public void clear()//Очистить дек (удалить из него все элементы) и вывести ok
    {
        head = 0;
        end = 0;
        size = 0;
        System.out.println("ok");
    }

    public int size()//Вывести количество элементов в деке.
    {
        return size;
    }

    public int back()//Узнать значение последнего элемента (не удаляя его). Программа должна вывести его значение.
    {
        if (size!=0)
            return data[end];
        else
            return -1;
    }

    public int front()//Узнать значение первого элемента (не удаляя его). Программа должна вывести его значение.
    {
        if (size!=0)
            return data[head];
        else
            return -1;
    }

    public int pop_back()//Извлечь из дека последний элемент. Программа должна вывести его значение.
    {
        if (size!=0)
        {
            int tmp = data[end];
            end++;
            if (end>=maxSize)
                end = 0;
            size --;
            return tmp;
        }
        else
            return -1;
    }

    public int pop_front()//Извлечь из дека первый элемент. Программа должна вывести его значение.
    {
        if (size!=0)
        {
            int tmp = data[head];
            head--;
            if (head<0)
                head = maxSize - 1;
            size --;
            return tmp;
        }
        else
            return -1;
    }
}

    public class task
    {
        static public void main (String[] args) throws IOException
        {
            Deque dq = new Deque();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;

            while((str = br.readLine()) != null)
            {
                String[] inp = str.split(" ");
                if (inp[0].equals("push_front"))
                {
                    dq.push_front(Integer.parseInt(inp[1]));
                }
                else if (inp[0].equals("push_back"))
                {
                    dq.push_back(Integer.parseInt(inp[1]));
                }
                else if (inp[0].equals("pop_back"))
                {
                    System.out.println(dq.pop_back());
                }
                else if (inp[0].equals("pop_front"))
                {
                    System.out.println(dq.pop_front());
                }
                else if (inp[0].equals("front"))
                {
                    System.out.println(dq.front());
                }
                else if (inp[0].equals("back"))
                {
                    System.out.println(dq.back());
                }
                else if (inp[0].equals("size"))
                {
                    System.out.println(dq.size());
                }
                else if (inp[0].equals("clear"))
                {
                    dq.clear();
                }
                else if (inp[0].equals("exit"))
                {
                    System.out.println("bye");
                    br.close();
                    return;
                }
            }
        }
    }
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

