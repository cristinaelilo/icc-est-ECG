# Proyecto: Clases Genéricas en Java 

Este proyecto demuestra el uso de **clases genéricas** en Java, que es como tener una caja mágica que puede guardar cualquier cosa. En este caso, implementé dos clases genéricas: un repositorio para almacenar elementos y una clase para manejar pares de clave-valor. La idea es mostrar cómo podemos manejar diferentes tipos de datos sin tener que crear clases separadas para cada tipo. 

---

## ¿Qué son los datos genéricos? 

Los **datos genéricos** permiten escribir clases, interfaces o métodos que pueden trabajar con cualquier tipo de dato. Es como crear una receta que puedas usar para hacer diferentes platillos, sin tener que crear una receta nueva cada vez.

En lugar de definir clases específicas para cada tipo de dato (como `String`, `Integer`, etc.), usamos un tipo genérico, como `<T>`, que es un marcador de lugar para cualquier tipo que decida usar el programador.

- **Marcadores de tipo más comunes**:
  - `T`: Tipo genérico (Tipo por defecto).
  - `K`: Clave (Key) — usualmente se usa para mapas.
  - `V`: Valor (Value) — lo que quieres asociar con la clave.
  - `E`: Elemento (Element) — generalmente usado para listas.
  - `N`: Número (Number) — ideal para números.

### ¿Por qué usar genéricos?
- **Reutilización de código:** Es como hacer una sola clase para manejar varios tipos de datos.
- **Seguridad de tipos:** Si intentas mezclar tipos incorrectos, Java te lo avisa antes de que lo ejecutes. ¡Nada de errores raros en tiempo de ejecución!
- **Código más limpio:** Menos repetición, más claridad.

---

## Clases Genéricas

### 1. Clase `Repositorio<T>`

Esta clase es un repositorio genérico que puede almacenar **cualquier tipo** de dato que le pases, ya sea texto, números, o incluso objetos más complejos. Internamente usa una lista para guardar los elementos.

#### Métodos principales:
- `agregar(T elemento)`: Añades un elemento al repositorio.
- `quitar(T elemento)`: Elimina un elemento del repositorio.
- `obtenerTodos()`: Devuelve una lista con todos los elementos guardados.

#### Ejemplo de uso:
```java
Repositorio<String> repoDeStrings = new Repositorio<>();
repoDeStrings.agregar("Hola");
repoDeStrings.agregar("Mundo");
System.out.println(repoDeStrings.obtenerTodos());  // Salida: [Hola, Mundo]

---

### Explicación de la sección "Fuentes Consultadas":

1. La **documentación oficial de Java** sobre genéricos y colecciones.
2. Enlaces a tutoriales de **GeeksforGeeks** y **TutorialsPoint**, que son recursos populares para aprender sobre genéricos en Java.

De esta forma, se proporciona un contexto adicional sobre los conceptos y ejemplos utilizados en el proyecto.
