import math

def eSorting(key, seq):
    sortedKey = ''.join(sorted(key))
    for i in range(len(key)):
        seq.append(key.find(sortedKey[i]))

def dSorting(key, seq):
    sortedKey = ''.join(sorted(key))
    for i in range(len(key)):
        seq.append(sortedKey.find(key[i]))

def encrypt(msg, key):
    x = int(len(key))  # No of columns
    y = int(math.ceil((len(msg)/len(key))))  # No of rows
    arr = [['\n' for i in range(x)]for j in range(y)]
    padding = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    pos, pPos = 0, 0
    for i in range(y):
        for j in range(x):
            try:
                arr[i][j] = msg[pos]
                pos += 1
            except:
                arr[i][j] = padding[pPos]
                pPos += 1
    seq = []
    eSorting(key, seq)
    eMsg = ''
    for i in seq:
        for j in range(y):
            eMsg += arr[j][i]
    return eMsg


def decrypt(msg, key):
    x = int(len(key))  # No of columns
    y = int(math.ceil((len(msg)/len(key))))  # No of rows
    arr = [['\n' for i in range(x)]for j in range(y)]
    pos = 0
    for i in range(x):
        for j in range(y):
            arr[j][i] = msg[pos]
            pos += 1
    seq = []
    dSorting(key, seq)
    dMsg = ''
    for i in range(y):
        for j in seq:
            dMsg += arr[i][j]
    return dMsg


print('''Select an Option
      (1) Encrypt Using Columnar Cipher
      (2) Decrypt Using Columnar Cipher
      (3) Exit''')
n = input()
msg = input('Enter Message: ').upper()
key = input('Enter Keyword: ').upper()
if (n == '1'):
    try:
        print("Encrypted Message:", encrypt(msg, key))
    except:
        print("The Give Message cannot be encrypted using the given key")
elif (n == '2'):
    try:
        print("Decrypted Message:", decrypt(msg, key))
    except:
        print("The Give Message cannot be decrypted using the given key")
else:
    print("Quitting application")
