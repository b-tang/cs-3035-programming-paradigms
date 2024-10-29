#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct student
{
    char name[10];
    int id;
    double gpa;
};

char name[10]; 
int id;  

void show_student(struct student *curr, int index);      
int search_by_name(struct student *students, int length);
int search_by_id(struct student *students, int length);

void show_student(struct student *curr, int index)
{
    printf("%s has id %d and gpa %.2f", curr[index].name, curr[index].id, curr[index].gpa);
}

int search_by_name(struct student *students, int length)
{
    for (int i = 0; i < length; i++)
    {
        if (strcmp(students[i].name, name) == 0)
            return i;
    }
    return -1;
}

int search_by_id(struct student *students, int length)
{
    for (int i = 0; i < length; i++)
    {
        if (students[i].id == id)
            return i;
    }
    return -1;
}

int main(void)
{
    int index, length = 4;
    char option; 

    int (*search_by_name_ptr)(struct student *, int) = &search_by_name;
    int (*search_by_id_ptr)(struct student *, int) = &search_by_id;

    struct student *students = (struct student *)malloc(length * sizeof(struct student));

    strcpy(students[0].name, "Fred");
    students[0].id = 1;
    students[0].gpa = 2.23;
    strcpy(students[1].name, "Wilma");
    students[1].id = 2;
    students[1].gpa = 3.65;
    strcpy(students[2].name, "Brian");
    students[2].id = 3;
    students[2].gpa = 3.96;
    strcpy(students[3].name, "John");
    students[3].id = 4;
    students[3].gpa = 3.85;

    printf("Enter n for search by name or i for search by ID:\n");
    option = getchar(); 
    switch (option)
    {
        case 'n':
            printf("Enter the name to search for:\n");
            scanf("%9s", &name);
            index = (*search_by_name_ptr)(students, length);
            if (index != -1)
                show_student(students, index);
            else
                printf("Not found");
            break;

        case 'i':
            printf("Enter the id to search for:\n");
            scanf("%d", &id);
            index = (*search_by_id_ptr)(students, length);
            if (index != -1)
                show_student(students, index);
            else
                printf("Not found");
            break;

        default:
            break;
    }
    return 0;
}