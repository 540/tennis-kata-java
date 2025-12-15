FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

# Copiar archivos de configuración de Maven
COPY pom.xml .

# Descargar dependencias
RUN mvn dependency:go-offline -B

# Copiar el código fuente
COPY src ./src

# Comando por defecto: compilar
CMD ["mvn", "compile"]

