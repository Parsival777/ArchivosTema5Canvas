package ArchivosTema5;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        System.out.println("Insertando elementos en la cola de prioridad...");

        queue.push(3, "Tarea media");
        queue.push(1, "Tarea urgente");
        queue.push(5, "Tarea baja prioridad");
        queue.push(2, "Tarea importante");

        
        queue.show();

        System.out.println("\nExtrayendo elementos con pop():");
        
        while (!queue.isEmpty()) {
            System.out.println("Pop: " + queue.pop());
        }

        System.out.println("\nEstado final de la cola:");
        queue.show();
    }
}
