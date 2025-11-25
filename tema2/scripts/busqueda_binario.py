def busqueda_binario(numeros,eleccion):
    izq = 0
    der = len(numeros) - 1
    medio = 0
    while izq <= der:
        medio = (izq + der) // 2
        if numeros[medio] == eleccion:
            return medio
        elif numeros[medio] < eleccion:
            izq = medio + 1
        else:
            der = medio - 1
    return -1
