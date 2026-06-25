document.addEventListener("DOMContentLoaded", function() {
    
    const btnContacto = document.getElementById("contacto");
    if (btnContacto) {
        btnContacto.addEventListener("click", function() {
            window.location.href = "contacto.html";
        });
    }

    const btnPlantacion = document.getElementById("plantacion");
    if (btnPlantacion) {
        btnPlantacion.addEventListener("click", function() {
            window.location.href = "plantacion.html";
        });
    }

    const btnInicio = document.getElementById("inicio");
    if (btnInicio) {
        btnInicio.addEventListener("click", function() {
            window.location.href = "index.html";
        });
    }

    const formContacto = document.getElementById("form-contacto");
    if (formContacto) {
        formContacto.addEventListener("submit", function(event) {
            event.preventDefault();
            alert("tu mensaje ha sido recibido por tomatontos");
            formContacto.reset();
        });
    }
});

document.addEventListener("DOMContentLoaded", () => {

    const imagenes = [
        "https://fitochem.com/wp-content/uploads/2025/06/Tomates-Mas-Jugosos-y-Suelos-Mas-Saludables-1030x687.jpg",
        "https://www.dineroenimagen.com/800x600/filters:format(webp):quality(75)/media/dinero/images/2026/02/precio-jitomate-sube.jpg",
        "https://extensionesp.umd.edu/wp-content/uploads/2021/07/figure3hgic_veg_nonliving_tomato-catfacing-jt_1200.jpg",
    ]; 

    let indiceActual = 0;

    const imagenPrincipal = document.getElementById("ImagenPrincipal");
    const btAnterior = document.getElementById("btAnterior");
    const btSiguiente = document.getElementById("btSiguiente");

    function mostrarImagen(indice) {
        if (imagenPrincipal && imagenes[indice]) {
            imagenPrincipal.src = imagenes[indice];
        }
    }

    mostrarImagen(indiceActual);

    if (btSiguiente) {
        btSiguiente.addEventListener("click", () => {
            indiceActual++;
            if (indiceActual >= imagenes.length) {
                indiceActual = 0;
            }
            mostrarImagen(indiceActual);
        });
    }

    if (btAnterior) {
        btAnterior.addEventListener("click", () => {
            indiceActual--;
            if (indiceActual < 0) {
                indiceActual = imagenes.length - 1; 
            }
            mostrarImagen(indiceActual);
        });
    }

});
