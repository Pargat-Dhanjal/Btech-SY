p=int(input("p: "))
a=int(input("a: "))
b=int(input("b: "))
xQ=int(input("x coordinate of Q: "))
yQ=int(input("y coordinate of Q: "))
xP=int(input("x coordinate of P: "))
yP=int(input("y coordinate of P: "))
i=1
num=0
den=0
xr=xP
yr=yP
while(i>0):
    if(i==1):
        num=(3*(xP**2)+a)
        den=(2*yP)
    else:
        num=yr-yP
        den=xr-xP
    if(den<0):
        num*=-1
        den*=-1
    den= den**(p-2) % p 
    l=(den*num)%p
    xr=((l**2)- xP - xr)%p
    yr=(l*(xP-xr)-yP)%p
    i+=1
    if(xr==xQ and yr==yQ):
        break
print(i)