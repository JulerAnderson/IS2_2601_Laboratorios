# INGENIERÍA DE SOFTWARE II  
## Laboratorio N.° 05: Patrones de Comportamiento – Caso MercaGo

### Contexto general

En los laboratorios anteriores, el equipo de desarrollo de **MercaGo** construyó una primera versión del sistema de ventas, mejoró su diseño con principios SOLID, aplicó patrones creacionales para organizar mejor la creación de objetos y utilizó patrones estructurales para integrar sistemas externos y simplificar módulos internos.

Sin embargo, conforme la plataforma ha seguido creciendo, han comenzado a aparecer nuevos problemas relacionados con la forma en que el sistema **ejecuta ciertas acciones**. En algunos módulos, la misma operación puede activarse desde distintos puntos de la interfaz, pero cada uno tiene su propia lógica, lo que genera duplicación de código, inconsistencias y dificultad para mantener el sistema.

Como parte del equipo de desarrollo de MercaGo, tu tarea será analizar esta situación y aplicar un **patrón de comportamiento** que permita centralizar la ejecución de una acción y reutilizarla desde distintos puntos del sistema.

---

## Objetivo del laboratorio

Identificar y aplicar un patrón de comportamiento en un escenario del sistema de MercaGo, con el fin de:

- evitar duplicación de lógica en acciones repetidas;
- centralizar la ejecución de una operación;
- facilitar la reutilización de una misma funcionalidad desde distintos puntos de la interfaz;
- mejorar la mantenibilidad del sistema.

---

## Ejercicio 01 – El caos de los múltiples puntos de guardado

### Situación

Dentro del panel administrativo de MercaGo, los usuarios internos pueden editar la información de un producto, por ejemplo su nombre, precio o stock. Una vez realizados los cambios, el sistema permite guardar la información de varias formas: a través de un **botón Guardar**, desde un **menú contextual** o utilizando un **atajo de teclado**.

Sin embargo, el equipo de desarrollo ha detectado que cada una de estas opciones tiene su propia implementación para guardar los cambios, lo que ha generado duplicación de código y pequeñas inconsistencias en el comportamiento.

### Problema

La lógica de guardado se encuentra repetida en distintos puntos de la aplicación. Si en el futuro cambia la forma en que se guardan los productos, el equipo tendría que modificar esa lógica en varios lugares, aumentando el riesgo de errores y desincronización.

### Tarea

Debes implementar una solución que permita que los distintos puntos de activación del guardado utilicen una **misma acción reutilizable**, evitando duplicación y facilitando futuras extensiones.

### Archivos sugeridos

- `Comando.java`
- `GuardarProductoCommand.java`
- `ProductoEditor.java`
- `BotonGuardar.java`
- `MenuContextualGuardar.java`
- `AtajoTecladoGuardar.java`
- `Main.java`

### Idea esperada

- Centralizar la lógica de guardado en una sola clase
- Permitir que distintos elementos de la interfaz invoquen la misma acción
- Evitar que cada punto de acceso implemente su propia lógica de guardado
- Facilitar cambios futuros en la operación sin tener que modificar múltiples clases

---

## Recomendaciones

- Analiza primero qué parte del sistema está duplicando comportamiento.
- Identifica qué acción debería estar centralizada.
- Enfócate en separar claramente quién ejecuta la acción y quién contiene la lógica real.
- Intenta que la solución sea simple, clara y coherente con el contexto de MercaGo.

---

## Entregable

Se espera que el estudiante desarrolle una solución para el ejercicio, organizando su código en carpetas independientes, por ejemplo:

```text
inicial/
corregido/