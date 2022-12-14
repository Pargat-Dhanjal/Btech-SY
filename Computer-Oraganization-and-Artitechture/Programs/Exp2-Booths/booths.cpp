#include <stdio.h>
#include <math.h>

void print(int q)
{
    for (int i = 20; i >= 0; i--)
    {
        if (i == 10 || i == 0)
            printf(" ");
        if ((q & (1 << i)))
            printf("1 ");
        else
            printf("0 ");
    }
    printf("\n");
}

int main()
{
    int m, q, minusm, flag1 = 1, flag2 = 1;
    scanf("%d%d", &m, &q);

    if (m < 0)
    {
        m = (((1 << 11) - 1) ^ abs(m)) + 1;
        flag1 = -1;
    }
    if (q < 0)
    {
        q = (((1 << 10) - 1) ^ abs(q)) + 1;
        flag2 = -1;
    }

    minusm = (((1 << 11) - 1) ^ m) + 1;
    q <<= 1;

    for (int i = 0; i < 10; i++)
    {
        print(q);
        printf("\n");
        //  Case = 01
        if (q % 4 == 1)
            q += minusm * (1 << 11);
        // Case = 10
        else if (q % 4 == 2)
            q += m * (1 << 11);

        print(q);
        q >>= 1;
        q %= (1 << 21);

        if ((q & (1 << 20)))
            q += 1 << 21;
    }

    q >>= 1;
    print(q);

    if (q & (1 << 20))
        q = (((1 << 21) - 1) ^ q) + 1;

    printf("Answer: %d", flag1 * flag2 * q);
}