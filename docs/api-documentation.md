# 🌿 API Skincare - Gestión de Productos

---

## 🧩 Descripción del Proyecto y Dominio

Este proyecto consiste en el desarrollo de una API REST orientada a la gestión de productos del dominio de cuidado de la piel (skincare). La aplicación permite administrar información relacionada con categorías y productos, facilitando operaciones CRUD (crear, consultar, actualizar y eliminar registros).

El dominio seleccionado corresponde al sector de **cosmética y cuidado personal**, ampliamente utilizado en plataformas digitales como e-commerce, aplicaciones móviles y sistemas de gestión de inventario.

La solución fue diseñada bajo una arquitectura en capas, separando claramente la lógica de negocio, el acceso a datos y la exposición de servicios, lo que facilita el mantenimiento, la escalabilidad y la reutilización del código.

---

## 👥 Integrantes del Grupo y División de Responsabilidades

* **Backend Developer**

  * Diseño e implementación de la API REST
  * Modelado de entidades (Producto, Categoría)
  * Implementación de controladores y servicios
  * Integración con base de datos PostgreSQL

* **Frontend Developer (opcional)**

  * Consumo de la API
  * Desarrollo de interfaz de usuario

* **DevOps / Infraestructura**

  * Configuración de Docker
  * Automatización de builds
  * Gestión de entornos

*(Ajustar nombres según el equipo o dejar como individual)*

---

## 🛠️ Stack Tecnológico

### 🔹 Backend

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate

### 🔹 Base de Datos

* PostgreSQL

### 🔹 DevOps

* Docker

### 🔹 Otros

* Maven
* Git & GitHub

---

## 🏗️ Arquitectura del Sistema

El sistema está basado en una arquitectura en capas:

* **Controller**

  * Maneja las solicitudes HTTP
  * Expone los endpoints de la API

* **Service**

  * Contiene la lógica de negocio
  * Procesa las operaciones del sistema

* **Repository**

  * Accede a la base de datos
  * Utiliza Spring Data JPA

* **Model**

  * Representa las entidades del sistema

---

## 📂 Estructura del Proyecto

```bash
API-de-Skincare/
 ├── backend/
 ├── frontend/
 ├── database/
 ├── docs/
 │    ├── api-documentation.md
 │    └── deployment.md
 ├── cloudbuild.yaml
 └── README.md
```

---

## ⚙️ Instalación Local

### 1. Clonar repositorio

```bash
git clone https://github.com/Adrilu22/API-de-Skincare.git
cd API-de-Skincare/backend
```

---

### 2. Configurar base de datos

Crear base de datos en PostgreSQL:

```sql
CREATE DATABASE skincare_db;
```

---

### 3. Configurar application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/skincare_db
spring.datasource.username=postgres
spring.datasource.password=TU_PASSWORD
```

---

### 4. Ejecutar el proyecto

```bash
./mvnw spring-boot:run
```

---

### 5. Probar la API

```bash
http://localhost:8080/api/categorias
```

---

## 📄 Documentación de la API

La documentación completa de endpoints, parámetros, ejemplos y errores se encuentra en:

```bash
docs/api-documentation.md
```

---

## 🚀 Estado del Proyecto

El sistema se encuentra funcional en entorno local, permitiendo la gestión de productos y categorías mediante endpoints REST.

---

## 👨‍💻 Autor

Proyecto académico - Ingeniería de Sistemas
