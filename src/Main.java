public class Main {
    public static void main(String[] args) {
        Employee rajuKumar = new Employee("Raju", "Kumar", 1990);
        Employee anjulaWati = new Employee("Anjula","Wati", 1964);

        QueueArray queue = new QueueArray(10);
        queue.add(rajuKumar);
        queue.add(anjulaWati);

        System.out.print("The queue has: ");
        queue.printQueue();

        System.out.print("The first item is: ");
        queue.peek();

        System.out.print("After removing: ");
        queue.remove();
        queue.printQueue();
    }
}
