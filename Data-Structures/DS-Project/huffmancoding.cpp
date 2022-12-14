/**
 * The function takes a string as input and builds a Huffman tree for the string
 *
 * @return the number of times the character appears in the string.
 */
#include <bits/stdc++.h>
using namespace std;

// Node for each letter
class Node
{
public:
    char letter;
    int freq;
    Node *leftChild;
    Node *rightChild;
    Node(char ch, int frequency, Node *l, Node *r)
    {
        letter = ch;
        freq = frequency;
        leftChild = l;
        rightChild = r;
    }
};

// Priority Queue to store alphabet nodes in accordance with frequency
Node *priorityQueue[1000];
int elementCount = 0;

Node *top()
{
    return priorityQueue[elementCount - 1];
}

bool isEmpty()
{
    return elementCount == 0;
}

int size()
{
    return elementCount;
}

void push(Node *data)
{
    int i = 0;
    // if queue is empty, push the data
    if (elementCount == 0)
    {
        priorityQueue[elementCount++] = data;
    }
    else
    {
        // start from the right end of the queue
        for (i = elementCount - 1; i >= 0; i--)
        {
            // if data is larger, shift existing item to right end
            if (data->freq > priorityQueue[i]->freq)
            {
                priorityQueue[i + 1] = priorityQueue[i];
            }
            else
            {
                break;
            }
        }
        // push the data
        priorityQueue[i + 1] = data;
        elementCount++;
    }
}

Node *pop()
{
    return priorityQueue[--elementCount];
}

// Check whether node is a leafNode
bool isLeaf(Node *root)
{
    return root->leftChild == nullptr && root->rightChild == nullptr;
}

// Encoding the alphabets
void encode(Node *root, string build, map<char, string> &huffmanCode)
{
    if (root == nullptr)
    {
        return;
    }
    if (isLeaf(root))
    {
        huffmanCode[root->letter] = (build != "") ? build : "1";
    }
    encode(root->leftChild, build + "0", huffmanCode);
    encode(root->rightChild, build + "1", huffmanCode);
}

// Decoding the encoded string
void decode(Node *root, int &index, string str)
{
    if (root == nullptr)
    {
        return;
    }
    if (isLeaf(root))
    {
        cout << root->letter;
        return;
    }
    index++;
    if (str[index] == '0')
    {
        decode(root->leftChild, index, str);
    }
    else
    {
        decode(root->rightChild, index, str);
    }
}

void buildHuffmanTree(string input)
{
    if (input == "")
    {
        return;
    }
    map<char, int> letter_freq;
    for (char ch : input)
    {
        letter_freq[ch]++;
    }
    // creating leaf nodes, adding char and freq
    for (auto pair : letter_freq)
    {
        Node *newNode = new Node(pair.first, pair.second, nullptr, nullptr);
        push(newNode);
    }
    while (size() != 1)
    {
        // remove 2 nodes of highest priority
        Node *leftChild = pop();
        Node *rightChild = pop();
        int sum = leftChild->freq + rightChild->freq;
        Node *newNode2 = new Node('\0', sum, leftChild, rightChild);
        push(newNode2);
    }
    Node *root = top();
    // Store code of each alphabet in map
    map<char, string> huffmanCode;
    encode(root, "", huffmanCode);
    cout << "\nHuffman Codes are:\n";
    for (auto pair : huffmanCode)
    {
        cout << pair.first << "  =>\t" << pair.second << endl;
    }
    cout << "\nThe original string is: " << input << endl;
    // Print encoded string
    string str;
    for (char ch : input)
    {
        str += huffmanCode[ch];
    }
    cout << "The encoded string is: " << str << endl;
    cout << "The decoded string is: ";
    if (isLeaf(root))
    {
        // Special case: For input like a, aa, aaa, etc.
        while (root->freq--)
        {
            cout << root->letter;
        }
    }
    else
    {
        // decode the encoded string
        int index = -1;
        while (index < (int)str.size() - 1)
        {
            decode(root, index, str);
        }
    }
}

int main()
{
    // string input = "Huffman coding is a data compression algorithm.";
    string input;
    cout << "Enter a string: ";
    getline(cin, input);
    buildHuffmanTree(input);
    return 0;
}