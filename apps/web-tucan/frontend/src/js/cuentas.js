/* Archivo: js/cuentas.js */

document.addEventListener("DOMContentLoaded", async () => {
    const container = document.querySelector('.accounts-list');
    
    try {
        // Llamamos a la API que creamos en Java
        const response = await fetch('/api/cuentas');
        
        if (response.ok) {
            const cuentas = await response.json();
            
            // Limpiamos el contenido estático que había antes
            container.innerHTML = '';

            // Recorremos la lista de cuentas que nos mandó Java
            cuentas.forEach(cuenta => {
                const card = document.createElement('div');
                card.className = 'account-card';
                
                card.innerHTML = `
                    <h3>${cuenta.tipo}</h3>
                    <p class="iban" style="font-family: monospace; color: #666;">${cuenta.iban}</p>
                    <p class="balance">${cuenta.saldo}</p>
                `;
                
                container.appendChild(card);
            });
        } else {
            container.innerHTML = '<p>Error al cargar tus cuentas. Inténtalo más tarde.</p>';
        }
    } catch (error) {
        console.error("Error conectando al backend:", error);
        container.innerHTML = '<p>No se pudo conectar con el servidor.</p>';
    }
});