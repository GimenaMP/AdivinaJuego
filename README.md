# AdivinaJuego
Uso de bucles, banderas, entradas de texto por consola 
**📢 ¡Atrévete a Desafiar tu Suerte! 🎯**  

**🔥 Juego de Adivinanza Numérica 🔥**  
¿Crees que puedes adivinar el número secreto en solo **5 intentos**? ¡Demuéstralo!  

✨ **Cómo jugar:**  
1️⃣ El sistema generará un número aleatorio entre **1 y 100**.  
2️⃣ Tienes **5 oportunidades** para adivinarlo.  
3️⃣ En cada intento, te diremos si tu número es **mayor o menor** que el secreto.  
4️⃣ ¡Si aciertas, ganarás un mensaje de victoria! 🏆  

**🚀 ¿Te atreves a probar tu intuición?**  

```java
public static void main(String[] args) {  
    System.out.println("¡Bienvenido al desafío!");  
    new Adivinanza().jugar();  
}  
```  

**💡 ¿Por qué jugar?**  
✅ Perfecto para practicar lógica y programación.  
✅ Ideal para competir con amigos.  
✅ ¡Solo necesitas Java y ganas de divertirte!  

**🎉 ¡Desafia a la máquina y descubre si puedes ganar!**  

👇 **¿Listo para el reto? ¡Ejecuta el código y comienza a jugar!** 👇  

---  
📌 **#Java #Juego #Adivinanza #Programación #Reto**

**🚀 ¡Descubre la Lógica Detrás del Juego de Adivinanza en Java! 🧠**  

¿Alguna vez te preguntaste cómo funciona un juego que genera un número aleatorio y da pistas para adivinarlo? Aquí te lo explicamos paso a paso.  

---

### **🔍 Lógica del Programa**  

#### **1️⃣ Generación del Número Secreto**  
```java
int numeroAleatorio = new Random().nextInt(100) + 1;
```  
- **`Random().nextInt(100)`** genera un número entre **0 y 99**.  
- **`+ 1`** ajusta el rango a **1-100** para que sea más intuitivo.  

#### **2️⃣ Bucle Principal (Control de Intentos)**  
```java
while (intentosRestantes > 0 && !adivinado) { ... }
```  
- El juego sigue ejecutándose mientras:  
  - **Queden intentos** (`intentosRestantes > 0`).  
  - **El usuario no haya adivinado** (`!adivinado`).  

#### **3️⃣ Validación del Número Ingresado**  
```java
if (numero < 1 || numero > 100) {
    System.out.println("El número debe estar entre 1 y 100");
    continue; // No resta intentos si es inválido
}
```  
- Asegura que el número esté en el rango correcto.  
- **`continue`** evita que un intento inválido cuente.  

#### **4️⃣ Comparación con el Número Secreto**  
```java
if (numero == numeroAleatorio) {
    System.out.println("¡Felicidades, adivinaste el número!");
    adivinado = true; // Termina el juego
} else if (numero < numeroAleatorio) {
    System.out.println("El número es mayor");
    intentosRestantes--; // Resta un intento
} else {
    System.out.println("El número es menor");
    intentosRestantes--; // Resta un intento
}
```  
- **Si acierta**: Muestra mensaje de victoria y termina el juego.  
- **Si es menor/mayor**: Da una pista y reduce los intentos.  

#### **5️⃣ Mensaje Final (Si No Adivina)**  
```java
if (!adivinado) {
    System.out.println("¡Se acabaron los intentos! El número era: " + numeroAleatorio);
}
```  
- Si el jugador **agota sus intentos**, revela el número secreto.  

---

### **🎯 ¿Por Qué Esta Lógica es Efectiva?**  
✔ **Control de flujo claro**: Usa un `while` para gestionar los intentos.  
✔ **Validación robusta**: No permite números fuera de rango.  
✔ **Retroalimentación útil**: Indica si el número es mayor o menor.  
✔ **Experiencia de usuario mejorada**: Muestra intentos restantes.  

---

