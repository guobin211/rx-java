package linklist;

/*
 * MainQueue
 * @Author guobin201314@gmail.com on 2019-06-14 22:27
 */
public class MainLinked {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.shift(i);
        }
        linkedList.addFirst(5);
        linkedList.add(2, 666);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        int f2 = linkedList.delete(0);
        System.out.println(linkedList);
        int last =  linkedList.removeLast();
        System.out.println(linkedList);
    }
}
