m = [[1,2,3],[4,5,6],[7,8,9]]
m2 = [[0,0,0],[0,0,0],[0,0,0]]
for i in range(len(m)):
    for j in range(len(m[i])):
        if m[i][j] % 2 == 0:
            m2[i][j] = m[i][j]
            m[i][j] = 0
        else:
            m2[i][j] = 0

print("M:")
for fila in m:
    print(fila)

print("\nM2:")
for fila in m2:
    print(fila)  