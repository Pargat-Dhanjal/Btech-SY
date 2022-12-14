def encrypt(msg, key):
    arr = [['\n' for i in range(key)]for j in range(len(msg))]
    dir = True
    j = 0
    for i in range(len(msg)):
        arr[i][j] = msg[i]
        if (j == key-1):
            dir = False
        elif (j == 0):
            dir = True
        if (dir):
            j += 1
        else:
            j -= 1
    eMsg = ''
    for j in range(key):
        for i in range(len(msg)):
            if (arr[i][j] != '\n'):
                eMsg += arr[i][j]
    return eMsg


def decrypt(eMsg, key):
    arr = [['\n' for i in range(key)]for j in range(len(eMsg))]
    dir = True
    j = 0
    for i in range(len(eMsg)):
        arr[i][j] = '#'
        if j == 0:
            dir = True
        elif j == key-1:
            dir = False
        if dir:
            j += 1
        else:
            j -= 1
    msg = ''
    pos = 0
    for j in range(key):
        for i in range(len(eMsg)):
            if (arr[i][j] == '#'):
                arr[i][j] = eMsg[pos]
                pos += 1

    j = 0
    for i in range(len(eMsg)):
        msg += arr[i][j]
        if (j == 0):
            dir = True
        elif (j == key-1):
            dir = False
        if (dir):
            j += 1
        else:
            j -= 1
    return msg
print('''Select an Option
      (1) Encrypt Using Rail Fence Cipher
      (2) Decrypt Using Rail Fence Cipher
      (3) Exit''')
n = input()
msg = input('Enter Message: ')
key = int(input('Enter Key: '))
if (n == '1'):
    print("Encrypted Message:", encrypt(msg, key))
elif (n == '2'):
    pass
    print("Decrypted Message:", decrypt(msg, key))
else:
    print("Quitting application")