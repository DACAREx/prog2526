matriz = [
    ["A", "B", "C"],
    ["D", "E", "F"],
    ["G", "H", "I"]
]
i = 0  
j = 0 
while i < len(matriz):  
    print(f"{matriz[i][j]}",end=" ")  
    j = j + 1  
    if j == len(matriz[i]):  
        j = 0  
        i = i + 1 
print()        
print("El elemento central es ",matriz[1][1])
matriz[1][1]="X"
print("El nuevo elemento central es ",matriz[1][1])