# INGENIERÍA DE SOFTWARE II  
## Laboratorio N.° 04: Patrones Estructurales – Caso MercaGo

### Contexto general

En los laboratorios anteriores, el equipo de desarrollo de **MercaGo** construyó una primera versión del sistema de ventas, mejoró su diseño con principios SOLID y aplicó patrones creacionales para organizar mejor la creación de objetos. Sin embargo, conforme la plataforma ha seguido creciendo, han comenzado a aparecer nuevos problemas relacionados con la **integración de sistemas** y la **complejidad de algunos módulos internos**.

Por un lado, MercaGo necesita conectarse con servicios externos que manejan formatos distintos a los del sistema interno. Por otro lado, algunas funcionalidades del sistema se han vuelto demasiado complejas para quienes las usan, ya que obligan a interactuar con muchas clases y detalles técnicos innecesarios.

Como parte del equipo de desarrollo de MercaGo, tu tarea será analizar estas situaciones y aplicar **patrones estructurales** que permitan integrar mejor los componentes del sistema y simplificar su uso.

---

## Objetivo del laboratorio

Identificar y aplicar patrones estructurales en distintos escenarios del sistema de MercaGo, con el fin de:

- integrar componentes incompatibles sin reescribir toda la solución;
- reducir la complejidad de ciertos módulos;
- ofrecer una estructura más clara y mantenible para el sistema.

---

## Ejercicio 01 – Integrando pedidos con un proveedor externo

### Situación

MercaGo registra internamente la información de sus pedidos en formato **JSON**. Sin embargo, la empresa ha decidido integrarse con un proveedor externo de logística que solo puede recibir los datos en formato **XML**.

El equipo de desarrollo intentó conectar ambos sistemas de forma directa, pero encontró dificultades porque el formato de datos del sistema interno no coincide con el requerido por el proveedor.

### Problema

Actualmente, el sistema interno de MercaGo maneja pedidos en JSON, mientras que el servicio externo de logística solo acepta XML. Modificar toda la estructura interna del sistema para adaptarla al proveedor no es una opción viable.

### Tarea

Debes implementar una solución que permita que el sistema de MercaGo continúe trabajando con JSON internamente, mientras que el proveedor externo pueda recibir la información transformada a XML sin problemas.

### Archivos sugeridos

- `PedidoJson.java`
- `ServicioLogisticaXML.java`
- `AdaptadorPedidoXML.java`
- `Main.java`

### Idea esperada

- Mantener el formato interno actual de MercaGo
- Adaptar los datos al formato requerido por el servicio externo
- Evitar modificar todo el sistema por una integración puntual

---

## Ejercicio 02 – Simplificando el acceso al panel administrativo

### Situación

El panel administrativo de MercaGo permite a ciertos usuarios internos iniciar sesión para gestionar productos, stock y pedidos. Sin embargo, esta funcionalidad se ha vuelto demasiado compleja, ya que para completar el proceso de login el usuario termina dependiendo indirectamente de varias clases, como autenticación, validación de credenciales, acceso a base de datos y notificación.

El equipo ha recibido comentarios de que la interacción con este módulo se siente innecesariamente complicada y poco clara.

### Problema

La lógica de login está distribuida en múltiples clases y expone demasiados detalles técnicos. El sistema necesita una forma de ofrecer una interacción más simple, ocultando la complejidad interna y agrupando las operaciones necesarias en una sola entrada de acceso.

### Tarea

Debes diseñar una solución que simplifique el proceso de inicio de sesión para el panel administrativo, de manera que el cliente solo interactúe con una única clase que coordine las operaciones internas necesarias.

### Archivos sugeridos

- `AutenticacionService.java`
- `UsuarioRepository.java`
- `NotificacionService.java`
- `LoginFacade.java`
- `Main.java`

### Idea esperada

- Ocultar la complejidad de las clases internas
- Ofrecer una interfaz más simple para el proceso de login
- Facilitar el uso del módulo sin exponer detalles innecesarios

---

## Recomendaciones

- Analiza primero el problema antes de pensar en la solución.
- Identifica qué parte del sistema resulta incompatible o demasiado compleja.
- Enfócate en mejorar la estructura del diseño, no solo en que el código funcione.
- Intenta que la solución sea simple, clara y coherente con el contexto de MercaGo.

---

## Entregable

Se espera que el estudiante desarrolle una solución por cada ejercicio, organizando su código en carpetas independientes, por ejemplo:

```text
inicial/
corregido/