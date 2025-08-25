Descripción General
Este proyecto Java implementa una Cola de Prioridad utilizando una estructura de datos min-heap. La cola de prioridad permite la inserción y extracción eficiente de elementos basados en su prioridad, donde los valores de prioridad numéricamente más bajos indican mayor prioridad.

Estructura del Proyecto

ArchivosTema5/
├── Main.java          # Clase de demostración con ejemplos de uso
├── PriorityNode.java  # Clase nodo que almacena pares prioridad-dato
└── PriorityQueue.java # Implementación principal de la cola de prioridad
Características Principales
Implementación Genérica: Funciona con cualquier tipo de dato mediante genéricos de Java

Redimensionamiento Dinámico: Expande automáticamente la capacidad cuando es necesario

Estructura Min-Heap: Garantiza complejidad temporal O(log n) para operaciones push/pop

Indexado Base 1: Utiliza indexado de array comenzando en 1 para operaciones de heap

API Completa: Incluye métodos push, pop, isEmpty, size y show

Clases
PriorityNode<T>
Almacena pares prioridad-dato con los siguientes métodos:

getPriority() / setPriority() - Acceder y modificar la prioridad

getData() / setData() - Acceder y modificar los datos

toString() - Representación en string del nodo

PriorityQueue<T>
Implementa la cola de prioridad con estos métodos:

Operaciones Principales
push(int priority, T value) - Insertar elemento con prioridad especificada

pop() - Remover y retornar el elemento de mayor prioridad (valor numérico más bajo)

isEmpty() - Verificar si la cola está vacía

size() - Obtener el número actual de elementos

Métodos de Utilidad
show() - Mostrar todos los elementos con sus posiciones y prioridades

resizeIfNeeded() - Método interno para expansión dinámica del array

heapify(int i) - Método interno para mantener la propiedad de heap

Análisis de Complejidad
Operación	Complejidad Temporal	Complejidad Espacial
push()	O(log n)	O(1) amortizado
pop()	O(log n)	O(1)
isEmpty()	O(1)	O(1)
size()	O(1)	O(1)
Ejemplo de Uso
java
PriorityQueue<String> queue = new PriorityQueue<>();

// Insertar elementos con diferentes prioridades
queue.push(3, "Tarea media");
queue.push(1, "Tarea urgente");      // Mayor prioridad (número más bajo)
queue.push(5, "Tarea baja prioridad"); // Menor prioridad
queue.push(2, "Tarea importante");

// Mostrar contenido de la cola
queue.show();

// Extraer elementos en orden de prioridad
while (!queue.isEmpty()) {
    System.out.println("Pop: " + queue.pop());
}
Ejemplo de Salida

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

Estado final de la cola:
La cola está vacía
Detalles de Implementación
Propiedad de Heap: Mantiene un min-heap donde los nodos padres tienen valores más bajos (mayor prioridad) que los hijos

Almacenamiento en Array: Utiliza indexado base 1 para cálculos más simples de padre/hijo

Redimensionamiento Automático: Duplica la capacidad cuando el array está lleno

Eficiencia de Memoria: Establece elementos removidos como null para ayudar al garbage collector

Requisitos
Java 8 o superior

Sin dependencias externas

Comenzar
Compilar todos los archivos Java:

bash
javac ArchivosTema5/*.java
Ejecutar la clase principal:

bash
java ArchivosTema5.Main
Casos de Uso
Sistemas de planificación de tareas

Priorización de paquetes de red

Simulación de eventos

Implementación del algoritmo de Dijkstra

Cualquier escenario que requiera procesamiento prioritario

Esta implementación proporciona una base robusta para el procesamiento de datos basado en prioridades con características de rendimiento eficientes adecuadas para la mayoría de las aplicaciones.
