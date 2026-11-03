#include <stdio.h>
int *insert_last_item(int *arr, int num, int real_values, int array_capacity)
{
    if(real_values < array_capacity)
        arr[real_values] = num;
    else
        printf("array is full");
    return arr;
}

int *remove_last_item(int *arr, int real_values)
{
    if (real_values > 0)
        arr[real_values - 1] = 0;
    else
        printf("array is empty");
    return arr;
}

int *insert_item_at_middle(int *arr, int num, int index, int real_values, int array_capacity)
{
    int i = real_values;
    if (real_values < array_capacity)
    {
        while (i > index)
        {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[index] = num;
    }
    else
    {
        printf("error inserting the number");
    }

}

int *remove_item_at_middle(int *arr, int index, int real_values)
{
    int i = index;
    if (index < real_values && index >= 0)
    {
        while(i < real_values){
            arr[i] = arr[i + 1];
            i++;
        }
    }
    else
    {
        printf("error removing the item from the array");
    }
    return arr;
}

int main(void)
{
    int arr[10] = {1, 2, 3, 4, 5, 6};
    int i = 0;
    printf("\nbefore any changes\n");
    while(i < 10)
    {
        printf("%d ", arr[i]);
        i++;
    }
    i=0;
    printf("\nadding at the end\n");
    insert_last_item(arr, 7, 6, 10);
    while(i < 10)
    {
        printf("%d ", arr[i]);
        i++;
    }
    printf("\nremove at the end\n");
    i = 0;
    remove_last_item(arr, 7);
    while(i < 10)
    {
        printf("%d ", arr[i]);
        i++;
    }
    printf("\ninsert at the middle\n");
    i = 0;
    insert_item_at_middle(arr, 8, 4, 6, 10);
    while(i < 10)
    {
        printf("%d ", arr[i]);
        i++;
    }
    printf("\nremove at the middle\n");

    i = 0;
    remove_item_at_middle(arr, 4, 7);
    while(i < 10)
    {
        printf("%d ", arr[i]);
        i++;
    }
    printf("\n");
    return 0;
}