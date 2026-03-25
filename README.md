🌿 API de Skincare - Gestión de Productos Cloud
Proyecto de Desarrollo de Aplicaciones en la Nube

📝 Descripción del Proyecto
Esta aplicación es una solución integral para la gestión de inventarios de productos de cuidado personal (Skincare). Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre un catálogo de productos, integrando un backend robusto en Spring Boot con una base de datos PostgreSQL hospedada en Google Cloud.

👥 Integrantes y Responsabilidades
Sary Ariza Vargas: Configuración de infraestructura en Google Cloud (Cloud SQL, Cloud Run, Artifact Registry), implementación de seguridad en variables de entorno y desarrollo de endpoints en el Backend.

Adriana Carreño: Diseño y desarrollo de la interfaz de usuario (Frontend), integración de servicios API mediante JavaScript/Fetch y elaboración de la documentación técnica del sistema.

🛠️ Stack Tecnológico
Backend: Java 17, Spring Boot, Spring Data JPA.

Base de Datos: PostgreSQL (Google Cloud SQL).

Infraestructura: Google Cloud Platform (GCP).

CI/CD: Google Cloud Build (Despliegue automático).

Frontend: HTML5, CSS3, JavaScript Vanilla.

☁️ Servicios Cloud Implementados
Cloud Run: Hosting del contenedor de la API con escalabilidad automática.

Cloud SQL: Instancia administrada de base de datos PostgreSQL.

Artifact Registry: Almacenamiento privado de imágenes de Docker.

Cloud Build: Pipeline para integración y despliegue continuo (CI/CD).

🔗 Enlaces de Acceso
URL de la Aplicación: [https://api-de-skincare-22722.web.app/]

Repositorio GitHub: [https://github.com/Adrilu22/API-de-Skincare/tree/main]

🏗️ Arquitectura del Sistema
El sistema sigue una arquitectura de microservicios orientada a la nube:
Usuario (Navegador) -> Cloud Run (Contenedor Java) -> Cloud SQL (Persistencia PostgreSQL)

🛠️ Instalación y Despliegue
Ejecución Local:
Clonar el repositorio.

Configurar las variables en application.properties.

Ejecutar: ./mvnw spring-boot:run.

Comandos de Despliegue Cloud:
El despliegue se automatiza mediante Cloud Build con el comando:
gcloud builds submit --config cloudbuild.yaml

⚠️ Problemas Encontrados y Soluciones
Problema: Se presentaba un error durante el despliegue en Cloud Run, donde el contenedor no lograba iniciar correctamente ni escuchar en el puerto asignado (PORT=8080).
Adicionalmente, al acceder a la aplicación se mostraba una pantalla en blanco, ya que el frontend no estaba correctamente desplegado ni accesible.

Solución: Se separaron correctamente las responsabilidades de la aplicación:

El backend se mantuvo desplegado en Cloud Run, encargado de la lógica de negocio y conexión con la base de datos.
El frontend se integró y desplegó mediante Firebase Hosting, una plataforma especializada en servir aplicaciones web de forma rápida y eficiente.

Problema: Exposición de credenciales en el código.

Solución: Se eliminaron las claves del archivo cloudbuild.yaml y se configuraron como variables de entorno directamente en la consola de Google Cloud Run para mayor seguridad.

