let carrito = [];

// 🔹 Cargar productos desde API
function cargarProductos() {
  fetch("https://api-skincare-v2-994118614969.us-central1.run.app/api/productos")
    .then(res => res.json())
    .then(data => {
      const contenedor = document.getElementById("productos");
      contenedor.innerHTML = "";

      data.forEach(p => {
        contenedor.innerHTML += `
          <div class="producto">
            <h3>${p.nombre}</h3>
            <p>Precio: $${p.precio}</p>
            
            <button onclick='agregarCarrito(${p.id}, \`${p.nombre}\`, ${p.precio})'>
              Agregar al carrito
            </button>
          </div>
        `;
      });
    })
    .catch(err => console.error("Error cargando productos:", err));
}

// 🔹 Agregar al carrito (CORREGIDO)
function agregarCarrito(id, nombre, precio) {
  carrito.push({
    id: id,
    nombre: nombre,
    precio: precio
  });

  mostrarCarrito();
}

// 🔹 Mostrar carrito
function mostrarCarrito() {
  const lista = document.getElementById("carrito");
  lista.innerHTML = "";

  carrito.forEach(p => {
    lista.innerHTML += `
      <li>${p.nombre} - $${p.precio}</li>
    `;
  });
}

// 🔹 Finalizar compra (CORREGIDO)
function finalizarCompra() {

  if (carrito.length === 0) {
    alert("El carrito está vacío ❌");
    return;
  }

  // 🔥 convertir a formato backend
  const datos = carrito.map(p => ({
    productoId: Number(p.id)
  }));

  console.log("Carrito:", carrito);
  console.log("Datos enviados:", datos);

  fetch("https://api-skincare-v2-994118614969.us-central1.run.app/api/compras", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(datos)
  })
  .then(res => {
    console.log("Status:", res.status);
    if (!res.ok) throw new Error("Error en backend");
    return res.text();
  })
  .then(data => {
    alert(data);

    // 🔥 limpiar carrito después de compra
    carrito = [];
    mostrarCarrito();
  })
  .catch(err => {
    console.error(err);
    alert("Error al guardar compra ❌");
  });
}

// 🔹 Cargar productos al iniciar
cargarProductos();