lado1 = float(input("Introduce el primer lado "))
lado2 = float(input("Introduce el segundo lado "))
lado3 = float(input("Introduce el tercero lado "))
if (lado1 + lado2) > lado3 and (lado3 + lado1) > lado2 and (lado2 + lado3) > lado1:
        if (lado1 == lado2) and (lado1 == lado3) and (lado2 == lado3):
            print("Es un triangulo equilátero")
        elif (lado1 == lado2) or (lado1 == lado3) or (lado2 == lado3):
            print("Es un triangulo isósceles")
        else:
            print("Es un triangulo escaleno")
               
else:
    print("No se peude formar un triangulo con esos lados")
        
