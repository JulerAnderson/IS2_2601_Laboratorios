# INGENIERÍA DE SOFTWARE II  

## Laboratorio N.° 02: SOLID – Caso MercaGo

### Contexto general

En el laboratorio anterior, el equipo de desarrollo de **MercaGo** construyó una primera versión del sistema de ventas en línea. Sin embargo, a medida que la plataforma ha comenzado a crecer, se han detectado varios problemas de diseño en diferentes módulos del sistema.

El gerente técnico de MercaGo ha identificado clases con demasiadas responsabilidades, componentes poco flexibles ante cambios, herencias mal planteadas, interfaces demasiado grandes y dependencias innecesariamente acopladas.

Como parte del equipo de desarrollo, tu tarea será **refactorizar el código adjunto** aplicando los principios **SOLID**, con el objetivo de que el sistema sea más claro, flexible, mantenible y escalable.

---

## Objetivo del laboratorio

Refactorizar distintas partes del sistema de MercaGo aplicando los cinco principios SOLID:

- **SRP**: Single Responsibility Principle  
- **OCP**: Open/Closed Principle  
- **LSP**: Liskov Substitution Principle  
- **ISP**: Interface Segregation Principle  
- **DIP**: Dependency Inversion Principle  

Cada ejercicio representa un problema realista dentro de la evolución del sistema de MercaGo.

---

## Ejercicio 01 – SRP: Generación y envío de reportes de ventas

### Situación

El área administrativa de MercaGo necesita generar reportes de ventas y enviarlos por correo. Actualmente, una misma clase se encarga tanto de construir el contenido del informe como de enviarlo, lo que hace que tenga más de una responsabilidad.

### Problema

El código actual mezcla la lógica de generación del informe con la lógica de envío. Si en el futuro cambia el formato del reporte o el medio de envío, la misma clase tendría que modificarse por razones distintas.

### Tarea

Refactoriza el código para que cada clase tenga una única responsabilidad.

### Archivos sugeridos

- `Informe.java`
- `ServicioCorreo.java`
- `Main.java`

---

## Ejercicio 02 – OCP: Cálculo de salarios del personal de MercaGo

### Situación

MercaGo está ampliando su equipo y ahora cuenta con distintos tipos de empleados, como personal asalariado y personal por horas. El cálculo de salario no debería depender de múltiples condicionales que deban modificarse cada vez que aparezca un nuevo tipo de empleado.

### Problema

El diseño actual obliga a modificar una clase base o una estructura condicional cada vez que se incorpora una nueva modalidad de pago.

### Tarea

Refactoriza la solución de modo que el sistema quede **abierto a la extensión, pero cerrado a la modificación**.

### Archivos sugeridos

- `Empleado.java`
- `EmpleadoAsalariado.java`
- `EmpleadoPorHora.java`
- `Main.java`

---

## Ejercicio 03 – LSP: Tipos de repartidores y sustitución correcta

### Situación

MercaGo cuenta con distintos medios de reparto para entregar pedidos: algunos repartidores usan bicicleta y otros usan moto. El sistema debe permitir tratarlos de manera consistente sin que una subclase rompa el comportamiento esperado de la clase base.

### Problema

El diseño actual presenta una jerarquía en la que una subclase no puede cumplir correctamente el comportamiento prometido por la clase padre, generando inconsistencias al usarla como reemplazo.

### Tarea

Refactoriza la jerarquía para que las subclases puedan sustituir correctamente a la clase base sin alterar el comportamiento del sistema.

### Archivos sugeridos

- `Repartidor.java`
- `RepartidorBicicleta.java`
- `RepartidorMoto.java`
- `IUsaCombustible.java`
- `Main.java`


---

## Ejercicio 04 – ISP: Funciones del personal interno

### Situación

Dentro de MercaGo existen distintos roles operativos. Por ejemplo, algunos trabajadores registran ventas, otros gestionan inventario y otros supervisan procesos. Sin embargo, el sistema actual obliga a todos a implementar una interfaz demasiado grande, incluso con métodos que no necesitan.

### Problema

Existen clases que dependen de métodos que no usan, lo que hace que el diseño sea más rígido y menos claro.

### Tarea

Refactoriza el código dividiendo la interfaz grande en interfaces más pequeñas y específicas.

### Archivos sugeridos

- `RegistradorVentas.java`
- `GestionInventario.java`
- `SupervisionOperativa.java`
- `Cajero.java`
- `Almacenero.java`
- `Supervisor.java`
- `Main.java`

---

## Ejercicio 05 – DIP: Abastecimiento de productos en tienda

### Situación

MercaGo necesita reabastecer productos de sus tiendas. Actualmente, la clase `Tienda` depende directamente de un proveedor concreto, lo que dificulta cambiar de proveedor o simular otro origen de abastecimiento.

### Problema

La clase de alto nivel depende de una implementación concreta, generando acoplamiento innecesario.

### Tarea

Refactoriza el diseño para que las clases de alto nivel dependan de abstracciones y no de implementaciones concretas.

### Archivos sugeridos

- `Proveedor.java`
- `ProveedorLocal.java`
- `Tienda.java`
- `Main.java`

---

## Recomendaciones

- No cambies el comportamiento esperado del programa; enfócate en mejorar el diseño.
- Intenta que cada solución sea simple y clara.
- Prioriza el uso correcto del principio SOLID antes que una solución demasiado compleja.
- Puedes apoyarte en clases abstractas, interfaces y composición según corresponda.

---

## Entregable

Se espera que el estudiante entregue el código refactorizado por cada principio, organizado en carpetas independientes, por ejemplo:

```text
corregido/
  srp/
  ocp/
  lsp/
  isp/
  dip/