# INGENIERÍA DE SOFTWARE II  
## Laboratorio N.° 03: Patrones Creacionales – Caso MercaGo

### Contexto general

En los laboratorios anteriores, el equipo de desarrollo de **MercaGo** construyó una primera versión del sistema de ventas y luego mejoró partes de su diseño aplicando principios SOLID. Sin embargo, conforme la plataforma ha seguido creciendo, han comenzado a aparecer nuevos problemas relacionados con la **creación de objetos** dentro del sistema.

En algunos módulos se están generando múltiples instancias cuando debería existir solo una; en otros, la creación de objetos concretos está demasiado acoplada; y en ciertas pantallas del sistema los componentes visuales no se crean de manera consistente.

Como parte del equipo de desarrollo de MercaGo, tu tarea será analizar cada situación y aplicar el **patrón creacional más adecuado** para resolver el problema.

---

## Objetivo del laboratorio

Identificar y aplicar patrones creacionales en distintos escenarios del sistema de MercaGo, con el fin de mejorar la forma en que se crean y organizan los objetos dentro de la aplicación.

---

## Ejercicio 01 – El caos de los múltiples logs en MercaGo

### Situación

MercaGo registra eventos importantes del sistema, como compras realizadas, pagos fallidos, errores de stock y movimientos del carrito. Sin embargo, durante las pruebas del sistema, el equipo técnico descubrió que se están creando múltiples objetos de registro en distintas partes de la aplicación, lo que provoca que la información quede dispersa y sea difícil de rastrear.

### Problema

Actualmente, diferentes módulos crean su propio objeto de log por separado. Esto genera inconsistencias en el seguimiento de eventos y dificulta el monitoreo del sistema por parte del equipo de soporte.

### Tarea

Debes proponer una solución que garantice que exista **una sola instancia** encargada del registro de eventos en todo el sistema.

### Archivos sugeridos

- `Logger.java`
- `Main.java`

### Idea esperada

- Centralizar el registro de eventos
- Evitar la creación de múltiples instancias de logger
- Permitir que diferentes partes del sistema usen el mismo objeto de registro

---

## Ejercicio 02 – Comprobantes que no deberían crearse así

### Situación

Cuando un cliente realiza una compra en MercaGo, el sistema puede generar distintos tipos de comprobantes, por ejemplo una **boleta** o una **factura**. Sin embargo, el equipo de desarrollo ha estado creando estos objetos directamente en distintas partes del código, lo que ha vuelto el sistema más rígido y difícil de extender.

### Problema

La lógica actual depende demasiado de clases concretas. Si en el futuro se desea agregar otro tipo de comprobante, habría que modificar varias partes del sistema, generando acoplamiento innecesario.

### Tarea

Debes rediseñar la solución para que la creación de comprobantes esté desacoplada de las clases concretas, facilitando la incorporación de nuevos tipos en el futuro.

### Archivos sugeridos

- `Comprobante.java`
- `Boleta.java`
- `Factura.java`
- `CreadorComprobante.java`
- `CreadorBoleta.java`
- `CreadorFactura.java`
- `Main.java`

### Idea esperada

- Encapsular la creación del tipo de comprobante
- Evitar que el `Main` o el cliente cree directamente objetos concretos
- Permitir agregar nuevos comprobantes sin modificar la lógica principal

---

## Ejercicio 03 – Panel administrativo con temas inconsistentes

### Situación

MercaGo cuenta con un panel administrativo interno para gestionar productos, pedidos y stock. Este panel permite trabajar con dos temas visuales: **claro** y **oscuro**. Sin embargo, el equipo ha detectado que algunos botones y checkboxes no coinciden con el tema seleccionado, generando una experiencia visual inconsistente para los usuarios internos.

### Problema

Los componentes gráficos se están creando manualmente y de forma desordenada. Como resultado, a veces aparecen botones del tema claro junto con checkboxes del tema oscuro, o viceversa.

### Tarea

Debes plantear una solución que permita crear **familias de componentes visuales consistentes** según el tema elegido.

### Archivos sugeridos

- `Boton.java`
- `Checkbox.java`
- `BotonClaro.java`
- `BotonOscuro.java`
- `CheckboxClaro.java`
- `CheckboxOscuro.java`
- `TemaFactory.java`
- `TemaClaroFactory.java`
- `TemaOscuroFactory.java`
- `Main.java`

### Idea esperada

- Crear componentes compatibles entre sí según el tema
- Evitar la mezcla de objetos de distintos estilos
- Facilitar la incorporación de nuevos temas en el futuro

---

## Recomendaciones

- Analiza primero el problema antes de elegir la solución.
- Identifica qué objetos se están creando mal o de forma poco flexible.
- Intenta que cada solución sea clara, simple y coherente con el contexto de MercaGo.
- No te enfoques solo en que el código funcione; enfócate también en que el diseño sea más mantenible.

---

## Entregable

Se espera que el estudiante desarrolle una solución por cada ejercicio, organizando su código en carpetas independientes, por ejemplo:

```text
inicial/
corregido/