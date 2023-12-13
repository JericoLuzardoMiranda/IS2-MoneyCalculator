# Conversor de Monedas - Aplicación MVC

¡Bienvenido a la aplicación Conversor de Monedas! Ahora puedes realizar conversiones de moneda de manera sencilla y rápida.

## Descripción

Este programa de conversión de monedas es una aplicación diseñada siguiendo el estilo arquitectónico Modelo-Vista-Controlador (MVC). El objetivo es facilitar a los usuarios proporcionando la herramienta que permita realizar conversiones de diferentes tipos de monedas.

## Diagrama de Clases

Se representa la estructura del Conversor de Monedas, destacando las relaciones y responsabilidades de cada componente.

![MoneyCalculator-UML-Diagram](https://github.com/JericoLuzardoMiranda/IS2-MoneyCalculator/blob/0e8de0c3563c9f525bc99db353f8a737d1d41ba4/MoneyCalculator-UML-Diagram.jpg)

### Comentarios

1. **Clase 'Modelo':** Se encarga de manejar las tasas de cambio y realizar las conversiones.
2. **Clase 'Vista':** Es la interfaz de usuario que muestra la información al usuario y recoge la entrada del mismo.
3. **Clase 'Controlador':** Es el intermediario entre el modelo y la vista.

## Capturas de Interfaz

A continuación, se muestran capturas de pantalla de la interfaz de usuario del Conversor de Monedas, destacando estas siguientes versiones:

1. **Versión 1 - Cargador de Divisas desde un archivo:**

   ![screenshot1](https://github.com/JericoLuzardoMiranda/IS2-MoneyCalculator/blob/0e8de0c3563c9f525bc99db353f8a737d1d41ba4/screenshot/screenshot1.png)

   Se entiende cómo se ve la salida en la consola cuando se ejecuta el cargador de divisas desde un archivo TSV.

2. **Version 2 - Conversión de Monedas**

   ![screenshot2](https://github.com/JericoLuzardoMiranda/IS2-MoneyCalculator/blob/0e8de0c3563c9f525bc99db353f8a737d1d41ba4/screenshot/screenshot2.png)

   Se muestra la introducción de la cantidad y la selección de una divisa.

   ![screenshot3](https://github.com/JericoLuzardoMiranda/IS2-MoneyCalculator/blob/0e8de0c3563c9f525bc99db353f8a737d1d41ba4/screenshot/screenshot3.png)

   Después de ingresar la cantidad y seleccionar la divisa.

   ![screenshot4](https://github.com/JericoLuzardoMiranda/IS2-MoneyCalculator/blob/0e8de0c3563c9f525bc99db353f8a737d1d41ba4/screenshot/screenshot4.png)

   Se presenta el resultado de la conversión mostrando el equivalente en la divisa seleccionada.
