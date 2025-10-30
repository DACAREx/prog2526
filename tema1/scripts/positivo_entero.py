# Función para convertir un número negativo a positivo y redondearlo a entero
def convertir_y_redondear(numero):
    # Convertir el número a positivo y redondear al número entero más cercano
    return round(abs(numero))

numero_negativo = int(input("Introduce un numero negativo: ")
resultado = convertir_y_redondear(numero_negativo)

print(f"El número negativo {numero_negativo} convertido a positivo y redondeado es: {resultado}")
