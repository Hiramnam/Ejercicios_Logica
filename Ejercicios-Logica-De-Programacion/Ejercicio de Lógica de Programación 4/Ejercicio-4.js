function calcularFibonacci(cantidad) {
    let fibonacciSerie = [0, 1];
  
    
    for (let i = 2; i < cantidad; i++) {
      const nextNumber = fibonacciSerie[i - 1] + fibonacciSerie[i - 2];
      fibonacciSerie.push(nextNumber);
    }
  
    return fibonacciSerie;
  }
  
  function obtenerCantidadYFibonacci() {
    let inputCantidad = prompt("Ingrese la cifra de números de la serie de Fibonacci:");
  
    const cantidad = parseInt(inputCantidad);
  
    if (isNaN(cantidad)) {
      console.log("La cifra ingresada  no es un número válido. Por favor, intenta de nuevo.");
      return;
    }
  
    const fibonacciSerie = calcularFibonacci(cantidad);
  
    console.log(fibonacciSerie.join(', '));
  }
  
  obtenerCantidadYFibonacci();
  