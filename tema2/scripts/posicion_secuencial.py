def sequencial(y,x):
    i = 0
    while i < len(x):
        if x[i] == y:
           return i           
        i = i + 1       
    return -1

num = int(input("Introduce el numero del que desee saber su posicion: "))
desorden = [3, 2, 5, 6, 9, 12, -8, 0, 21, 7]
print(sequencial(num,desorden))
if sequencial == -1:
    print("Ese numero no se encuentra.")
else:
    print("El numero",num,"se encuentra en la posicion",sequencial)

