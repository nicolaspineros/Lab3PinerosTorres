# Laboratorio 3 Registraduria

## Casos de Equivalencia punto 1

1. La edad debe ser positiva y menor a 150.
2. El numero de identificacion debe ser positivo.
3. Debe estar vivo para ser un votante valido y tener una edad valida.
4. Debe ser mayor de edad, menor a 150 y estar vivo para poder votar.
5. Que no haya sido registrado previamente como valido.

## Ejercicio descuento de tarifas

### Clases de Equivalencia 
| Numero | Clase de Equivalencia | Resultado Correcto / Incorrecto |
| --- | --- | --- |
| 1 | Tarifa invalida por valor negativo o magnitud exagerada | 1000 / -200 |
| 2 | Dias de antelacion invalidos negativos o de magnitud exagerada, y que se cumpla Clase1 | 25 / 237618 |
| 3 | Edad invalida negativa o de magnitud exagerada, y se cumpla Clase1 y Clase 2 | 20 / -20 |

### Limites y Fronteras 

1. 10000000 < tarifa < 0 , caso de prueba = -500 
2. 1000 < dias < 0 , caso de prueba = 50000
3. 150 < edad < 0, caso de prueba = -20

Los test con los casos de prueba se corrieron pero la logica del CalculoTarifa no tiene en cuenta los limites o fronteras señalados anteriormente 
