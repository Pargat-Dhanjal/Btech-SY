#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// doubly linked list
struct node
{
  int data;
  struct node *next;
  struct node *prev;
};

struct node *front = NULL;
int isEmpty()
{
  if (front == NULL)
  {
    return 1;
  }
  return 0;
}
void insertend()
{
  int new_data;
  printf("Enter the data to be inserted: ");
  scanf("%d", &new_data);
  struct node *newnode = malloc(sizeof(struct node));
  struct node *ptr;
  newnode->data = new_data;
  newnode->prev = NULL;
  newnode->next = NULL;
  if (isEmpty() == 1)
  {
    front = newnode;
  }
  else
  {
    ptr = front;
    while (ptr->next != NULL)
    {
      ptr = ptr->next;
    }
    ptr->next = newnode;
    newnode->prev = ptr;
    newnode->next = NULL;
  }
}

void insertbegin()
{
  int new_data;
  printf("Enter the data to be inserted:");
  scanf("%d", &new_data);
  struct node *newnode = malloc(sizeof(struct node));
  newnode->data = new_data;
  newnode->prev = NULL;
  newnode->next = NULL;
  if (isEmpty() == 1)
  {
    front = newnode;
  }
  else
  {
    front->prev = newnode;
    newnode->next = front;
    front = newnode;
  }
}

void deletebegindoubly()
{
  struct node *temp;
  temp = front;
  temp = temp->next;
  if (isEmpty() == 1)
  {
    printf("The list is empty");
  }
  else
  {
    temp->prev = NULL;
  }
  free(temp);
}
void deleteenddoubly()
{
  struct node *temp;
  temp = front;
  while (temp->next != NULL)
  {
    temp = temp->next;
  }
  temp->next = NULL;
  temp->prev = NULL;
  free(temp);
}
void displaydoubly()
{
  struct node *ptr;
  if (front == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    ptr = front;
    printf("The list is: ");
    while (ptr != NULL)
    {
      printf("%d\t", ptr->data);
      ptr = ptr->next;
    }
  }
}
void searchdoub()
{
  int c;
  printf("Enter the element you want to search in the linked list:");
  scanf("%d", &c);
  struct node *p;
  p = front;
  int i = 1;
  while (p->data != c)
  {
    p = p->next;
    i++;
  }
  if (p->data == c)
  {
    printf("The position of the element %d in the list is: %d", p->data, i);
  }
  else
  {
    printf("The element is not in the list");
  }
}
// Circular linked list
struct Node
{
  int data1;
  struct Node *next;

} * list;

void insertbegincircular()
{
  int a;
  printf("Enter the data to be inserted: ");
  scanf("%d", &a);
  struct Node *p;
  struct Node *newnode1 = malloc(sizeof(struct Node));
  newnode1->data1 = a;
  if (list == NULL)
  {
    list = newnode1;
    newnode1->next = list;
  }
  else
  {
    p = list;
    while (p->next != list)
    {
      p = p->next;
    }
    p->next = newnode1;
    newnode1->next = list;
    list = newnode1;
  }
}
void inserAtendcircular()
{
  int b;
  struct Node *p, *q;
  printf("Enter the element you want to enter in the list:");
  scanf("%d", &b);
  p = (struct Node *)malloc(sizeof(struct Node));
  p->data1 = b;
  q = list;
  if (q == NULL)
  {
    list = p;
  }
  else
  {
    while (q->next != list)
    {
      q = q->next;
    }
    q->next = p;
  }
  p->next = list;
}
void deletebegincircular()
{
  struct Node *p;
  if (list == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    p = list;
    while (p->next != list)
    {
      p = p->next;
    }
    p->next = list->next;
    free(list);
    list = p->next;
  }
}
void deleteendcircular()
{
  struct Node *p, *q;
  if (list == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    p = list;
    while (p->next != list)
    {
      q = p;
      p = p->next;
    }
    q->next = p->next;
    free(p);
  }
}
void displaycircular()
{
  struct Node *p;
  if (list == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    p = list;
    printf("The list is: ");
    while (p->next != list)
    {
      printf("%d ", p->data1);
      p = p->next;
    }
    printf("%d", p->data1);
  }
}
void searchcirc()
{
  int h;
  printf("Enter the element you want to search in the linked list:");
  scanf("%d", &h);
  struct Node *p;
  p = list;
  int i = 1;
  while (p->data1 != h)
  {
    p = p->next;
    i++;
  }
  if (p->data1 == h)
  {
    printf("The position of the element %d in the list is: %d", p->data1, i);
  }
  else
  {
    printf("The element is not in the list");
  }
}

// Circular Doubly Linked List
struct Node1
{
  int data2;
  struct Node1 *next;
  struct Node1 *prev;

} * list1;
void insertbegincirdoub()
{
  int a;
  struct Node1 *newnode2 = malloc(sizeof(struct Node1));
  struct Node1 *ptr;
  printf("Enter the data to be inserted: ");
  scanf("%d", &a);
  newnode2->data2 = a;
  if (list1 == NULL)
  {
    list1 = newnode2;
    newnode2->next = list1;
  }
  else
  {
    ptr = list1;
    while (ptr->next != list1)
    {
      ptr = ptr->next;
    }
    newnode2->prev = ptr;
    ptr->next = newnode2;
    newnode2->next = list1;
    list1->prev = newnode2;
    list1 = newnode2;
  }
}
void insertAtendcirdoub()
{
  int b;
  struct Node1 *p, *q;
  printf("Enter the element you want to enter in the list:");
  scanf("%d", &b);
  p = (struct Node1 *)malloc(sizeof(struct Node1));
  p->data2 = b;
  if (list1 == NULL)
  {
    list1 = p;
  }
  else
  {
    q = list1;
    while (q->next != list1)
    {
      q = q->next;
    }
    q->next = p;
    p->prev = q;
    p->next = list1;
    list1->prev = p;
  }
}
void deletebegincirdoub()
{
  struct Node1 *p, *temp;
  if (list1 == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    p = list1;
    while (p->next != list1)
    {
      p = p->next;
    }
    p->next = list1->next;
    temp = list1;
    list1 = list1->next;
    list1->prev = p;
    free(temp);
  }
}
void deleteendcirdoub()
{
  struct Node1 *p, *q;
  if (list1 == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    p = list1;
    while (p->next != list1)
    {
      q = p;
      p = p->next;
    }
    q->next = p->next;
    p->next->prev = p;
    free(p);
  }
}
void displaycirdoub()
{
  struct Node1 *p;
  if (list1 == NULL)
  {
    printf("The list is empty");
  }
  else
  {
    p = list1;
    printf("The list is:");
    while (p->next != list1)
    {
      printf("%d\t", p->data2);
      p = p->next;
    }
    printf("%d", p->data2);
  }
}
void searchcircdoub()
{
  int l;
  printf("Enter the element you want to search in the linked list:");
  scanf("%d", &l);
  struct Node1 *p;
  p = list1;
  int i = 1;
  while (p->data2 != l)
  {
    p = p->next;
    i++;
  }
  if (p->data2 == l)
  {
    printf("The position of the element %d in the list is: %d", p->data2, i);
  }
  else
  {
    printf("The element is not in the list");
  }
}
int main()
{
  int x, y, z, k;
  while (1)
  {
    printf("\nWhich linked list you want to use?\n1.Doubly Linked List\n2.Circular Linked Linked\n3.Circular Doubly Linked List\n4.Exit\nEnter the number in front the type of linked list to use the linked list:");
    scanf("%d", &x);
    switch (x)
    {
    case 1:
      while (y != 8)
      {
        printf("\n**************Doubly Linked List**************\n");
        printf("\n1.Insert at the begin\n2.Insert at the end\n3.Delete at the begin\n4.Delete at the end\n5.Traverse\n6.Search\n7.Exit\n");
        printf("Enter the number in front of the operation in Doubly Linked List:");
        scanf("%d", &y);
        if (y == 1)
        {
          insertbegin();
        }
        else if (y == 2)
        {
          insertend();
        }
        else if (y == 3)
        {
          deletebegindoubly();
        }
        else if (y == 4)
        {
          deleteenddoubly();
        }
        else if (y == 5)
        {
          displaydoubly();
        }
        else if (y == 6)
        {
          searchdoub();
        }
        else if (y == 7)
        {
          break;
        }
        else
        {
          printf("Invalid option");
        }
      }
      break;
    case 2:
      while (z != 8)
      {
        printf("\n**************Circular Linked List**************\n");
        printf("\n1.Insert at the begin\n2.Insert at the end\n3.Delete at the begin\n4.Delete at the end\n5.Traverse\n6.Search\n7.Exit\n");
        printf("Enter the number in front of the operation in Circular Linked List:");
        scanf("%d", &z);
        if (z == 1)
        {
          insertbegincircular();
        }
        else if (z == 2)
        {
          inserAtendcircular();
        }
        else if (z == 3)
        {
          deletebegincircular();
        }
        else if (z == 4)
        {
          deleteendcircular();
        }
        else if (z == 5)
        {
          displaycircular();
        }
        else if (z == 6)
        {
          searchcirc();
        }
        else if (z == 7)
        {
          break;
        }
        else
        {
          printf("Invalid option");
        }
      }
      break;
    case 3:
      while (k != 8)
      {
        printf("\n**************Circular Doubly Linked List**************\n");
        printf("\n1.Insert at the begin\n2.Insert at the end\n3.Delete at the begin\n4.Delete at the end\n5.Traverse\n6.Search\n7.Exit\n");
        printf("Enter the number in front of the operation in Circular Doubly Linked List:");
        scanf("%d", &k);
        if (k == 1)
        {
          insertbegincirdoub();
        }
        else if (k == 2)
        {
          insertAtendcirdoub();
        }
        else if (k == 3)
        {
          deletebegincirdoub();
        }
        else if (k == 4)
        {
          deleteendcirdoub();
        }
        else if (k == 5)
        {
          displaycirdoub();
        }
        else if (k == 6)
        {
          searchcircdoub();
        }
        else if (k == 7)
        {
          break;
        }
        else
        {
          printf("Invalid option");
        }
      }
      break;
    case 4:
      printf("Exiting the program............");
      exit(1);
      break;
    default:
      printf("Invalid option");
      break;
    }
  }

  return 0;
}
