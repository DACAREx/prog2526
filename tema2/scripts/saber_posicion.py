num = input("Introduce el numero del que desee saber su posicion ")
desorden = [3,2,5,6,9,12,-8,0,21,7]
i = 0
while i < len(desorden):
    if desorden[i] == num:
        print("El",num,"esta en la posicion",i,)
    else:
        i = i + 1
