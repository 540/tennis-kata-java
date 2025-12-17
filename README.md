# Tennis Refactoring Kata - Java

## 📖 ¿Qué es esta Kata?

Esta es una **kata de refactorización** diseñada para practicar técnicas de mejora de código sin cambiar su comportamiento externo. El objetivo es transformar código funcional pero difícil de mantener en código limpio, legible y bien estructurado.

### 🎯 Objetivo

El código en `TennisGame1.java` implementa correctamente las reglas de puntuación del tenis, pero presenta varios "code smells" (malos olores de código) que dificultan su comprensión y mantenimiento.

Tu misión es **refactorizar este código** aplicando principios de Clean Code mientras mantienes toda la funcionalidad intacta.

### 🎾 Reglas del Tenis (Recordatorio)

La puntuación en tenis sigue estas reglas:
- Los puntos se cuentan como: **Love** (0), **Fifteen** (15), **Thirty** (30), **Forty** (40)
- Cuando ambos jugadores tienen 40 puntos, se llama **Deuce**
- Después de Deuce, un jugador debe ganar por 2 puntos de diferencia
- Si un jugador tiene 1 punto de ventaja después de Deuce: **Advantage**
- Si un jugador tiene 2+ puntos de ventaja: **Win**

### 💡 Consejos para la Refactorización

- ✅ Ejecuta los tests frecuentemente para asegurar que no rompes nada
- ✅ Haz cambios pequeños e incrementales
- ✅ Usa nombres descriptivos que reflejen el dominio del tenis
- ✅ Extrae métodos para simplificar la lógica compleja
- ✅ Elimina duplicación de código
- ✅ Considera crear constantes para valores literales

---

## 📋 Requisitos

- **Java 17** o superior
- **Maven 3.6+**

## 🚀 Comandos

```bash
# Compilar
mvn compile

# Ejecutar el ejemplo
java -cp target/classes com.tenniskata.ExampleTennisGame

# Ejecutar tests
mvn test

# Limpiar
mvn clean
```
