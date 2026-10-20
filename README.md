Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Encapsulamiento y Gestión de Cuentas Bancarias en Java**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🏦 Simulación de Cuenta Bancaria (Encapsulamiento y Control de Estado en Java)

Este proyecto es una aplicación en Java que modela la gestión básica de una cuenta bancaria personal, implementando operaciones fundamentales de depósito, extracción y consulta de saldos. Pone en práctica pilares clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos**, el control defensivo de estado mediante **métodos accesores (*getters*) y modificadores (*setters*)**, y la validación de reglas de negocio en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio concreta y un punto de ejecución:

* **`CuentaBancaria`**: Modela la entidad bancaria y protege la integridad de sus datos.
* **Atributos privados (`private`)**: `titular`, `saldoActual` y `numeroCuenta`, imposibilitando su modificación directa desde fuera de la clase.
* **Constructor**: Inicializa la cuenta validando que el saldo inicial no sea negativo (`saldoActual >= 0`). Si el valor asignado es menor a cero, se establece por defecto en `0`.
* **Métodos accesores y modificadores (*getters/setters*)**: Permiten la lectura y escritura controlada de los atributos privados.
* **Métodos operativos de negocio**:
* `depositar(double monto)`: Incrementa el saldo si el monto ingresado es positivo.
* `extraer(double monto)`: Reduce el saldo si el monto es mayor a cero y no supera los fondos disponibles.
* `mostrar()`: Imprime el resumen actualizado del titular, número de cuenta y saldo.




* **`Main`**: Punto de entrada del programa. Instancia una cuenta bancaria con datos iniciales, ejecuta depósitos y extracciones, y muestra por consola el estado final.

---

## ⚙️ Reglas de Negocio y Control de Estado

1. **Protección de Saldo Defensiva:** El atributo `saldoActual` no permite valores negativos en ningún punto de la ejecución (constructor, setters o extracciones).
2. **Validación de Extracción Mínima y Fondos Suficientes:** El método `extraer(...)` evalúa dos condiciones clave (`monto > 0 && monto <= saldoActual`) para evitar sobregiros y rechazar la operación si no existen fondos bastantes o si el valor solicitado es inválido.
3. **Encapsulamiento Estricto:** Al declarar todos los campos como `private`, el código garantiza que cualquier cambio sobre el estado financiero pase obligatoriamente por las validaciones de negocio de los métodos públicos.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Monto depositado: $2500.0
Monto extraido: $900.0
titular: Juan
Numero Cuenta: 654684646541654
Saldo: $2100.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento:** Ocultamiento de los datos internos de la clase mediante el modificador `private` para preservar la coherencia del estado del objeto.
* **Validación de Invariantes de Estado:** Garantía de que un objeto mantenga valores válidos a lo largo de todo su ciclo de vida (por ejemplo, impidiendo saldos negativos).
* **Diseño Modular:** Separación clara entre la entidad que representa los datos y reglas (`CuentaBancaria`) y la clase cliente que ejecuta las operaciones (`Main`).

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba explican en detalle la aplicación práctica del **encapsulamiento**, el uso correcto de métodos *getters* y *setters*, y las buenas prácticas para proteger atributos privados en Java.
