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
