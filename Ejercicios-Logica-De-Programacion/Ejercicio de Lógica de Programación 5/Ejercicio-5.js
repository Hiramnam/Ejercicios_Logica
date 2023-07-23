
function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
  }
  

  function adivinarNumeroSecreto(numeroSecreto) {
    const numerosIngresados = [];
  
    while (true) {
      let inputNumero = prompt("Ingresa una cifra del 1 al 100 para adivinar el número secreto:");
  

      const numeroIngresado = parseInt(inputNumero);
  

      if (isNaN(numeroIngresado) || numeroIngresado < 1 || numeroIngresado > 100) {
        console.log("La cifra ingresada  no es un número válido entre 1 y 100. Por favor, intenta de nuevo.");
        continue;
      }
  

      numerosIngresados.push(numeroIngresado);
  

      if (numeroIngresado === numeroSecreto) {
        console.log("Felicidades, adivinaste el número secreto.");
        console.log("Números introducidos antes de adivinar el número secreto: " + numerosIngresados.join(', '));
        break;
      } else {
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
      }
    }
  }
  

  const numeroSecreto = generarNumeroSecreto();
  

  adivinarNumeroSecreto(numeroSecreto);
  