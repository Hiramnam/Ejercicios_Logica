// Función para convertir la temperatura de grados Celsius a grados Fahrenheit y Kelvin
function convertirTemperatura(temperaturaCelsius) {
    // Verificar si el valor ingresado es un número válido
    if (isNaN(temperaturaCelsius)) {
      console.log("El valor ingresado no es un número válido. Por favor, intenta de nuevo.");
      return;
    }
  
    const temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
    const temperaturaKelvin = temperaturaCelsius + 273.15;
  
    console.log(`Grados Fahrenheit: ${temperaturaFahrenheit}`);
    console.log(`Grados Kelvin: ${temperaturaKelvin}`);
  }
  
  
  function obtenerTemperatura() {
    let inputTemperatura = prompt("Ingrese la temperatura en grados Celsius:");
  
    const temperaturaCelsius = parseFloat(inputTemperatura);
  
    convertirTemperatura(temperaturaCelsius);
  }
  
  obtenerTemperatura();
  