public class Node
{
    public int val;
    public Node next;

    public Node(int val)
    {
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList
{
    private Node head;

    public MyLinkedList()
    {
        head = null;
    }

    public int Get(int index)
    {
        if (index < 0) return -1;
        Node current = head;
        int i = 0;
        while (current != null)
        {
            if (i == index) return current.val;
            current = current.next;
            i++;
        }
        return -1;
    }

    public void AddAtHead(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void AddAtTail(int val)
    {
        Node newNode = new Node(val);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void AddAtIndex(int index, int val)
    {
        if (index < 0) return;
        if (index == 0)
        {
            AddAtHead(val);
            return;
        }

        Node current = head;
        int i = 0;
        while (current != null)
        {
            if (i == index - 1)
            {
                Node newNode = new Node(val);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
            i++;
        }
    }

    public void DeleteAtIndex(int index)
    {
        if (index < 0 || head == null) return;
        if (index == 0)
        {
            head = head.next;
            return;
        }

        Node current = head;
        int i = 0;
        while (current.next != null)
        {
            if (i == index - 1)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            i++;
        }
    }
}
