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

Kata de refactorización del juego de tenis en Java con Docker.

## 🐳 Requisitos

- **Docker**
- **Make**

## 🚀 Comandos

```bash
# Construir la imagen Docker
make build

# Ejecutar el ejemplo
make run

# Compilar el código
make compile

# Abrir shell interactivo
make shell

# Limpiar
make clean

# Reconstruir desde cero
make rebuild
```

## 🎾 Probar el Programa

Primero, tenéis que descargar el repositorio y construir la imagen Docker:

```bash
git clone https://github.com/your-username/tennis-refactoring-kata.git
cd tennis-refactoring-kata
make build
```

## Ejemplo de Uso

El archivo `ExampleTennisGame.java` contiene ejemplos de uso que puedes ejecutar con `make run`.

Este programa demuestra diferentes escenarios del juego:
- **Juego básico**: Puntuación normal (Love, Fifteen, Thirty, Forty)
- **Deuce y Advantage**: Empate a 40 y ventajas
- **Victoria**: Cómo se gana un juego

Puedes modificar este archivo para probar tus propios escenarios mientras refactorizas `TennisGame1.java`.
