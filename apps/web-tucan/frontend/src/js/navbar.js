/* Archivo: js/navbar.js */

document.addEventListener("DOMContentLoaded", () => {
    const navbarContainer = document.getElementById('navbar-container');

    if (navbarContainer) {
        // Obtenemos el nombre del archivo actual para saber qué botón marcar como activo
        const currentPath = window.location.pathname;
        
        // Estructura del HTML de la barra de navegación
        // Nota: Las rutas usan ./ porque este JS se ejecuta desde las páginas dentro de /pages
        navbarContainer.innerHTML = `
            <nav class="navbar">
                <div class="nav-brand">
                    <span>🦜 Tucan-Bank</span>
                </div>
                <div class="nav-menu">
                    <a href="inicio.html" class="nav-link ${currentPath.includes('inicio.html') ? 'active' : ''}">Inicio</a>
                    <a href="cuentas.html" class="nav-link ${currentPath.includes('cuentas.html') ? 'active' : ''}">Cuentas</a>
                    <a href="perfil.html" class="nav-link ${currentPath.includes('perfil.html') ? 'active' : ''}">Perfil</a>
                </div>
                <div class="nav-logout">
                    <small style="color: white; margin-right: 10px;">Usuario: Admin</small>
                </div>
            </nav>
        `;
    }
});