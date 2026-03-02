/* Archivo: js/auth.js */

// --- LÓGICA DE PROTECCIÓN DE RUTAS ---
function verificarSesion() {
    // Si NO estamos en el index.html (es decir, estamos en una página interna)
    if (!window.location.pathname.endsWith('index.html') && window.location.pathname !== '/') {
        const usuario = localStorage.getItem('userName');
        
        if (!usuario) {
            // ¡No hay usuario! Al index de cabeza
            console.warn("Acceso no autorizado. Redirigiendo al login...");
            // Ajustamos la ruta según donde estemos
            window.location.href = '../index.html';
        }
    }
}

// Ejecutamos la verificación nada más cargar el script
verificarSesion();

// --- LÓGICA DE LOGIN (Lo que ya tenías) ---
const loginForm = document.getElementById('loginForm');
if (loginForm) {
    loginForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const user = document.getElementById('username').value;
        const pass = document.getElementById('password').value;
        const errorMsg = document.getElementById('error-msg');

        try {
            const response = await fetch('/api/login', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ username: user, password: pass })
            });

            if (response.ok) {
                const data = await response.json();
                // GUARDAMOS EL LOGIN
                localStorage.setItem('userName', data.nombre || user);
                window.location.href = 'pages/inicio.html';
            } else {
                errorMsg.classList.remove('hidden');
            }
        } catch (error) {
            console.error("Error:", error);
        }
    });
}

// --- LÓGICA DE LOGOUT ---
const logoutBtn = document.getElementById('logout-btn');
if (logoutBtn) {
    logoutBtn.addEventListener('click', () => {
        localStorage.removeItem('userName'); // Borramos el rastro
        window.location.href = '../index.html';
    });
}