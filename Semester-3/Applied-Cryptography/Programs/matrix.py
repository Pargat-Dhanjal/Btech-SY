arr = [['\n' for i in range(3)]for j in range(4)]
coun=1
for i in range(4):
    for j in range(3):
        arr[i][j]=coun
        coun+=1
        
print(arr)