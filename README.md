1. ¿Por qué ArrayList<int> no compila y ArrayList<Integer> sí?
Porque las listas solo guardan objetos, y int es un tipo primitivo, no un objeto. Integer es la versión “objeto” de int, y Java convierte entre los dos automáticamente, así que lista.add(5) funciona sin problema.

2. ¿Por qué eliminar a Nevado de Favoritas no lo eliminó de Viaje? ¿Qué relación muestra?
Porque cada playlist tiene su propia lista. Al borrar una canción de Favoritas solo se quita esa referencia, pero la canción sigue existiendo y Viaje todavía apunta a ella. Esto muestra una agregación: las canciones existen por sí solas y pueden estar en varias playlists a la vez.

3. ¿Qué diferencia hay entre Playlist–Cancion y Parqueadero–Puesto?
Playlist–Cancion es una agregación: las canciones se crean afuera, pueden estar en varias playlists y siguen existiendo si la playlist desaparece. Parqueadero–Puesto es una composición: el parqueadero crea sus propios puestos, cada puesto es de un solo parqueadero y desaparece con él.

4. ¿Por qué totalCanciones debe ser static y titulo no?
El título es propio de cada canción, así que cada objeto necesita el suyo. El total, en cambio, es un solo contador compartido por todas las canciones. Si no fuera static, cada objeto tendría su propio contador y siempre valdría 1. Y si titulo fuera static, todas las canciones tendrían el mismo título.

5. ¿Por qué un método static no puede usar this?
Porque this es el objeto que llamó al método, y un método static se puede llamar sin haber creado ningún objeto, así que no hay a quién apuntar. Por eso tampoco puede usar atributos de instancia como titulo, solo los que son static.
