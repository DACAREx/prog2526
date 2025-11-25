def comparar(palabra1, palabra2):
    if len(palabra1) != len(palabra2):
        return False
    else:
        for i in range(len(palabra1)):
            if palabra1[i].lower() != palabra2[i].lower():
                return False
        return True


array1 = ['h', 'o', 'L', 'A']
array2 = ['H', 'o', 'L', 'A']
array3 = ['h', 'o', 'l', 'a']

solucion = comparar(array1, array2)
if solucion:
    solucion2 = comparar(array2, array3)
    if solucion2:
        print("Sí, estas listas son iguales.")
    else:
        print("No, estas listas no son iguales.")
else:
    print("No, estas listas no son iguales.")
