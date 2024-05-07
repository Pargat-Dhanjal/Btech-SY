p=int(input("Enter p: "))
a=int(input("Enter a: "))
b=int(input("Enter b: "))
xQ=int(input("Enter x coordinate of Q: "))
yQ=int(input("Enter y coordinate of Q: "))
xP=int(input("Enter x coordinate of P: "))
yP=int(input("Enter y coordinate of P: "))
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
    den= den**(p-2) % p #multiplicative inverse
    l=(den*num)%p
    xr=((l**2)- xP - xr)%p
    yr=(l*(xP-xr)-yP)%p
    print("%dP = (%d,%d)" %(i,xr,yr))
    i+=1
    if(xr==xQ and yr==yQ):
        break
print(i)