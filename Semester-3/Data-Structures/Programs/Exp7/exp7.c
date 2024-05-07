#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *left;
    struct node *right;
} * tree;
void create_tree(struct node *tree)
{
    tree = NULL;
}
struct node *insert_element(struct node *tree, int val)
{
    struct node *ptr, *nodeptr, *parentptr;
    ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = val;
    ptr->left = NULL;
    ptr->right = NULL;
    if (tree == NULL)
    {
        tree = ptr;
        tree->left = NULL;
        tree->right = NULL;
    }
    else if (val == tree->data)
    {
        printf("The value already exists in the tree you cannot insert the same value again enter a different value of the element\n");
    }
    else
    {
        parentptr = NULL;
        nodeptr = tree;
        while (nodeptr != NULL)
        {
            parentptr = nodeptr;
            if (val < nodeptr->data)
            {
                nodeptr = nodeptr->left;
            }
            else
            {
                nodeptr = nodeptr->right;
            }
        }
        if (val < parentptr->data)
        {
            parentptr->left = ptr;
        }
        else
        {
            parentptr->right = ptr;
        }
    }
    return tree;
}
void preorderTraversal(struct node *tree)
{
    if (tree != NULL)
    {
        printf("%d ", tree->data);
        preorderTraversal(tree->left);
        preorderTraversal(tree->right);
    }
}
void inordeTraversal(struct node *tree)
{
    if (tree != NULL)
    {
        inordeTraversal(tree->left);
        printf("%d\t", tree->data);
        inordeTraversal(tree->right);
    }
}
void postorderTraversal(struct node *tree)
{
    if (tree != NULL)
    {
        postorderTraversal(tree->left);
        postorderTraversal(tree->right);
        printf("%d\t", tree->data);
    }
}
struct node *del_element(struct node *tree, int val)
{
    struct node *ptr, *parent, *cur, *suc, *psuc;
    if (tree == NULL)
    {
        printf("\nThe tree is empty");
        return (tree);
    }
    parent = tree;
    cur = tree->left;
    while (cur != NULL && val != cur->data)
    {
        parent = cur;
        cur = (val < cur->data) ? cur->left : cur->right;
    }
    if (cur == NULL)
    {
        printf("\n The value to be deleted is not present in the tree");
        return (tree);
    }
    if (cur->left == NULL)
    {
        ptr = cur->right;
    }
    else if (cur->right == NULL)
    {
        ptr = cur->left;
    }
    else
    {
        psuc = cur;
        cur = cur->right;
        while (suc->left != NULL)
        {
            psuc = suc;
            suc = suc->left;
        }
        if (cur == psuc)
        {
            suc->left = cur->left;
        }
        else
        {
            suc->left = cur->left;
            psuc->left = suc->right;
            suc->right = cur->right;
        }
        ptr = suc;
    }
    if (parent->left == cur)
    {
        parent->left = ptr;
    }
    else
    {
        parent->right = ptr;
    }
    free(cur);
    return tree;
}
struct node *search_element(struct node *tree, int val)
{
    if (tree == NULL)
    {
        printf("The binary search tree is empty");
    }
    else
    {
        if (tree->data == val)
        {
            printf("The element is present in the tree");
            return tree;
        }
        else
        {
            if (val < tree->data)
            {
                search_element(tree->left, val);
            }
            else
            {
                search_element(tree->right, val);
            }
        }
    }
}
int main()
{
    int choice, val, n;
    create_tree(tree); printf("************************Binary Search Tree***************************\n");
while(1){
        printf("\nEnter the number in front the operation to perform it\n");
        printf("1.Create a binary search tree\n");
        printf("2. Insert element\n");
        printf("3. Delete element\n");
        printf("4. Preorder traversal\n");
        printf("5. Inorder traversal\n");
        printf("6. Postorder traversal\n");
        printf("7. Search element\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("\nEnter the number of elements you want to insert in the binary search tree\n");
            scanf("%d", &n);
            for (int i = 1; i <= n; i++)
            {
                printf("Enter the value of the element you want to insert in the binary search tree:");
                scanf("%d", &val);
                tree = insert_element(tree, val);
            }
            break;
        case 2:
            printf("Enter the value of the element you want to insert in the binary search tree:");
            scanf("%d", &val);
            tree = insert_element(tree, val);
            break;
        case 3:
            printf("Enter the value of the element you want to delete from the binary search tree:");
            scanf("%d", &val);
            tree = del_element(tree, val);
            break;
        case 4:
            printf("The elements in th tree are:");
            preorderTraversal(tree);
            break;
        case 5:
            printf("The elements in th tree are:");
            inordeTraversal(tree);
            break;
        case 6:
            printf("The elements in th tree are:");
            postorderTraversal(tree);
            break;
        case 7:
            printf("Enter the value of the element you want to search in the binary search tree:");
            scanf("%d", &val);
            tree = search_element(tree, val);
            break;
        case 8:
            printf("\nExiting the program");
            exit(1);
            break;
        default:
            printf("\nInvalid choice");
            exit(1);
            break;
        } }
}