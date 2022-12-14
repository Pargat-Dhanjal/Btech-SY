from random import random


def primeRootModulo(g, p):
    li = []
    for i in range(1, p):
        li.append(pow(g, i) % p)
    li.sort()
    print(li)
    for i in range(1, p):
        if not (li[i-1] == i):
            return False
    return True


def isprime(p):
    for i in range(2, (p//2)+1):
        if (p % i == 0):
            return False
    return True


def calculate(g, p, a):
    print("g ^ a mod p :", end=" ")
    print(g, "^", a, "mod", p, "")
    return pow(g, a) % p


g = int(input(">> Enter g : "))
p = int(input(">> Enter p a prime number : "))
a = int(input(">> Enter a for Person 1 : "))
b = int(input(">> Enter b for Person 2 :"))
mim=input(">> Do you want to display Man In the Middle? (y/n) : ")
if not (isprime(p) and a < p and b < p):
    print(">> The numbers selected are not applicable")
else:
    if(mim.lower()=='n'):
        print("\n>> For person 1 :\n")
        x = calculate(g, p, a)
        print("X :", x)
        print("\n>> For person 2 :\n")
        y = calculate(g, p, b)
        print("Y :", y)
        print("\n>> For person 1 :\n")
        key1 = calculate(y, p, a)
        print("Key for Person 1:", key1)
        print("\n>> For person 2 :\n")
        key2 = calculate(x, p, b)
        print("Key for Person 2:", key2)
    else:
        print("\n>> For person 1 :\n")
        x = calculate(g, p, a)
        print("X :", x)
        # For attacker
        print("\n>> For Attacker :\n")
        g1=int(input("Enter g1 for attacker: "))
        p1=int(input("Enter p1 for attacker: "))
        c=int(input("Enter c for attacker: "))
        d=int(input("Enter d for attacker: "))
        x1 = calculate(g, p, c)
        print("X1 :", x1)
        
        y1=calculate(g1, p1, d)
        print("Y1 :", x1)
        # Person 2
        print("\n>> For person 2 :\n")
        y = calculate(g, p1, b)
        print("Y :", y)
        
        # Stage 2
        print("\n>> For person 1 :\n")
        key1 = calculate(x1, p, a)
        print("Key1 :", key1)
        # For attacker
        print("\n>> For Attacker :\n")
        keya1 = calculate(x, p, c)
        print("\nKey1 Attacker :", keya1)
        keya2=calculate(y, p1, d)
        print("\nKey2 Attacker :", keya2)
        # Person 2
        print("\n>> For person 2 :\n")
        key2 = calculate(y1, p1, b)
        print("Key2 :", key2)
