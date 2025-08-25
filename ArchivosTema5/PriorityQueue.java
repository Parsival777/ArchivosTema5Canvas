package ArchivosTema5;

public class PriorityQueue<T> {
    private PriorityNode<T>[] data;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public PriorityQueue() {
        capacity = 10;
        data = new PriorityNode[capacity + 1]; // índice 1-based para heap
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void resizeIfNeeded() {
        if (size >= capacity - 1) {
            capacity *= 2;
            PriorityNode<T>[] newData = new PriorityNode[capacity + 1];
            for (int i = 1; i <= size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public void push(int priority, T value) {
        resizeIfNeeded();
        PriorityNode<T> nodeToInsert = new PriorityNode<>(priority, value);
        this.size++;
        if (size == 1) {
            data[1] = nodeToInsert;
            return;
        }
        int pos = size;
        data[pos] = nodeToInsert;
        // Percolar hacia arriba (min-heap por prioridad)
        while (pos > 1) {
            int parent = pos / 2;
            if (data[parent].getPriority() <= data[pos].getPriority()) break;
            PriorityNode<T> tmp = data[parent];
            data[parent] = data[pos];
            data[pos] = tmp;
            pos = parent;
        }
    }

    public T pop() {
        if (size == 0) return null;
        T top = data[1].getData();
        data[1] = data[size];
        data[size] = null;
        size--;
        heapify(1);
        return top;
    }

    private void heapify(int i) {
        while (true) {
            int left = 2 * i;
            int right = left + 1;
            int smallest = i;
            if (left <= size && data[left].getPriority() < data[smallest].getPriority()) smallest = left;
            if (right <= size && data[right].getPriority() < data[smallest].getPriority()) smallest = right;
            if (smallest == i) break;
            PriorityNode<T> tmp = data[i];
            data[i] = data[smallest];
            data[smallest] = tmp;
            i = smallest;
        }
    }

    public void show() {
        if (size == 0) {
            System.out.println("La cola está vacía");
            return;
        }
        System.out.println("Elementos en la cola de prioridad (tamaño: " + size + "):");
        for (int i = 1; i <= size; i++) {
            System.out.println("Posición " + i + ": " + data[i]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
