.PHONY: build clean shell run help

# Variables
IMAGE_NAME = tennis-kata-java
CONTAINER_NAME = tennis-kata-container

help: ## Mostrar esta ayuda
	@echo "Comandos disponibles para Tennis Kata Java:"
	@echo ""
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "  \033[36m%-15s\033[0m %s\n", $$1, $$2}'

build: ## Construir la imagen Docker
	@echo "🔨 Construyendo imagen Docker..."
	docker build -t $(IMAGE_NAME) .

clean: ## Limpiar contenedores e imágenes
	@echo "🧹 Limpiando contenedores e imágenes..."
	-docker rm -f $(CONTAINER_NAME) 2>/dev/null || true
	-docker rmi $(IMAGE_NAME) 2>/dev/null || true

shell: ## Abrir shell interactivo en el contenedor
	@echo "🐚 Abriendo shell en el contenedor..."
	docker run --rm -it -v $(PWD)/src:/app/src $(IMAGE_NAME) /bin/bash

compile: ## Compilar el código
	@echo "⚙️  Compilando código..."
	docker run --rm -v $(PWD)/src:/app/src $(IMAGE_NAME) mvn compile

test: ## Ejecutar los tests
	@echo "🧪 Ejecutando tests..."
	docker run --rm -v $(PWD)/src:/app/src $(IMAGE_NAME) mvn test

run: ## Ejecutar el ejemplo de Tennis Game
	@echo "🎾 Ejecutando ejemplo..."
	docker run --rm -v $(PWD)/src:/app/src $(IMAGE_NAME) sh -c "mvn compile && java -cp target/classes com.tenniskata.ExampleTennisGame"

rebuild: clean build ## Limpiar y reconstruir desde cero
	@echo "✅ Reconstrucción completa finalizada"

