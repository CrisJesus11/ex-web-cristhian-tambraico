#language: es

@test
Característica: Calculadora

  Escenario: Sumar dos numeros
    Dado que me encuentro en la pagina de BasicCalculator
    Cuando ingreso los numeros numero1 : "2" Y numero2: "3" y opcion: "Add"
    Entonces valido que el resultado sea "5"


  Escenario: Restar dos numeros
    Dado que me encuentro en la pagina de BasicCalculator
    Cuando ingreso los numeros numero1 : "7" Y numero2: "2" y opcion: "Subtract"
    Entonces valido que el resultado sea "5"

  Escenario: Multiplicar dos numeros
    Dado que me encuentro en la pagina de BasicCalculator
    Cuando ingreso los numeros numero1 : "7" Y numero2: "2" y opcion: "Multiply"
    Entonces valido que el resultado sea "14"

  Escenario: Dividir dos numeros
    Dado que me encuentro en la pagina de BasicCalculator
    Cuando ingreso los numeros numero1 : "10" Y numero2: "5" y opcion: "Divide"
    Entonces valido que el resultado sea "2"

  Escenario: Concatena dos numeros
    Dado que me encuentro en la pagina de BasicCalculator
    Cuando ingreso los numeros numero1 : "7" Y numero2: "2" y opcion: "Concatenate"
    Entonces valido que el resultado sea "72"