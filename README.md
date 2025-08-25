
---

## Características Principales
- **Implementación Genérica**: Funciona con cualquier tipo de dato mediante genéricos de Java.  
- **Redimensionamiento Dinámico**: Expande automáticamente la capacidad cuando es necesario.  
- **Estructura Min-Heap**: Garantiza O(log n) para operaciones `push`/`pop`.  
- **Indexado Base 1**: Utiliza indexado desde 1 para simplificar operaciones de heap.  
- **API Completa**: Métodos `push`, `pop`, `isEmpty`, `size`, `show`.  

---

## 🏗Clases

### `PriorityNode`
Almacena pares prioridad-dato.

**Métodos principales:**
- `getPriority()` / `setPriority()` → Acceso y modificación de la prioridad  
- `getData()` / `setData()` → Acceso y modificación de los datos  
- `toString()` → Representación en string del nodo  

### `PriorityQueue`
Implementa la cola de prioridad con los siguientes métodos:

**Operaciones principales:**
- `push(int priority, T value)` → Inserta un elemento con prioridad  
- `pop()` → Remueve y retorna el elemento de mayor prioridad  
- `isEmpty()` → Verifica si la cola está vacía  
- `size()` → Retorna el número de elementos  

**Métodos de utilidad:**
- `show()` → Muestra todos los elementos con sus posiciones y prioridades  
- `resizeIfNeeded()` → Expande dinámicamente el array  
- `heapify(int i)` → Mantiene la propiedad de min-heap  

---

## ⏱️ Análisis de Complejidad

| Operación   | Complejidad Temporal | Complejidad Espacial |
|-------------|----------------------|-----------------------|
| `push()`    | O(log n)             | O(1) amortizado       |
| `pop()`     | O(log n)             | O(1)                  |
| `isEmpty()` | O(1)                 | O(1)                  |
| `size()`    | O(1)                 | O(1)                  |

---

## Ejemplo de Uso
```java
PriorityQueue<String> queue = new PriorityQueue<>();

// Insertar elementos con diferentes prioridades
queue.push(3, "Tarea media");
queue.push(1, "Tarea urgente");      // Mayor prioridad
queue.push(5, "Tarea baja prioridad");
queue.push(2, "Tarea importante");

// Mostrar contenido de la cola
queue.show();

// Extraer elementos en orden de prioridad
while (!queue.isEmpty()) {
    System.out.println("Pop: " + queue.pop());
}

```
#Ejemplo de Salida

Insertando elementos en la cola de prioridad...
Elementos en la cola de prioridad (tamaño: 4):
Posición 1: PriorityNode{priority=1, data=Tarea urgente}
Posición 2: PriorityNode{priority=2, data=Tarea importante}
Posición 3: PriorityNode{priority=5, data=Tarea baja prioridad}
Posición 4: PriorityNode{priority=3, data=Tarea media}

Extrayendo elementos con pop():
Pop: Tarea urgente
Pop: Tarea importante
Pop: Tarea media
Pop: Tarea baja prioridad

Estado final de la cola: La cola está vacía
