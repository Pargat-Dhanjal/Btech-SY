def shift(msg,key):
    eMsg=''
    for i in msg:
        ascii=int(ord(i))+key
        if(i==' '):
            ascii=ord(' ')
        elif ascii<65:
            ascii=90-(65%ascii-1)
        elif ascii>90:
            ascii=65+(ascii%90-1)
        eMsg+=chr(ascii)
    return eMsg            

print('''Select an Option
      (1) Encrypt Using Columnar Fence Cipher
      (2) Decrypt Using Columnar Fence Cipher
      (3) Exit''')
n = input()
msg = input('Enter Message: ').upper()
key = int(input('Enter Shift: '))
if (n == '1'):
    try:
        print("Encrypted Message:", shift(msg, key))
    except:
        print("The Give Message cannot be encrypted using the given key")
elif (n == '2'):
    try:
        print("Decrypted Message:", shift(msg, -key))
    except:
        print("The Give Message cannot be decrypted using the given key")
else:
    print("Quitting application")
