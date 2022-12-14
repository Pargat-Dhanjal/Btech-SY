import math
keyspace="ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-=_+"
def publicKey(p,q):
    temp=(p-1)*(q-1)
    for i in range(temp-1,2,-1):
        if(math.gcd(temp,i)==1):
            return i
        
def privateKey(e,phin):
    for d in range(1,phin):
        if((d*e)%phin==1):
            return d

p=int(input("Enter value of p (Prime number): "))
q=int(input("Enter value of q (Prime number): "))
n=p*q
phin=(p-1)*(q-1)
e=publicKey(p,q)
print("Public key <e,n> = <%d,%d> "%(e,n))
d=privateKey(e,phin)
print("Private key <d,n> = <%d,%d> "%(d,n))
plaintext=input("Enter plain text: ")
print("Encrypted text: ",end="")
encTxt=[]
for i in plaintext:
    x=int(keyspace.find(i))
    encTxt.append(((x+2)**e)%n)
print(encTxt)
decTxt=""
for i in encTxt:
    decTxt+=keyspace[((i**d)%n)-2]
print(decTxt)