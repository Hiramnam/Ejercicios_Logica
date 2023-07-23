function calcularFactorial(numero) {

    if (numero === 0 || numero === 1) {
      return 1;
    } else {

      return numero * calcularFactorial(numero - 1);
    }
  }
  
  
  function obtenerNumeroYFactorial() {
    let inputNumero = prompt("Ingrese una cifra ingresada  para calcular su factorial:");
  

    const numero = parseInt(inputNumero);
  

    if (isNaN(numero)) {
      console.log("La cifra ingresada  no es un número válido. Por favor, intenta otra vez.");
      return;
    }
  

    const factorial = calcularFactorial(numero);
  

    console.log(factorial);
  }
  

  obtenerNumeroYFactorial();
  