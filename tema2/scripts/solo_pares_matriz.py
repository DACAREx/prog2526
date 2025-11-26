m = [[1,2,3],[4,5,6],[7,8,9]]
m2 = [[]]
for i in range(len(m)):
    for j in range(len(m[i])):
        if m[i][j] % 2 == 0:
            m2[i][j] = m[i][j]
        else:
            m2[i][j] = 0
print(m2)
