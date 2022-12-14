#include <stdio.h>
#include <stdlib.h>
#define TABLE_SIZE 16

int h[TABLE_SIZE] = {NULL};

void insert()
{

    int key, index, i, flag = 0, hkey;
    printf("\nenter a value to insert into hash table\n");
    scanf("%d", &key);
    hkey = key % TABLE_SIZE;
    for (i = 0; i < TABLE_SIZE; i++)
    {

        index = (hkey + i) % TABLE_SIZE;

        if (h[index] == NULL)
        {
            h[index] = key;
            break;
        }
    }

    if (i == TABLE_SIZE)

        printf("\nelement cannot be inserted\n");
}

void display()
{

    int i;

    printf("\nelements in the hash table are \n");

    for (i = 0; i < TABLE_SIZE; i++)

        printf("\nat index %d \t value =  %d", i, h[i]);
}
main()
{
    int opt, i;
    while (1)
    {
        printf("\nPress 1. Insert\t 2. Display \t3. Exit \n");
        scanf("%d", &opt);
        switch (opt)
        {
        case 1:
            insert();
            break;
        case 2:
            display();
            break;
        case 3:
            exit(0);
        }
    }
}
