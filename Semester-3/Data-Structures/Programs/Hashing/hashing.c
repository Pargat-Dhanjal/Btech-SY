/**
 * The function insert() inserts a key-value pair into the hash table. 
 * 
 * The function delete() deletes a key-value pair from the hash table. 
 * 
 * The function find() returns the value of a key-value pair from the hash table. 
 * 
 * The function main() is the driver function.
 * 
 * @param key The key to be inserted.
 * @param V The value to be inserted.
 */
#include <stdio.h>
#include <stdlib.h>

struct HashNode
{
    int key;
    int value;
};

const int capacity = 20;
int size = 0;

struct HashNode **arr;
struct HashNode *dummy;
void insert(int key, int V)
{

    struct HashNode *temp = (struct HashNode *)malloc(sizeof(struct HashNode));
    temp->key = key;
    temp->value = V;

    int hashIndex = key % capacity;

    while (arr[hashIndex] != NULL && arr[hashIndex]->key != key && arr[hashIndex]->key != -1)
    {
        hashIndex++;
        hashIndex %= capacity;
    }

    if (arr[hashIndex] == NULL || arr[hashIndex]->key == -1)
        size++;

    arr[hashIndex] = temp;
}

int delete (int key)
{
    int hashIndex = key % capacity;

    while (arr[hashIndex] != NULL)
    {
        if (arr[hashIndex]->key == key)
        {
            arr[hashIndex] = dummy;

            size--;

            return 1;
        }
        hashIndex++;
        hashIndex %= capacity;
    }

    return 0;
}
int find(int key)
{

    int hashIndex = (key % capacity);

    int counter = 0;

    while (arr[hashIndex] != NULL)
    {

        int counter = 0;
        if (counter++ > capacity)
            break;

        if (arr[hashIndex]->key == key)
            return arr[hashIndex]->value;

        hashIndex++;
        hashIndex %= capacity;
    }
    return -1;
}

int main()
{
    arr = (struct HashNode **)malloc(sizeof(struct HashNode *) * capacity);
    for (int i = 0; i < capacity; i++)
        arr[i] = NULL;

    dummy = (struct HashNode *)malloc(sizeof(struct HashNode));

    dummy->key = -1;
    dummy->value = -1;

    insert(1, 5);
    insert(2, 15);
    insert(3, 20);
    insert(4, 7);

    if (find(4) != -1)
        printf("Value of Key 4 = %d\n", find(4));
    else
        printf("Key 4 does not exists\n");

    if (delete (4))
        printf("Node value of key 4 is deleted successfully\n");
    else
        printf("Key does not exists\n");

    if (find(4) != -1)
        printf("Value of Key 4 = %d\n", find(4));
    else
        printf("Key 4 does not exists\n");
}
