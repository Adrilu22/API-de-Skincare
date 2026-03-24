# 📘 Documentación de API - Skincare

---

##  1. Descripción de la API

La API Skincare es un servicio REST desarrollado en Java con Spring Boot que permite gestionar productos relacionados con el cuidado de la piel.

El sistema implementa un modelo basado en dos entidades principales:

- Categorías
- Productos

Estas entidades están relacionadas, ya que cada producto pertenece a una categoría.

La API permite realizar operaciones CRUD completas, cumpliendo con los requisitos establecidos en la actividad académica {index=1}.

---

##  2. Objetivo de la API

El objetivo de la API es permitir que aplicaciones externas puedan:

- Crear categorías de productos
- Registrar productos
- Consultar información
- Actualizar datos
- Eliminar registros

---

##  3. Base URL



---

# 4. Lista completa de endpoints

##  Categorías

| Método | Endpoint | Descripción |
|--------|--------|------------|
| GET | /api/categorias | Obtener todas las categorías |
| GET | /api/categorias/{id} | Obtener una categoría |
| POST | /api/categorias | Crear categoría |
| PUT | /api/categorias/{id} | Actualizar categoría |
| DELETE | /api/categorias/{id} | Eliminar categoría |

---

##  Productos

| Método | Endpoint | Descripción |
|--------|--------|------------|
| GET | /api/productos | Obtener todos los productos |
| GET | /api/productos/{id} | Obtener producto |
| POST | /api/productos | Crear producto |
| PUT | /api/productos/{id} | Actualizar producto |
| DELETE | /api/productos/{id} | Eliminar producto |

---

#  5. Parámetros de cada endpoint

##  GET /api/categorias/{id}

| Parámetro | Tipo | Descripción |
|----------|------|------------|
| id | Long | ID de la categoría |

---

## 🔹 POST /api/categorias

### Body

```json
{
  "nombre": "Hidratantes"
}

##  POST /api/productos

### Body

{
  "nombre": "Serum Vitamina C",
  "precio": 70000,
  "categoria": {
    "id": 1
  }
}

 ## 6. Ejemplos de Request y Response

### Obtener categorías
[
  {
    "id": 1,
    "nombre": "Hidratantes"
  },
  {
    "id": 2,
    "nombre": "Limpiadores"
  }
]
##  Request
###Crear producto
{
  "nombre": "Crema hidratante",
  "precio": 50000,
  "categoria": {
    "id": 1
  }
}

## Response
{
  "id": 2,
  "nombre": "Crema hidratante",
  "precio": 50000,
  "categoria": {
    "id": 1,
    "nombre": "Hidratantes"
  }
}

## 7. Códigos de estado HTTP

| Código | Significado           |
| ------ | --------------------- |
| 200    | OK                    |
| 201    | Created               |
| 400    | Bad Request           |
| 404    | Not Found             |
| 500    | Internal Server Error |

## 8. Formato de errores
{
  "timestamp": "2026-03-24T16:20:26",
  "status": 500,
  "error": "Internal Server Error",
  "message": "Error en la base de datos",
  "path": "/api/productos"
}

## 9. Consideraciones
