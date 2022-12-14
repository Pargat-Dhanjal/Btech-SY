#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int bi[11], f[23], sign[1], expo[8], frac[23];
int expo1[11], fract[52];
int m = 0, fl = 0, i;
// to convert decimal to binary
void binary(int n)
{
    while (n > 0)
    {
        bi[m] = n % 2;
        n = n / 2;
        m++;
    }
}
// to convert floating decimal to binary
void floating(float x)
{
    for (i = 0; i < 23; i++)
    {
        x = x * 2;
        f[i] = (int)x;
        x = x - f[i];
    }
}
// for finding single and double precision
void precision(int num)
{
    int e, ee, ee1, k = 0, j = 0, l, r = 0;

    while (m != 0)
    {
        if (bi[m] == 1)
        {
            e = m;
            ee = m + 127;
            ee1 = m + 1023;
            printf("\nSingle precision:\nBiased exponent:%d\n", ee);
            printf("\nDouble precision:\nBiased exponent:%d\n", ee1);

            while (ee1 > 0)
            {
                expo1[r] = ee1 % 2;
                ee1 = ee1 / 2;
                r++;
            }

            printf("\n");
            printf("%d.", bi[m]);
            m--;
            for (i = m; i >= 0; i--)
            {
                frac[k] = bi[i];
                fract[k] = bi[i];
                printf("%d", frac[k]);
                k++;
            }
            for (i = 0; i < 10; i++)
            {
                frac[k] = f[i];
                fract[k] = f[i];
                printf("%d", frac[k]);
                k++;
            }
            printf(" x 2^%d", e);
            printf("\n");
            if (num > 0)
                sign[0] = 0;
            else
                sign[0] = 1;
            while (ee > 0)
            {
                expo[j] = ee % 2;
                ee = ee / 2;
                j++;
            }
            // Display
            printf("\nSingle bit precision:\n");
            printf("\nSign bit     Exponent\t \t \t        Mantissa\n");
            printf("%d", sign[0]);
            printf("\t\t\t");
            for (i = j; i >= 0; i--)
                printf("%d", expo[i]);
            printf("\t\t\t");
            for (i = 0; i < 23; i++)
                printf("%d", frac[i]);
            printf("\n");
            // Display
            printf("\nDouble bit precision:\n");
            printf("\nSign bit     Exponent\t \t \t        Mantissa\n");
            printf("%d", sign[0]);
            printf("\t\t\t");
            for (i = r; i >= 0; i--)
                printf("%d", expo1[i]);
            printf("\t\t\t");
            for (i = 0; i < 52; i++)
                printf("%d", fract[i]);
            break;
        }
        else
            m--;
    }
}

int main(void)
{
    float num, x;
    int n;
    printf("Enter the no.: ");
    scanf("%f", &num);
    n = (int)fabs(num);
    x = fabs(num) - n;
    binary(n);
    floating(x);
    printf("\nIEEE Representation:\n");
    precision(num);
    return 0;
}
