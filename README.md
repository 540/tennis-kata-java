# Tennis Refactoring Kata - Java

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

# Ejecutar los tests
make test

# Abrir shell interactivo
make shell

# Limpiar
make clean

# Reconstruir desde cero
make rebuild
```

## 🎾 Probar el Programa

El archivo `ExampleTennisGame.java` contiene ejemplos de uso que puedes ejecutar con `make run`.

Este programa demuestra diferentes escenarios del juego:
- **Juego básico**: Puntuación normal (Love, Fifteen, Thirty, Forty)
- **Deuce y Advantage**: Empate a 40 y ventajas
- **Victoria**: Cómo se gana un juego

Puedes modificar este archivo para probar tus propios escenarios mientras refactorizas `TennisGame1.java`.

## 🧪 Tests

El proyecto incluye tests completos en `src/test/java/com/tenniskata/TennisGame1Test.java` que verifican:

- ✅ Puntuación inicial (Love-All)
- ✅ Puntuaciones básicas (Fifteen, Thirty, Forty)
- ✅ Empates (Fifteen-All, Thirty-All, Deuce)
- ✅ Ventajas (Advantage player1/player2)
- ✅ Victorias (Win for player1/player2)
- ✅ Transiciones entre estados (Deuce → Advantage → Deuce)
- ✅ Tests parametrizados con múltiples combinaciones de puntuación

Para ejecutar los tests:

```bash
make test
```

Los tests utilizan **JUnit 5** y están diseñados para ayudarte a refactorizar el código con confianza. Si todos los tests pasan después de tus cambios, significa que la funcionalidad se mantiene correcta.
